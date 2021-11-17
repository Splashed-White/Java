package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-31
 * Time: 10:23
 */
public class BTS的后序遍历序列 {
    public boolean helper(int[] sequence,int start, int end){
        int len = sequence.length;
        if(len == 1) return true;
        int root = sequence[len-1];
        int index = 0;
        for (int i = start; i < end; i++) {
            if(sequence[i] > root){
                index = i;
                break;
            }
        }
        return helper(sequence,start,index-1) && helper(sequence,index,len-2);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return helper(sequence,0,sequence.length-1);
    }
}
