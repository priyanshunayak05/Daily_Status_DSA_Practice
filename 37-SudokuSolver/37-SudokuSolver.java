// Last updated: 10/8/2025, 11:55:33 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char ch=board[i][j];
            if(ch !='.'){
                board[i][j]='.';
                if(!check(board,i,j,ch)){
                    return false;
                }
              
            }
                
            }
            
        }
        return true;
    }
    boolean check(char[][]board,int r,int c,char ch){
        //row
        for(int i=0;i<9;i++){
            if(board[r][i]==ch) return false;
        }
        //col
        for(int i=0;i<9;i++){
            if(board[i][c]==ch) return false;

        }
        //3*3 matrix
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