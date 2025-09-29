// Last updated: 9/29/2025, 7:17:31 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0;
        int er=m-1;
        int sc=0;
        int ec=n-1;
        ArrayList<Integer>ans=new ArrayList<>();

        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){
                ans.add(matrix[i][ec]);
            }
            for(int i=ec-1;i>=sc;i--){
                if(sr==er){
                    break;
                }
                ans.add(matrix[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                ans.add(matrix[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return ans;
    }
}