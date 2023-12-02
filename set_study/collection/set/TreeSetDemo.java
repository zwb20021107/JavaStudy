package set;

import java.util.TreeSet;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-15:04
 * @Description:
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<User> treeSet = new TreeSet<User>(new UserComparator());

    }
}
