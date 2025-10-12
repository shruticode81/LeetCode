import java.util.*;
class Pair{
    int row;
    int col;
    int time;
    Pair(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[m][n];
        int freshCount=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }

        int minTime=0;
        int rottenCount=0;
        int[] dx = {+1, -1, 0 , 0};
        int[] dy = {0, 0, +1, -1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int time = curr.time;
             minTime = Math.max(minTime, time);
            for(int i=0;i<4;i++){
                int nrow = row+dx[i];
                int ncol = col+dy[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol] == 0 && grid[nrow][ncol]==1){
                    visited[nrow][ncol]=2;
                    q.add(new Pair(nrow, ncol, time+1));
                    rottenCount++;
                }
            }
        }
        if(freshCount!=rottenCount) return -1;
        return minTime;
    }
}