class Solution {
    public int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num);
        int k_beauty = 0;

        int w_start = 0;
        int w_end = w_start+k-1;

        while(w_end < numStr.length())
        {
            int subnum = Integer.parseInt(numStr.substring(w_start,w_end+1));

            if(subnum != 0 && num%subnum==0){
                k_beauty++;
            }
            w_start+=1;
            w_end = w_start+k-1;
        }

        return k_beauty;
    }
}