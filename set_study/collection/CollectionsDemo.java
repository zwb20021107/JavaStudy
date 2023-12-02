import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-15:25
 * @Description:
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);

//        public static <T> boolean addAll(Collection<? super T> c, T... elements)	给集合对象批量添加元素
        boolean b = Collections.addAll(hashSet, 1, 4 , 3);
        System.out.println(b);
        System.out.println(hashSet);
//        public static void shuffle(List<?> list) 	打乱List集合元素的顺序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
//        public static <T> void sort(List<T> list)	将集合中元素按照默认规则排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
//        public static <T> void sort(List<T> list，Comparator<? super T> c)	将集合中元素按照指定规则排序
    }
}
