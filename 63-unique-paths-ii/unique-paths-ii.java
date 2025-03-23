class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;

       int [][] dp = new int[m][n];

       for(int [] arr:dp){
        Arrays.fill(arr,-1);
       }
       return memoization(obstacleGrid,dp,m-1,n-1);

    }
    public int memoization(int [][] arr, int[][] dp, int i, int j)
    {
        if(i>=0 && j>=0 && arr[i][j] == 1) return 0;
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int left = memoization(arr,dp,i,j-1);
        int top = memoization(arr,dp,i-1,j);
        return dp[i][j] = left+top;
    }
}