class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        
        int minLength = Integer.MAX_VALUE;
        for(int left =0;left<nums.length;left++)
        {
            int currOR =0;
            for(int right = left;right<nums.length;right++){
                currOR = currOR|nums[right];
                if(currOR>=k)
                {
                    minLength = Math.min(minLength,right-left+1);
                    break;
                }
            }
        }
        return minLength==Integer.MAX_VALUE ? -1 : minLength;
    }
}