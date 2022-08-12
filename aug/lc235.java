class Solution {
 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	// Base Case
        if (root == null) {
            return null;
        } else if (p.val < root.val && q.val < root.val) { // if current root value is greater than both p and q value that means root is in left of current root
            return lowestCommonAncestor(root.left, p, q); 
        } else if (p.val > root.val && q.val > root.val) { // if current root value is lesser than both p and q value that means root is in right of current root
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root; // if root value is between both left and right of the root then we got the least common ancestor
        }
    }
}