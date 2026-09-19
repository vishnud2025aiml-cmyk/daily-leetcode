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
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return create(nums,0,nums.length-1);
        
    }

    public TreeNode create(int[] nums,int l,int r){
        if(l>r){
            return null;
        }

        int index=l;
        int max=0;
        for(int i=l;i<=r;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }

        TreeNode root=new TreeNode(max);
        root.left=create(nums,l,index-1);
        root.right=create(nums,index+1,r);
        return root;

    }
    
}