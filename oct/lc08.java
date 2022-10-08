/// 16. 3Sum Closest

class Solution {
    public int threeSumClosest(int[] n, int target) {
     
        Arrays.sort(n);
        int nearest_sum = n[0] + n[1] + n[2];
        if (n.length == 3) {
            return nearest_sum;
        }
        for (int i = 0 ; i < n.length - 2 ; i++) {
         int l = i + 1;
         int r = n.length - 1;
            while(l < r) {
                int tempSum  = n[i] + n[l] + n[r];        
                if (Math.abs(nearest_sum - target) > Math.abs(tempSum - target)) {
                    nearest_sum = tempSum;
                }
                
                  if (tempSum == target) {
                    return tempSum;
                }
                if (target < tempSum){
                     r = r - 1;
                } else {
                    l = l + 1;
                }
            }
        }
         return nearest_sum;
    }
}