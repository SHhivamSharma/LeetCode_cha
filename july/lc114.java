class Solution {
    public TreeNode flattenHelper(TreeNode root, TreeNode prev) {
        // base case
        if (root == null)
            return prev;
        
        // hypothesis step
        TreeNode right = flattenHelper(root.right, prev);
		// for left subtree prev would be the node that we get from the right subtree recursion
        TreeNode left = flattenHelper(root.left, right);
        
        // induction step
        root.right = left;
        root.left = null;
        
        return root;
    }
    
    public void flatten(TreeNode root) {
        flattenHelper(root, null);
    }
}