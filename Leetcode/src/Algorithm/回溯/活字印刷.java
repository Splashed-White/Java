package Algorithm.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-09
 * Time: 9:17
 */

public class 活字印刷 {
    public void DFS(char[] array,StringBuilder path,boolean[] book, ArrayList<String> result){
        result.add(path.toString());
        for(int i = 0; i < array.length; i++) {
            if(book[i] || (i>0 && array[i] == array[i-1] && book[i-1] == false) )
                continue;
            book[i] = true;
            path.append(array[i] );
            DFS(array,path,book,result);
            book[i] = false;
            path.deleteCharAt(path.length() - 1);
        }
    }
    public int numTilePossibilities(String tiles){
        char[] array = tiles.toCharArray();
        Arrays.sort(array);
        ArrayList<String> result = new ArrayList<>();
        if(tiles == null || tiles.length() == 0) return 0;
        boolean[] book = new boolean[tiles.length()];
        StringBuilder str = new StringBuilder("");
        DFS(array,str,book,result);
        return result.size() - 1;
    }
}