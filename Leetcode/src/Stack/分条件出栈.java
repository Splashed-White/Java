package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-31
 * Time: 13:55
 */
public class 分条件出栈 {
    public ArrayList<Integer> asylum(int[][] ope) {
        //定义LinkedList 用来保存猫狗，相当于收容所，ArrayList 用来保存领养的猫狗。
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(ope==null||ope.length==0||ope[0].length==0){
            return temp;
        }
        //如果ope[i][0]==1，进入收养所
        for(int i=0 ; i<ope.length;i++){
            if(ope[i][0]==1){
                temp.add(ope[i][1]);
            }
            if(ope[i][0]==2){  //需要出所
                if(ope[i][1]==0){ //方式1
                    list.add(temp.remove(0));
                }else if(ope[i][1]==1){//收养狗
                    for(int j=0;j<temp.size();j++){
                        if(temp.get(j)>0){
                            list.add(temp.remove(j));
                            break;
                        }
                    }
                }else{  //收养猫
                    for(int j=0;j<temp.size();j++){
                        if(temp.get(j)<0){
                            list.add(temp.remove(j));
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }
}


