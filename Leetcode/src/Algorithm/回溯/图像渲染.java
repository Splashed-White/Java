package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-07
 * Time: 10:53
 */
public class 图像渲染 {
    //4*2的方向数组，每一行表示四个不同方向，两列代表行列
    int[][] position = {{0,-1},{1,0},{0,1},{-1,0}}; //顺从时针旋转
    public void DFS(int[][] image,int row,int col,int sr,int sc,int[][] book,int oldColor,int newColor){
        image[sr][sc] = newColor;
        book[sr][sc] = 1;
        for(int i = 0; i < 4; i++){ //判断当前位置的上下左右四个方向
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            if(new_sr >= row || new_sr < 0 || new_sc >= col || new_sc < 0){ //新坐标范围不合法
                continue;
            }
            //新坐标点颜色newColor==目标点颜色oldColor && 新坐标点没有被标记过
            if(image[new_sr][new_sc] == oldColor && book[new_sr][new_sc] == 0){
                DFS(image,row,col,new_sr,new_sc,book,oldColor,newColor); //就向新坐标渲染，即下一层DFS
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        int oldColor = image[sr][sc];
        int[][] book = new int[row][col];
        DFS(image,row,col,sr,sc,book,oldColor,newColor);
        return image;
    }
}
