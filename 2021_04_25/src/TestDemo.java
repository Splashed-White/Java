/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-04-25
 * Time: 19:11
 */
public class TestDemo {
    public static void main(String[] args) {
        //顺序表的对象
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);      // 1 2 3
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.display();
        System.out.println("===============");

//        int ret = myArrayList.getPos(3);
//        if(ret == -1){
//            System.out.println("pos位置不合法");
//        }else{
//            System.out.println("3号位置：" + ret);
//        }

//        int index = myArrayList.search(6);
//        System.out.println(index);

//        myArrayList.setPos(5,88);
//        myArrayList.display();

         myArrayList.remove(2);
         myArrayList.display();
    }

}
