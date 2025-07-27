class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        //in place rotation, 1st transpose the matrix then reverse the row
        // 1step transpose the matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n; j++){
                //swap
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        //reverse each row
        for(int i=0;i<n;i++){
            int start = 0;
            int end=n-1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         ans[j][n-i-1] = matrix[i][j]; 
        //     }
        // }
    }
}