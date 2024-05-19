class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums) set.add(x);

        int totalDistinct = set.size();
        int start = 0;
        int end = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(end<length){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            end++;

            while(map.size()== totalDistinct){
                count += length - end +1;
              
              map.put(nums[start],map.get(nums[start])-1);
              if(map.get(nums[start])==0){
                map.remove(nums[start]);
              }
              start++;
            }

        }
        return count;
    }
}