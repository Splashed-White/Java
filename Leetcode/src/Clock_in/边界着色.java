package Clock_in;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-07
 * Time: 9:15
 */
//注意边界不只是矩形的边界，是指连通分量的边界，题比较难理解...
//如果该格子附近的四个都是需要修改的颜色，那么这个格子就不是边界；反之，则这个格子位于边界，需要改变颜色

//public class 边界着色 {
//    int[][] position = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//    public int[][] colorBorder(int[][] grid, int sr, int sc, int color) {
//        boolean[][] book = new boolean[grid.length][grid[0].length];
//        int old = grid[sr][sc];
//        DFS(grid, book, sr, sc, old, color);
//        return grid;
//    }
//    public boolean DFS(int[][] grid, boolean[][] book, int sr, int sc, int old, int color){
//            // 网格边界，不需要变色
//        if(sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length){
//            return false;
//        }
//            // 已经判断过了，需要变色
//        if(book[sr][sc]){
//            return true;
//        }
//            // 其他元素，不需要变色
//        if(grid[sr][sc] != old){
//            return false;
//        }else{
//                // 只有需要变色的元素才会修改book
//            book[sr][sc] = true;
//        }
//        for(int i = 0; i < 4; i++){
//                // 只要有任何一个方向的邻居不选哟变色，则该格子是边界，当前元素应该变色
//            if(!DFS(grid, book, sr + position[i][0], sc + position[i][1], old, color)){
//                grid[sr][sc] = color;
//            }
//        }
//        return true;
//    }
//}

public class 边界着色 {
    static int[][] position = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static int[][] colorBorder(int[][] grid, int row, int col, int color) {
        boolean[][] book = new boolean[grid.length][grid[0].length];
        int oldColor = grid[row][col];
        DFS(grid, row, col, color,oldColor,book);
        return grid;
    }

    public static void DFS(int[][] grid, int row, int col, int color,int oldColor,boolean[][] book ) {
        book[row][col] = true;
        //矩形边界，需要变色
        if(row == grid.length-1 || col == grid[0].length - 1 || row == 0 || col == 0) {
            grid[row][col] = color;
        }
        for(int i = 0; i < 4; i++){
            int new_sr = row + position[i][0];
            int new_sc = col + position[i][1];
            if(new_sr < 0 || new_sr >= grid.length || new_sc < 0 || new_sc >= grid[0].length) {
                grid[row][col] = color;
                continue;
            }
            if(book[new_sr][new_sc]) continue; //已经被标记过的格子
            // //判断是否与grid[row][col]的颜色不同,是则为超出连通分量
            if(grid[new_sr][new_sc] != oldColor) {
                grid[row][col] = color;
                continue;
            }
            DFS(grid, new_sr, new_sc,color,oldColor,book);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{2,5,4},{2,2,3},{2,2,2},{1,2,2}};
        colorBorder(grid,2,0,10);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}