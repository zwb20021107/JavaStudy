import java.util.*;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-1:41
 * @Description:
 */



public class CollectionAPI {

    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<Integer>();
        Collection<Integer> linkedList = new LinkedList<Integer>();
        Collection<Integer> hashSet = new HashSet<Integer>();
        Collection<Integer> treeSet = new TreeSet<Integer>();


//        public boolean add(E e)	把给定的对象添加到当前集合中
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);

        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(3);


        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(treeSet);


//        public void clear() 	清空集合中所有的元素
        arrayList.clear();
        System.out.println(arrayList);


//        public boolean remove(E e)	把给定的对象在当前集合中删除删除第一个出现的值
        linkedList.remove(1);
        System.out.println(linkedList);

//        public boolean contains(Object obj)	判断当前集合中是否包含给定的对象
        System.out.println(linkedList.contains(1));

//        public boolean isEmpty()	判断当前集合是否为空
        System.out.println(linkedList.isEmpty());
        System.out.println(arrayList.isEmpty());

//        public int size()	返回集合中元素的个数。
        System.out.println(linkedList.size());

//        public Object[] toArray()	把集合中的元素，存储到数组中
        Object[] array = linkedList.toArray();

        System.out.println(array.toString());
    }

}
