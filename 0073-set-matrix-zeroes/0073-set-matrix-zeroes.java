class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean fr=false, fc=false;
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++){
                if (matrix[i][j] == 0) {
                    if (i==0) fr=true;
                    if (j==0) fc=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                if(matrix[i][0] == 0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }
        if (fr) {
            for(int j=0;j<column;j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i=0;i<row;i++) {
                matrix[i][0]=0;
            }
        }

        // int rowIndex = new arr[row];
        // rowIndexCount=0;
        // int colIndex = new arr[column] 
        // colIndexCount=0;
        // for(int i=0;i<row;i++) {
        //     for(int j=0;j<column;j++) {
        //         if (matrix[i][j] == 0) {
        //             rowIndex[rowIndexCount]= i;
        //             colIndex[colIndexCount]=j;
        //             rowIndexCount++;
        //             colIndexCount++;
        //         }
        //     }
        // }

        
    }
}