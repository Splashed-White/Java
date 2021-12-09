package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-09
 * Time: 12:41
 */
public class 有效的井字游戏 {
    public boolean check(char[][] grid,char ch){
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0] == ch && grid[i][1] == ch && grid[i][2] == ch) return true; //判断行
            if(grid[0][i] == ch && grid[1][i] == ch && grid[2][i] == ch) return true; //判断列
        }
        //判断斜对角
        boolean a = true, b = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) a &= grid[i][j] == ch;
                if (i + j == 2) b &= grid[i][j] == ch;
            }
        }
        return a || b;
    }
    public boolean validTicTacToe(String[] board){
        //转成二维数组好操作
        char[][] grid = new char[3][3];
        int x = 0,o = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < 3; j++){
                char ch = board[i].charAt(j);
                if(ch == 'X') x++;
                if(ch == 'O') o++;
                grid[i][j] = ch;
            }
        }//for
        //去掉所有不合法的局面
        boolean a = check(grid, 'X'), b = check(grid, 'O');
        //X先手O后手，所以不存在 O < X的情况
        if(x < o || x - o > 1) return false;
        // X胜，则 x >= o 是合法局面
        if(a && (x <= o)) return false;
        // O胜，则 x == o 是合法局面
        if(b && (x != o)) return false;
        //双方不能同时胜
        if (a && b) return false;
        return true;
    }
}
