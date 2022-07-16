class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList <TreeNode> q = new LinkedList < >();
      List<List<Integer>> list = new LinkedList <List<Integer>>();
      if(root == null)
        return list;
      
       q.addLast(root);
        while(q.size() != 0){
                 
            int size = q.size();
             List<Integer> subList = new LinkedList<Integer>();
                 //  subList.add(q.getFirst().val);

            while( size -- >0){
             subList.add(q.getFirst().val);
               TreeNode rn = q.removeFirst();
                if(rn.left != null){
                    q.addLast(rn.left);
                }
                if(rn.right != null){
                    q.addLast(rn.right);
                } 
                
            }    
            list.add(0,subList);      
     }
       
      return list;
    }
}