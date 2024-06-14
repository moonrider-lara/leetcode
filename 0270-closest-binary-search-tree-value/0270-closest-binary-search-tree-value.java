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
    public int closestValue(TreeNode root, double target) {
        int closestValue = root.val;

        while (root != null) {
            int curr = root.val;
            if (Math.abs(curr - target) < Math.abs(closestValue - target)) {
                closestValue = curr;
            } else if (Math.abs(curr - target) == Math.abs(closestValue - target)) {
                closestValue = Math.min(curr, closestValue);
            }

            root = target < root.val ? root.left : root.right;
        }

        return closestValue;
    }
}