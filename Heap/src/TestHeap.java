/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-22
 * Time: 9:37
 */
public class TestHeap {
    public  int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    public void adjustDown(int root,int len){
        int parent = root;
        int child = parent*2+1;
        for (int i = 0; i < ; usedSize--) {

        }

    }
    public void pop() {
        int temp = this.elem[0];
        this.elem[0] = this.elem[usedSize-1];
        this.elem[usedSize] = temp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
}


    ///直接插入排序
    public static void insertSort(int[] array) {
        if(array.length == 0) return;
        int j = 0;
        for (int i = 1; i < array.length ; i++) {
            int temp = array[i];
            for (j =  i-1; j >= 0 ; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j + 1] = temp;
        }

}

    public static void main(String[] args) {

        }