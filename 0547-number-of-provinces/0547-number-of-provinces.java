import java.util.*;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        // convert adj matrix into adj list
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<ArrayList<Integer>>();

        int v = isConnected.length;
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(visited[i] == false){
                bfs(i,adjList,visited);
                count++;
            }
        }
        return count;
    }
    void bfs(int sv, ArrayList<ArrayList<Integer>> adjList, boolean visited[]){
        visited[sv]=true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(sv);
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v: adjList.get(u)){
                if(visited[v] == false){
                    visited[v]=true;
                    q.add(v);
                }
            }

        }
    }
}