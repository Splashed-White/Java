package eg_interface;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-10
 * Time: 17:38
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
