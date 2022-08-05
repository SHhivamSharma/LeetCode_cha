class Solution {
      public int dymProg(int[] nums, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;
        int curr_target = 0;
        while(++curr_target <= target){
            for(int num: nums){
                if(curr_target-num >=0)
                    dp[curr_target]+=dp[curr_target-num];
            }
        }
        return dp[target];
    }
    public int combinationSum4(int[] nums, int target) {
        return dymProg(nums, target);
    }
}