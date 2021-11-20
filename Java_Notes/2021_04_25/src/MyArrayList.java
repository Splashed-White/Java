import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-25
 * Time: 19:11
 */
public class MyArrayList {
    //实例成员变量 不初始化-默认值
    public int[] elem; //只是定义了一个引用
    public int usedSize; //有效的数据个数

    public MyArrayList(){
        this.elem = new int[5];
    }

    public boolean isFull(){
        if(this.elem.length == usedSize){
            return true;
        }
        return false;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //满了 需要扩容  this.elem 这个引用扩容
       if(this.isFull()){
           this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
       }
        // 1. pos位置是否合法
        if(pos < 0 || pos > this.usedSize){  // this.usedSize 良好的编程习惯
            System.out.println("pos位置不合法");
            return;
        }
        // 2. 从后往前挪数据
        for(int i = this.usedSize - 1; i >= pos; i--) {
             this.elem[i + 1]= this.elem[i];
        }
        // 3. 数量+1
        this.elem[pos]= data;
        this.usedSize++;
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i]);
        }
        System.out.println();
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if(this.elem[i] == toFind)
                return true;
        }
        return false;
    }


    // 查找某个元素对应的位置,找到返回下标
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //pos是否合法
        if(pos < 0 || pos > this.usedSize){
            return -1;
        }
        return this.elem[pos];

    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos > this.usedSize){
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1){
            System.out.println("key不合法");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.elem.length;
    }

    // 清空顺序表
    public void clear() {

    }


}
