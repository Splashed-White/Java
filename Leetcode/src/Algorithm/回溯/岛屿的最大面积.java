package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-08
 * Time: 9:09
 */

public class 岛屿的最大面积 {
    int[][] position = {{0,-1},{1,0},{0,1},{-1,0}};
    public int DFS(int[][] grid,int row,int col,int sr,int sc,int[][] book){
        book[sr][sc] = 2;
        int area = 1;
        for(int i = 0;i < 4; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            if(new_sr>=row || new_sc>=col || new_sr<0 || new_sc<0){
                continue;
            }
            if(grid[new_sr][new_sc] == 1 && book[new_sr][new_sc] == 0){
                area += DFS(grid,row,col,new_sr,new_sc,book);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] book = new int[row][col];
        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1 && book[i][j] == 0){
                    int area = DFS(grid,row,col,i,j,book);
                    result = Math.max(result, area);
                }
            }
        }//for
        return result;
    }
}