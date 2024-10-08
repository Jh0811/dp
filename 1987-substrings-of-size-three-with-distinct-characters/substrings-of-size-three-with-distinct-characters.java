class Solution {
    public int countGoodSubstrings(String s) {
        int start =0;
        int count =0;
        for(int end =0; end < s.length(); end++){
            if(end - start +1 == 3){
                String substring = s.substring(start,end+1);
                if(isGood(substring)){
                    count ++;
                }
                start++;
            }
        }
        return count;
    }
    private boolean isGood(String s){
        return s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) && s.charAt(0) != s.charAt(2);
    }
}