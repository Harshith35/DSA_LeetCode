class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] res = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=cols;j>0;j--){
                res[i][cols-j] = image[i][j-1];
                res[i][cols-j] ^= 1;
            }
        }
        
        return res;
    }
}