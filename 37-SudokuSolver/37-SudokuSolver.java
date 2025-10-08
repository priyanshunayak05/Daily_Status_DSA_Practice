// Last updated: 10/8/2025, 11:20:08 AM
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
    boolean solve(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(check(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }
    boolean check(char board[][],int r,int c,char ch){
        for(int i=0;i<9;i++){
            if(board[r][i]==ch) return false;
            if(board[i][c]==ch) return false;
        }

        int sr=r/3*3;
        int sc=c/3*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
}