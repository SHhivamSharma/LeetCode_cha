class Solution {
    public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];
      int maxlen = 0; 
        for(int i = 0;i<n;i++){ 
            dp[i] = 1; 
            for(int j = i - 1; j>=0;j--){
                if(nums[i]>nums[j]){ 
                    dp[i] = Math.max(dp[i], dp[j] + 1); 
                }
              }
        maxlen = Math.max(maxlen, dp[i]);

       } 

   return maxlen;
    }
}

// class Solution {
//     Integer mem[];
    
//     public int lengthOfLIS(int[] nums) {
//         if(nums.length == 0) return 0;
        
//         mem = new Integer[nums.length];
        
//         int temp = 0;
        
//         for(int i = 0; i < nums.length; i++)
//         {
//             temp = Math.max(temp, checkSeq(nums, i));
//         }
//         return temp;        
//     }
    
//     private int checkSeq(int[] nums, int start) {
//         if(start == nums.length) return 0;
//         if(mem[start] != null) return mem[start];
//         mem[start] = 1;
//         for(int i = start; i < nums.length; i++)
//         {
//             if(nums[i] > nums[start])
//             {
//                 mem[start] = Math.max(mem[start], 1 + checkSeq(nums, i));
//             }
//         }
//         return mem[start];
//     }
// }