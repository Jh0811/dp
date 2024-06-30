class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int [] onesRow = new int[m];
        int [] oneCol = new int[n];

        Arrays.fill(onesRow,0);
        Arrays.fill(oneCol,0);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                onesRow[i] +=grid[i][j];
                oneCol[j] +=grid[i][j];
            }
        }
        int [][] diff = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j] = 2*onesRow[i] + 2*oneCol[j] -n -m;
            }
        }
        return diff;
        
    }
}