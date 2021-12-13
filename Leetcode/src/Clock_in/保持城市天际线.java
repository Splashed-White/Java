package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-13
 * Time: 10:41
 */

/**
 * 扩充一维数组，第一行和第一列作为标识栏分别记录当前行列的最大值，最后遍历数组找对应标识栏最小的修改值，并计算差值累加
 */
public class 保持城市天际线 {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int[][] array = new int[grid.length+1][grid[0].length+1];
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                array[i+1][j+1] = grid[i][j];
            }
        }//for
        //找行最大
        for (int i = 1; i < row; i++) {
            int max = array[i][1];
            for (int j = 1; j < col; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }//forj
            array[i][0] = max;
        }//fori
        //找列最大
        for (int i = 1; i < col; i++) {
            int max = array[1][i];
            for (int j = 1; j < row; j++) {
                if(array[j][i] > max){
                    max = array[j][i];
                }
            }//forj
            array[0][i] = max;
        }//fori
        //遍历修改
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                int value = Math.min(array[0][j],array[i][0]);
                int x = array[i][j];
                int temp = value - array[i][j];
                sum += temp;
                array[i][j] = value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int ret = maxIncreaseKeepingSkyline(grid);
        System.out.println(ret);
    }
}
