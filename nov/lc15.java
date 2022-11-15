///222. Count Complete Tree Nodes

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
    static int count;
    public static void solve(TreeNode root){
        if(root==null)
            return;
        ++count;
        solve(root.left);
        solve(root.right);
    }
    public int countNodes(TreeNode root) {
        count = 0;
        if(root==null) return count;
        solve(root);
        return count;
    }
}