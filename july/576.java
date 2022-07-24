 
 class Solution {
 private  int M = 1000000007;
  private Long [][][] memo  ;
     
  public int findPaths(int m, int n, int N, int i, int j) {
   memo = new Long [m+1][n+1][N + 1];
    ///  m X n matrix , N taoal moves , i start row , j start col  
      // for (long[][] dp : memo)
      //       for (long[] d : dp)
      //           Arrays.fill(d, -1);
    return (int) findPaths1(m, n, N, i, j );
  }

  public long findPaths1(int m, int n, int N, int i, int j) {
      
       if (N < 0) return 0;
    if (i == m || j == n || i < 0 || j < 0) return 1;
    
    // if (memo[i][j][N] != -1 ) 
    //     return memo[i][j][N] ;
        if (memo[i][j][N] != null ) 
        return memo[i][j][N] ;
    
      long total = 0;
      
            long u = findPaths1(m,n,N-1,i-1 ,j);

            long d = findPaths1(m,n,N-1,i+1 ,j);

            long r= findPaths1(m,n,N-1,i ,j-1);

            long l = findPaths1(m,n,N-1,i ,j+1);
total = ((u+d+r+l) % M);
       memo[i][j][N] = total; // x y n
      //   if(memo[i][j][N] == 0)
      // System.out.println(i+" "+j+" "+N);
    return total;
  }
}




//   public long findPathsMemoHelper(int m, int n, int maxMove, int row, int col) {


//     if (maxMove < 0) {
//       return 0;
//     }

//     // boundary condition
//     if (row == m || col == n || row < 0 || col <0) {
//       return 1;
//     }


//     if (memo[row][col][maxMove] != null)
//       return memo[row][col][maxMove];

//     long total = 0;
//     long left_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col - 1);
//     long right_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col + 1);
//     long up_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row - 1, col);
//     long down_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row + 1, col);

//     total =  (( left_maxMoveReduced + right_maxMoveReduced + down_maxMoveReduced + up_maxMoveReduced) % mod);
//     memo[row][col][maxMove] = total;
//     return total;
//   }
// }



/// bhaiya 
// class Solution {
//     int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
//     int mod = (int) 1e9 + 7;

//     public int findPaths(int n, int m, int K, int sr, int sc, int[][][] dp) {
//         if (sr < 0 || sc < 0 || sr == n || sc == m) {
//             return 1;
//         }

//         if (K == 0)
//             return 0;

//         if (dp[sr][sc][K] != -1)
//             return dp[sr][sc][K];
//         int count = 0;

//         for (int[] d : dir) {
//             int r = sr + d[0];
//             int c = sc + d[1];

//             count = (count + findPaths(n, m, K - 1, r, c, dp)) % mod;

//         }

//         return dp[sr][sc][K] = count;
//     }

//     public int findPaths(int n, int m, int k, int r, int c) {
//         int[][][] dpp = new int[n + 1][m + 1][k + 1];
//         for (int[][] dp : dpp)
//             for (int[] d : dp)
//                 Arrays.fill(d, -1);

//         return findPaths(n, m, k, r, c, dpp);
//     }
// }
 