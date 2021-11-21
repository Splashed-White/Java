package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-07
 * Time: 10:16
 */

/**
 * 思路：循环找边界上的'O',DFS找与其联通的'O',置为'A',
 * 最后整体遍历一遍数组，将 A -> 0 , O -> X;
 */
public class 被围绕的区域 {
    int[][] position = {{0,-1},{1,0},{0,1},{-1,0}}; //顺时针旋转
    //传入DFS中的当前坐标一定是边界O
    public void DFS(char[][] board,int row,int col,int sr,int sc){
        board[sr][sc] = 'A';
        for(int i = 0; i < 4; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            //新坐标越界
            if(new_sr>=row || new_sc>=col || new_sr<0 || new_sc<0){
                continue;
            }
            //因为遍历过的'O'会被修改为'A',相当于实现了标记，所以不用再设一个标记数组
            if(board[new_sr][new_sc]=='O'){
                DFS(board,row,col,new_sr,new_sc);
            }
        }
    }
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        //寻找边界位置
        //查找第一行和最后一行
        for(int j = 0; j < col; j++){
            if(board[0][j] == 'O')
                DFS(board,row,col,0,j); //起始位置:board[0][j]
            if(board[row-1][j] == 'O')
                DFS(board,row,col,row-1,j); //起始位置:board[row-1][j]
        }
        //查找第一列和最后一列
        for(int i = 0; i < row; i++){
            if(board[i][0] == 'O')
                DFS(board,row,col,i,0); //起始位置:board[i][0]
            if(board[i][col-1] == 'O')
                DFS(board,row,col,i,col-1); //起始位置:board[i][col-1]
        }
        /**
         * 整体遍历数组
         * 1. 格子为'O',置为'X';
         * 2. 格子为'A',置为'O';
         * 3. 格子为'X',不做操作;
         */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                if(board[i][j] == 'A')
                    board[i][j] = 'O';
            }
        }//for
    }
}
