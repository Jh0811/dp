class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return BasewisePalindrome(n);
    }
      public static boolean BasewisePalindrome(int num){
        if(num <= 4) {
            return false;
        }
        for(int base = 2;base<num-2;base++){
            String n = converttoBase(num,base);
            if(!Checkpalindrome(n)){
                return false;
            }
        }
        return true;
    }
    public static boolean Checkpalindrome(String n) {
        int left = 0;
        int right = n.length()-1;
        while(left < right){
            if(n.charAt(left) != n.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String converttoBase(int num, int base) {
        int result = 1;
        while(num >0){
            result = (result*10)+ num%base;
            num=num/base;
        }
       // System.out.println(result);
        return Integer.toString(result);
    }
}