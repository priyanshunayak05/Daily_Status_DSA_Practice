// Last updated: 10/4/2025, 3:26:32 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(search(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][]board,int i,int j,int idx,String wrd){
        if(idx==wrd.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length) return false;
        
        if(board[i][j]!=wrd.charAt(idx)){
            return false;
        }

        char temp=board[i][j];

        board[i][j]='#';

        boolean full =(search(board ,i,j+1,idx+1,wrd) || search(board,i,j-1,idx+1,wrd) ||search(board ,i+1,j,idx+1,wrd) ||search(board ,i-1,j,idx+1,wrd));

        board[i][j]=temp;
        return full;
    }
}