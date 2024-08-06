class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int a[] = new int[101];
        for(int i=0;i<=100;i++){
            a[i] = 0;
        }
        for(int i=0;i<nums.length;i++){
            a[nums[i]] = a[nums[i]]+1;
        }
        int ans =0;
        for(int i=1;i<=100;i++){
            int val = a[i] - 1;
            ans = ans + ((val*(val+1))/2);
        }
        return ans;
    }
}