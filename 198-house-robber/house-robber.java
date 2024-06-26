class Solution {
    static int solve(int n,int nums[],int dp[])
    {
        dp[0] =nums[0];
        for(int i=1;i<n;i++)
        {
            int pick = nums[i];
            if(i>1)
            pick+=dp[i-2];

            int nonpick = dp[i-1];

            dp[i] = Math.max(pick,nonpick);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;

        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);
        return solve(n,nums,dp);

    }
}