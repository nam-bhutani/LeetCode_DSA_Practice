class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int [][] res=new int[n][n];
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                res[sr][i]=k++;
            }
            for(int i=sr+1;i<=er;i++){
                res[i][ec]=k++;
            }
            for(int i=ec-1;i>=sc;i--){
                res[er][i]=k++;
            }
            for(int i=er-1;i>=sr+1;i--){
                res[i][sc]=k++;
            }
            sc++;sr++;
            er--;
            ec--;
        }
        return res;
    }
}