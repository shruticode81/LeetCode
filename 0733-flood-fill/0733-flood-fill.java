class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initalColor = image[sr][sc];
        if(initalColor == color){
            return image;
        }
        dfs(image, sr,sc,color,initalColor);
        return image;
    }
    void dfs(int[][] image, int i, int j, int color, int initalColor){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=initalColor){
            return;
        }
        image[i][j] = color;
        dfs(image, i, j+1, color, initalColor);
        dfs(image, i, j-1, color, initalColor);
        dfs(image, i+1, j, color, initalColor);
        dfs(image, i-1, j, color, initalColor);

    }
}