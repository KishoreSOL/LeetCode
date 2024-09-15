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
    public TreeNode help(int i, int j,int[] nums){
        if(i>j){
            return null;
        }
        if(i==j){
            TreeNode node=new TreeNode(nums[i],null,null);
            return node;
        }

        int mid = (int) Math.ceil((double)(j + i) / 2);

        TreeNode left=help(i,mid-1,nums);
        TreeNode right=help(mid+1,j,nums);

        TreeNode node=new TreeNode(nums[mid],left,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(0,nums.length-1,nums);
    }
}