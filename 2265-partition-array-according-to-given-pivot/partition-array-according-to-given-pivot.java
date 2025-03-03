class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int [] ans = new int[nums.length];
        int less1 = 0;
        int greater1 = nums.length - 1;
        for(int i =0,j=nums.length -1; i<nums.length; i++,j--)
        {
            if(nums[i] < pivot)
            {
                ans[less1] = nums[i];
                less1++;
            }
            if(nums[j] > pivot)
            {
                ans[greater1] = nums[j];
                greater1--;
            }

        }
        while(less1 <= greater1)
        {
            ans[less1] = pivot;
            less1++;
        }
        return ans;
    }
}