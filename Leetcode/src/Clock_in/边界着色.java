package Clock_in;

import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-07
 * Time: 9:15
 */
//注意边界不只是矩形的边界，是指连通分量的边界，题比较难理解...
//如果该格子附近的四个都是需要修改的颜色，那么这个格子就不是边界；反之，则这个格子位于边界，需要改变颜色

public class 边界着色 {
    int[][] position = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int[][] colorBorder(int[][] grid, int sr, int sc, int color) {
        boolean[][] book = new boolean[grid.length][grid[0].length];
        int old = grid[sr][sc];
        DFS(grid, book, sr, sc, old, color);
        return grid;
    }
    public boolean DFS(int[][] grid, boolean[][] book, int sr, int sc, int old, int color){
            // 网格边界，不需要变色
        if(sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length){
            return false;
        }
            // 已经判断过了，需要变色
        if(book[sr][sc]){
            return true;
        }
            // 其他元素，不需要变色
        if(grid[sr][sc] != old){
            return false;
        }else{
                // 只有需要变色的元素才会修改book
            book[sr][sc] = true;
        }
        for(int i = 0; i < 4; i++){
                // 只要有任何一个方向的邻居不选哟变色，则该格子是边界，当前元素应该变色
            if(!DFS(grid, book, sr + position[i][0], sc + position[i][1], old, color)){
                grid[sr][sc] = color;
            }
        }
        return true;
    }
}
