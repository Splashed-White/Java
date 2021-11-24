package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 9:19
 */
/**
 * 法一.暴力查找
 * 双重gor循环，但效率极低
 */
//public class 二维数组中的查找 {
//    public boolean Find(int target, int [][] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[0].length; j++){
//                if(array[i][j] == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

/**
 * 法二.利用数组特性
 * 目标值与数组右上角元素比较，
 * 若目标值 < 数组右上角元素，因为数组右上角元素为该列最小值，所以可以排除右边一整列
 * 若目标值 > 数组右上角元素，因为数组右上角元素为该行最大值，所以可以排除上边一整行
 */
public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array){
        int i = 0;
        int j = array[0].length - 1;
        while(i < array.length && j>= 0){
            if(array[i][j] > target){
                j--;
            }else if(array[i][j] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
