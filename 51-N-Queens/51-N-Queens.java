// Last updated: 10/7/2025, 7:24:42 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nqueen(board,0,n,ans);
        return ans;
    }
    public void nqueen(char[][]board,int row,int n,List<List<String>>ans){
        if(row==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
            if(issafe(board,row,col,n)){
                board[row][col]='Q';
                nqueen(board,row+1,n,ans);
                board[row][col]='.';
            }
        }
    }
    public boolean issafe(char[][]board,int row,int col,int n){
        //horizantal 
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }

            // right diagonal
            for(int i=row,j=col;i>=0&&j<n;i--,j++){
                    if(board[i][j]=='Q'){
                        return false;
                    }
            }
            return true;
    }
}