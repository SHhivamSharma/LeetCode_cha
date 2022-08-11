public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long l, long h) {
        if (node == null) { // Base Case
            return true;
        }
		// intially head can be anything between -inf to +inf
		//after head left node should be l to previous head node value and right node should be head node value to h
        return node.val > l && node.val < h && isValid(node.left, l, node.val) && isValid(node.right, node.val, h);
    }