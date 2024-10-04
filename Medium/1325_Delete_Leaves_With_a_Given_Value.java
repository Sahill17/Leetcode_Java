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
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        /* Using Depth First Search approach to reach leaves. */
        if(root.left != null){
            root.left = removeLeafNodes(root.left,target);
        }
        if(root.right != null){
            root.right = removeLeafNodes(root.right,target);
        }

        /* If leaf reached, delete by returning "null" to the parent's pointer to the current leaf instead of node. */
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        return root;
    }
}