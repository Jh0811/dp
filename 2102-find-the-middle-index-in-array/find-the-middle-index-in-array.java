class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int [n];

        for(int i=0;i<n;i++)
        {
            if(i!=0)
            {
                left[i] = left[i-1]+nums[i];
            }
            else
            {
                left[i]= nums[i];
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i<=n-2)
            {
                right[i]= right[i+1]+nums[i];
            }
            else
            {
                right[i]= nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(left[i]==right[i])
            return i;
        }
        return -1;
    }
}