/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();

        if(root==null){
            return 0;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            long total=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                total+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            res.add(total);
        }

        Collections.sort(res);
        
        if(res.size()<k){
            return -1;
        }

        return res.get(res.size()-k);

    }
}