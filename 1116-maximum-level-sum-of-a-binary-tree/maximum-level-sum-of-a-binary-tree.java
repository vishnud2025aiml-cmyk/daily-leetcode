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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int level=1;
        int l=1;
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            int total=0;
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
            if(max<total){
                max=total;
                level=l;
            }
            l++;
        }

        return level;

    }
}