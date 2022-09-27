
//838. Push Dominoes

class Solution {
     public String pushDominoes(String s) {
        int n = s.length();
        char[] arr = new char[n + 2];
        arr[0] = 'L';
        arr[n + 1] = 'R';
        for(int i = 0; i < n; i++)
            arr[i + 1] = s.charAt(i);

        int i = 0;
        int j = 1;
        while(j < arr.length) {
            while(arr[j] == '.')
                j++;
            
            if(j - i > 1) {
                solveConfig(arr, i, j);
            }
            i = j;
            j++;
        }

        // String res = "";
        // for(int k = 1; k < arr.length - 1; k++) {
        //     res += arr[k];
        // }
        // return res;

        StringBuilder str = new StringBuilder();
        for(int k = 1; k < arr.length - 1; k++) {
            str.append(arr[k]);
        }
        return str.toString();
    }
        private void solveConfig(char[] arr, int i, int j) {
        if(arr[i] == 'L' && arr[j] == 'L') {
            for(int k = i + 1; k < j; k++)
                arr[k] = 'L';
        } else if(arr[i] == 'R' && arr[j] == 'R') {
            for(int k = i + 1; k < j; k++)
                arr[k] = 'R';
        } else if(arr[i] == 'L' && arr[j] == 'R') {
            // nothing to do
        } else {
            int left = i + 1;
            int right = j - 1;
            while(left < right) {
                arr[left] = 'R';
                arr[right] = 'L';

                left++;
                right--;
            }
        }
    }
}