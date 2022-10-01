/// 91. Decode Ways


class Solution {
     public int numDecodings_memo(String s, int n, int[] dp) {
        if (n == 0) {
            return dp[n] = 1;
        }

        if (dp[n - 1] != -1)
            return dp[n];

        int count = 0;
        if (s.charAt(n - 1) > '0')
            count += numDecodings_memo(s, n - 1, dp);

        if (n > 1) {
            int num = (s.charAt(n - 2) - '0') * 10 + (s.charAt(n - 1) - '0');
            if (num <= 26 && num >= 10)
                count += numDecodings_memo(s, n - 2, dp);
        }

        return dp[n] = count;
    }
 
 
 
 public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
 

int ans = numDecodings_memo(s,n,dp);

return ans;
}
                                            }