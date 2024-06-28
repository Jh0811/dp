class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int res [] = {0,0};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0;i<row;i++){
            int count =0;
            for(int j=0;j<col;j++){
                count+=mat[i][j];
            }
            if(count > res[1]){
                res[0] = i;
                res[1] = count;
            }
        }
        return res;
    }
}