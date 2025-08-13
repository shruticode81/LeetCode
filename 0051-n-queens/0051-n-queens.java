class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        solveDFS(0, board, res);
        return res;
    }

    boolean validate(char[][] board, int row, int col){
        int tempRow = row;
        int tempCol = col;
        // upper daigonal
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row=tempRow;
        col=tempCol;
        // left
        while(col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        //lower left daigonal
        row=tempRow;
        col=tempCol;
        while(row<board.length && col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }

    List<String> construct(char[][] board){
        List<String> ans = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }

    void solveDFS(int col, char[][] board, List<List<String>> res){
        // base cond
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row=0; row<board.length; row++){
            if(validate(board, row, col)){
                board[row][col]='Q';
                solveDFS(col+1, board, res);
                board[row][col]='.';
            }
        }

    }
}