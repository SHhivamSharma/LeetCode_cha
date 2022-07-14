class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      Queue <TreeNode> q = new LinkedList <TreeNode>();
      List<List<Integer>> list = new LinkedList <List<Integer>>();
      if(root == null)
        return list;
      
      q.offer(root);
      while(!q.isEmpty()) {
        int num = q.size();
        List<Integer> subList = new LinkedList<Integer>();
        for(int i = 0; i < num; i ++) {
          if(q.peek().left != null)
            q.offer(q.peek().left);
           if(q.peek().right != null)
            q.offer(q.peek().right);
          subList.add(q.poll().val);
        }
        list.add(subList);
      }
      return list;
    }
}
//
 public List<List<Integer>> levelOrder(TreeNode root) {
      LinkedList <TreeNode> q = new LinkedList < >();
      List<List<Integer>> list = new LinkedList <List<Integer>>();
      if(root == null)
        return list;
      
      q.addLast(root);
        while(q.size() != 0){
            int size = q.size();
             List<Integer> subList = new LinkedList<Integer>();
            // subList.add(q.getFirst().val);
            // list.add(subList);
            while( size -- >0){
              // List<Integer> subList = new LinkedList<Integer>();
            subList.add(q.getFirst().val);
               TreeNode rn = q.removeFirst();
                if(rn.left != null){
                    q.addLast(rn.left);
                }
                if(rn.right != null){
                    q.addLast(rn.right);
                } 
                
            }       list.add(subList);      


        }