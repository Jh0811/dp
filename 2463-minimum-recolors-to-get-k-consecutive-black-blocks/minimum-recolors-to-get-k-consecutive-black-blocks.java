class Solution {
    public boolean isWhite(char ch){
        return ch == 'W';
    }
    public int minimumRecolors(String blocks, int k) {
        int min = blocks.length(),i=0, counter=0;
        String generator = blocks.substring(i,i+k);
        for(char c : generator.toCharArray()){
            if(isWhite(c)){
                counter++;
            }
        }
        min = Math.min(counter,min);
        while(i<blocks.length()-k){
            if(isWhite(generator.charAt(0))){
                counter--;
            }
            i++;
            generator = blocks.substring(i,i+k);
            if(isWhite(generator.charAt(generator.length()-1))){
                counter++;
            }
            min = Math.min(counter,min);
        }
        return min;
    }
}