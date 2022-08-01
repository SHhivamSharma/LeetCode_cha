class Solution 
{
    public int uniquePaths(int m, int n)
    {
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
            dp[i][0]=1;
        
        for(int i=0;i<n;i++)
            dp[0][i]=1;
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
//// sol 2
// class Solution {
//     public static ArrayList<String> getmazepath(int sr , int sc , int dr , int dc){
          
        
        
//             if( sr == dr && sc == dc ){
//               ArrayList<String> bc = new ArrayList <>();
//             bc.add("");
//             return bc;
//         }
//         ArrayList<String> hpaths = new ArrayList <>(); 
//          ArrayList<String> vpaths = new ArrayList <>();
//         if(sc < dc){
//            hpaths=getmazepath(sr,sc+1,dr,dc);
//         }
          
//          if(sr < dr){
//            vpaths=getmazepath(sr+1,sc,dr,dc);
//         }
//       ArrayList<String> paths = new ArrayList <> ();
        
//         for(String hpath :hpaths){
//             paths.add("h"+hpath);
//         }
//         for(String vpath :vpaths){
//             paths.add("v"+vpath);
//         }
//           return paths;
//     }
    
                

    
    
//     public int uniquePaths(int m, int n) {
//       if (m < n) {
//             return uniquePaths(n, m);
//         }
//       int p = m - 1;
//         int q = n - 1;
        
//         long res = 1;
//         long from1ToQ = 1;

//         for (long curFactor = p + 1; curFactor <= p + q; curFactor++) {
//             res *= curFactor;
//             res /= from1ToQ;
//             from1ToQ++;
//         }
            
//         return (int) res;
        
//     }
// } 