package Algorithm.基础;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-10-27
 * Time: 9:16
 */
/**
 * 法一.创建一个新的String
 * 遍历一便字符串，遇到' '就添加 %20 到新字符串中，否则将原字符加入新字符串
 */
//public class 替换空格 {
//    public String replaceSpace(StringBuffer str) {
//        StringBuffer ret = new StringBuffer();
//        for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            if(ch == ' '){
//                ret.append("%20");
//            }else{
//                ret.append(ch);
//            }
//        }
//        return ret.toString();
//    }
//}


/**
 * 法二.字符串移动
 * 更新字符串为操作后的新容量，从后往前遍历字符串，不是空格就挪到新位置，是空格就将 %20 放入新位置
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        int old_len = str.length();
        int new_len = 0;
        int count = 0;
        for(int i = 0; i < old_len; i++){ //计算new_len
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        new_len = count * 2 + old_len;
        str.setLength(new_len); //设置字符串新大小，防止越界
        int old_end = old_len - 1;
        int new_end = new_len - 1;
//        System.out.println(old_end);
//        System.out.println(new_end);
//        System.out.println(str.length());
        while(old_end >= 0 && new_end >= 0){
            //注意循环条件 >=
            //若没有 = ,那么首个字符为空格的测试用例会报错
            char ch = str.charAt(old_end);
            if(ch == ' '){
                str.setCharAt(new_end--, '0');
                str.setCharAt(new_end--, '2');
                str.setCharAt(new_end--, '%');
                old_end--;

            }else{
                str.setCharAt(new_end, ch);
                //setCharAt（int index,char ch）
                //将字符串中指定的位置的字符替换成目标字符
                new_end--;
                old_end--;
            }
        }
        return str.toString();
    }
}