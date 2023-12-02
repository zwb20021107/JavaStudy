package set;

import java.util.Comparator;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-15:12
 * @Description:
 */
public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.id - o2.id;
    }
}
