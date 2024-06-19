class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        int n = nums.length;
        Arrays.sort(nums);
        int pre[] = new int[n];
        pre[0] = nums[0];

        for(int i=1;i<n;i++){
            pre[i] = nums[i]+pre[i-1];
        }
        int ans [] = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int x=0;
            for(int j=0;j<n;j++){
                if(queries[i]>=pre[j])x++;
                else
                break;
            }
            ans[i] =x;
        }
        return ans;
    }
}