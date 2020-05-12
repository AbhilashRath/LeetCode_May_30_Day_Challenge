class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prevColor = image[sr][sc];
        if(prevColor==newColor){
            return image;
        }
        bfs(image,sr,sc,prevColor,newColor);
        return image;
        
    }
    public void bfs(int[][] image,int i,int j,int prevColor,int value){
        if((i>=image.length)||(j>=image[0].length)||(i<0)||(j<0)||(image[i][j]!=prevColor)){
            return;
        }
        image[i][j] = value;
        bfs(image, i+1,j,prevColor,value);
        bfs(image, i,j+1,prevColor,value);
        bfs(image, i-1,j,prevColor,value);
        bfs(image, i,j-1,prevColor,value);

    }
}
