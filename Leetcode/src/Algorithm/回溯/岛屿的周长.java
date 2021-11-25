package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-07
 * Time: 10:54
 */

/**
 * 起始找到一个官格子1，搜索它的上下左右四个相邻节点，会有以下情况：
 * 1. 边界,result++;
 * 2. 格子0,result++;
 * 3. 格子1,DFS;
 */

public class 岛屿的周长 {
    public static int result = 0;
    int[][] position = {{0,-1},{1,0},{0,1},{-1,0}}; //顺从时针旋转
    public void DFS(int[][] grid,int row,int col,int sr,int sc,int[][] book){
        //System.out.println("当前坐标为:[" + sr + "," + sc + "]");
        book[sr][sc] = 2;
        //访问4个相邻节点上下左右
        for(int i = 0; i < 4; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            //如果新坐标越界,说明是边界,result++
            if(new_sr >= row || new_sc >= col || new_sr < 0 || new_sc < 0){
                result++;
                continue;
            }
            //如果新坐标是水域,那么result++;
            if(grid[new_sr][new_sc] == 0){
                result++;
                continue;
            }
            //如果新坐标也是岛屿1,那么DFS
            if(grid[new_sr][new_sc] == 1 && book[new_sr][new_sc] != 2){
                DFS(grid,row,col,new_sr,new_sc,book);
            }
        }
    }
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sr = 0,sc = 0; //当前坐标
        int[][] book = new int[row][col]; //标记数组
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                    break;
                }
            }
        }//此时[sr,sc]为起始坐标格子1
        //System.out.println("起始坐标为:[" + sr + "," + sc + "]");
        DFS(grid,row,col,sr,sc,book);
        return result;
    }
}
