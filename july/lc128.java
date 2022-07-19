class Solution {
  public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> row , pre = null ;
      for(int i = 0 ; i<numRows ; i++){
          row = new ArrayList<Integer> ();
          for(int j = 0 ; j<= i ; j++){
              // first and last element p 1  hona chiya
              if(j == 0 || j == i){
                  row.add(1);}
          else {
              row.add(pre.get(j-1) + pre.get(j)); } }
          pre = row;
          ans.add(row);
      }
      return ans;
        // List<List<Integer>> all=new ArrayList<>();
        // int[][] C=new int[31][31];
        // for(int i=0; i<numRows; i++){
        //     List<Integer> row=new ArrayList<Integer>();
        //     for(int j=0; j<=i; j++){
        //         if(i==j || j==0){
        //             C[i][j]=1;
        //         } else {
        //             C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
        //         }
        //         row.add(C[i][j]);
        //     }
        //     all.add(row);
        // }
        // return all;
 }}