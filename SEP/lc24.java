///113. Path Sum II

class Solution {
    List<List<Integer>> ans;
    List<Integer> lis;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        lis=new ArrayList<>();
        sum(root,targetSum);
        return ans;
    }
    public void sum(TreeNode root,int t)
    {
        if(root==null)return ;
        lis.add(root.val);
        t=t-root.val;
        if(t==0&&root.left==null&&root.right==null)
        {
            ans.add(new ArrayList(lis));
            return ;
        }
        sum(root.left,t);
        //System.out.print(lis.get(lis.size()-1)+" "+ t+" ");
        if(root.left!=null)
        lis.remove(lis.size()-1);
        sum(root.right,t);
        if(root.right!=null)
        lis.remove(lis.size()-1);
        return;
    }
}