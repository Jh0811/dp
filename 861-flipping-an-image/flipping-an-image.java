class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      
      for(int [] row:image)
      {
        int l=0;
        int r = row.length -1;
        while(l<=r)
        {
            int temp = row[l];
            row[l++] = row[r]^1;
            row[r--] = temp^1;
        }
      }
      return image;

    }
}