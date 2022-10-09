///653. Two Sum IV - Input is a BST

class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int flag=0;
    public boolean findTarget(TreeNode root, int k) {
        dfs(root,0,k);
        return flag == 1? true : false;
    }
    
    public void dfs(TreeNode root,int curr, int k) {
        if(root==null)
            return;
        
        if(map.containsKey(k-root.val)) {
            flag=1;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        // System.out.println(root.val + " " + flag + " " + (k-root.val));
        dfs(root.left,curr,k);
        dfs(root.right,curr,k);
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)
}