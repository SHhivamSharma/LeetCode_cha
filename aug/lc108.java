public TreeNode sortedArrayToBST(int[] nums) {
        return addNode(nums, 0, nums.length - 1);
    }

    public TreeNode addNode(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int middleIndex = left + ((right - left) / 2);
        TreeNode tree = new TreeNode(nums[middleIndex]);
        tree.left = addNode(nums, left, middleIndex - 1);
        tree.right = addNode(nums, middleIndex + 1, right);
        return tree;
    }