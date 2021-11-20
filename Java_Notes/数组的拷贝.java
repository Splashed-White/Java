import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-20
 * Time: 16:26
 */
class Num{
    public int val = 0;

    public Num(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class 数组拷贝 {
    //打印对象数组的方法
    public static void show(Num[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i].getVal() + " ");
        }
        System.out.println();
    }


    //1. for循环拷贝  (拷贝数值类型) ---深拷贝
    public static void main11(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        System.out.println("A : " + Arrays.toString(A));  //A : [1, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
        System.out.println("===========修改后===========");
        A[0] = 100;
        System.out.println("A : " + Arrays.toString(A));  //A : [100, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
    }
//    public static void main2(String[] args) {
//        //字符串是新的对象,永远都是深拷贝
//        String[] A = {"abc","def","hig"};
//        String[] B = new String[A.length];
//        for (int i = 0; i < A.length; i++) {
//            B[i] = A[i];
//        }
//        System.out.println("A : " + Arrays.toString(A));
//        System.out.println("B : " + Arrays.toString(B));
//        System.out.println("===========修改后===========");
//        A[0] = "张三";
//        System.out.println("A : " + Arrays.toString(A));
//        System.out.println("B : " + Arrays.toString(B));
//    }

    //1. for循环拷贝  (拷贝引用数据类型) ---浅拷贝
    public static void main12(String[] args) {
        Num[] A = new Num[4];
        A[0] = new Num(1);
        A[1] = new Num(2);
        A[2] = new Num(3);
        A[3] = new Num(4);
        Num[] B = new Num[4];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        show(A);  //1 2 3 4
        show(B);  //1 2 3 4
        System.out.println("===========修改后===========");
        A[0].setVal(100);
        show(A);  //100 2 3 4
        show(B);  //100 2 3 4
    }

    //2. copy / copyOfRange  (拷贝数值类型) ---深拷贝
    public static void main21(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = Arrays.copyOf(A,A.length);
        int[] C = Arrays.copyOfRange(A,1,3);
        System.out.println("A : " + Arrays.toString(A));  //A : [1, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
        System.out.println("C : " + Arrays.toString(C));  //C : [2, 3]
        System.out.println("===========修改后===========");
        A[0] = 100;
        System.out.println("A : " + Arrays.toString(A));  //A : [100, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
        System.out.println("C : " + Arrays.toString(C));  //C : [2, 3]
    }
    //2. copy / copyOfRange  (拷贝引用类型) ---浅拷贝
    public static void main22(String[] args) {
        Num[] A = new Num[4];
        A[0] = new Num(1);
        A[1] = new Num(2);
        A[2] = new Num(3);
        A[3] = new Num(4);
        Num[] B = Arrays.copyOf(A,A.length);
        show(A);  //1 2 3 4
        show(B);  //1 2 3 4
        System.out.println("===========修改后===========");
        A[0].setVal(100);
        show(A);  //100 2 3 4
        show(B);  //100 2 3 4
    }

    //3. arraycopy  (拷贝数值类型) ---深拷贝
    public static void main31(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = new int[A.length];
        //System.arraycopy(A,0,B,0,A.length);
        System.arraycopy(A,1,B,2,2);
        System.out.println("A : " + Arrays.toString(A));  //A : [1, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [0, 0, 2, 3, 0]
        System.out.println("===========修改后===========");
        A[0] = 100;
        System.out.println("A : " + Arrays.toString(A));  //A : [100, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [0, 0, 2, 3, 0]
    }
    //3. arraycopy  (拷贝引用类型) ---浅拷贝
    public static void main32(String[] args) {
        Num[] A = new Num[4];
        A[0] = new Num(1);
        A[1] = new Num(2);
        A[2] = new Num(3);
        A[3] = new Num(4);
        Num[] B = new Num[4];
        System.arraycopy(A,0,B,0,A.length);
        show(A);  //1 2 3 4
        show(B);  //1 2 3 4
        System.out.println("===========修改后===========");
        A[0].setVal(100);
        show(A);  //100 2 3 4
        show(B);  //100 2 3 4
    }

    //4. clone  (拷贝数值类型) ---深拷贝
    public static void main41(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = A.clone();
        System.out.println("A : " + Arrays.toString(A));  //A : [1, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
        System.out.println("===========修改后===========");
        A[0] = 100;
        System.out.println("A : " + Arrays.toString(A));  //A : [100, 2, 3, 4, 5]
        System.out.println("B : " + Arrays.toString(B));  //B : [1, 2, 3, 4, 5]
    }
    //4. clone  (拷贝引用类型) ---浅拷贝
    public static void main(String[] args) {
        Num[] A = new Num[4];
        A[0] = new Num(1);
        A[1] = new Num(2);
        A[2] = new Num(3);
        A[3] = new Num(4);
        Num[] B = A.clone();
        show(A);  //1 2 3 4
        show(B);  //1 2 3 4
        System.out.println("===========修改后===========");
        A[0].setVal(100);
        show(A);  //100 2 3 4
        show(B);  //100 2 3 4
    }
}
