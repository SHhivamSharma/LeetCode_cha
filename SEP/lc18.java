//42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int flow = 0;
        int water = 0;
        int max = height[0];
        int maxIndx = 0;

        for(int i = 1; i < height.length; i++) {
            int ht = height[i];
            if(max <= ht) {
                water += flow;
                flow = 0;
                max = ht;
                maxIndx = i;
            } else {
                flow += (max - ht);
            }
        }

        // solve the overflow of flow value
        flow = 0;
        max = height[height.length - 1];
        for(int i = height.length - 2; i >= maxIndx; i--) {
            int ht = height[i];
            if(max <= ht) {
                water += flow;
                flow = 0;
                max = ht;
            } else {
                flow += (max - ht);
            }
        }
        return water;
        
    }
}