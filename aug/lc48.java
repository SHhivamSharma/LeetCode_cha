class Solution {
    // public static void transpose(int [][] matrix){
    //     for(int i = 0 ; i <matrix.length ;i++){
    //         for(int j = 0 ; j<i ; j++){
    //             int temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp ;
    //         }
    //     }
    // }
    
       
    public static void reverse (int [][] matrix ){
                    

        for(int i = 0 ; i <matrix.length ; i++){
             int s= 0;
            int l = matrix.length -1;
                    
            while(s < l){
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][l];
                matrix[i][l] = temp ;
                s++;
                l--;
             
        } }
    }
    public void rotate(int[][] matrix) {
       transpose(matrix);
                 reverse(matrix);

//         for(int r = 0 ; r <matrix.length; r++){
//             int left = 0 ;
//             int right = matrix[0].length -1 ;
//             while(left <right){
//                 int temp = matrix[r][left];
//                 matrix[r][left] =matrix[r][right];
//                 matrix[r][right] = temp;
//                 left++;
//                 right--;
                
//             }
//         }
     }
//         ///// F1S 
        public static void transpose(int[][] matrix) {
     for(int i = 0 ; i<matrix.length ; i++){
        for(int j = 0 ; j < i ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
  } 
}
        //////// F1E
