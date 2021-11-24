package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 22:46
 */

/**
 * 相对位置可变
 * 1. 创建一个新的数组存储
 */
//public class 调整数组奇偶顺序 {
//    public int[] reOrderArray(int [] array) {
//        int[] ret = new int[array.length];
//        int j = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] % 2 == 1){
//                ret[j] = array[i];
//                j++;
//            }
//        }
//        for(int i = 0; i < array.length; i++){
//            if(array[i] % 2 == 0){
//                ret[j] = array[i];
//                j++;
//            }
//        }
//        return ret;
//    }
//}


/**
 * 相对位置可变
 * 2.左右指针交换值
 */
// public class 调整数组奇偶顺序 {
//     public void reOrderArray(int [] array) {
//         int len = array.length;
//         int i = 0;
//         int j = len - 1;
//         while(i <= j){
//             while(array[i] % 2 == 1){
//                 i++;
//             }
//             while(array[j] % 2 == 0){
//                 j--;
//             }
//             int temp = array[i];
//             array[i] = array[j];
//             array[j] = temp;
//             i++;
//             j--;
//         }
//     }
// }


/**
 * 相对位置可变
 * 插入排序
 */
public class 调整数组奇偶顺序 {
    public void reOrderArray(int [] array) {
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                int temp = array[i];
                int j = i;
                while(j > index){
                    array[j] = array[j-1];
                    j--;
                }//while
                array[index] = temp;
                index++;
            }//if
        }//for
    }
}
