package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-11
 * Time: 13:45
 */

/**
 * 统计licensePlate出现的次数，再遍历统计words中的每个单词，进行比对即可
 */
public class 最短补全词 {
    public static boolean check(int[] array,String str){
        int[] word = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            word[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(word[i] < array[i]){
                return false;
            }
        }
        return true;
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] array = new int[26];
        //先将licensePlate的字母与对应数量统计到array中
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);
            //Character.isLetter() 方法,判断字符是否为字母
            if(Character.isLetter(ch)){
                array[Character.toLowerCase(ch) - 'a']++;
            }
        }//for
        String ret = null;
        for (int i = 0; i < words.length; i++) {
            if(check(array,words[i])){
                if(ret == null){
                    ret = words[i];
                    continue;
                }
                ret = ret.length() > words[i].length()?words[i]:ret;
            }
        }//for
        return ret;
    }

    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple","stesps"};
        String ret = shortestCompletingWord(licensePlate,words);
        System.out.println(ret);
    }
}
