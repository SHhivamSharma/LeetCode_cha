/// 1155. Number of Dice Rolls With Target Sum

class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n][target+1];
        for(int val[]:dp){
            Arrays.fill(val,-1);
        }
        return recursion(0,n,k,target,dp);
    }
    static int mod=1000000007;
    static int recursion(int idx,int n,int k,int tar,int dp[][]){
        if(idx==n){
            if(tar==0){
                return 1;
            }
            return 0;
        }
        if(tar<0) return 0;
        if(tar==0 && idx<n) return 0;
        if(dp[idx][tar]!=-1) return dp[idx][tar];
        int count=0;
        for(int i=1;i<=k;i++){
            count=((count)%mod+(recursion(idx+1,n,k,tar-i,dp))%mod)%mod;
        }
        dp[idx][tar]=count;
        return count;
    }
}