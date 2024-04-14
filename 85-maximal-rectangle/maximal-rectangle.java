class Solution {
    private int n;
    private int res = 0;
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        this.n = matrix[0].length;
      
        // dp[j] : height (number of consecutive '1's) of column j 
        int[] dp = new int[n];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                dp[j] = (matrix[i][j] == '0') ? 0 : dp[j] + 1;
            }

            checkRectanglesForEachRow(dp);
        }
        return res;
        
    }
    
    private void checkRectanglesForEachRow(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        stack.offerLast(-1);
        
        for (int i = 0; i < n; i++) {
            while (stack.peekLast() != -1 && nums[stack.peekLast()] >= nums[i]) {
                res = Math.max(res, nums[stack.pollLast()] * (i - stack.peekLast() - 1));
            }
            stack.offerLast(i);
        }
        
        while (stack.peekLast() != -1) {
            res = Math.max(res, nums[stack.pollLast()] * (n - stack.peekLast() - 1));
        }
    }
}