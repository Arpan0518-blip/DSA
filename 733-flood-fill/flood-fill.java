class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]== color){
            return image;
        }
        dfs(sr,sc, image, color,image[sr][sc]);
        return image;
        
    }
    void dfs(int i , int j, int [][] image, int color, int startColor){
        if(i<0||j<0|| i>= image.length||j>=image[0].length||image[i][j]!=startColor)
        return;
        
        image[i][j] = color;
        dfs(i+1,j,image,color,startColor);
        dfs(i-1,j,image,color,startColor);
        dfs(i,j+1,image,color,startColor);
        dfs(i,j-1,image,color,startColor);
    }

}