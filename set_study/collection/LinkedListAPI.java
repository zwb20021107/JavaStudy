import java.util.LinkedList;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-2:17
 * @Description:
 */
public class LinkedListAPI {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);

//        public void addFirst(E e)	在该列表开头插入指定的元素
        linkedList.addFirst(2);
        System.out.println(linkedList); // [2, 1, 2, 4, 3]

//        public void addLast(E e)	将指定的元素追加到此列表的末尾
        linkedList.addLast(5);
        System.out.println(linkedList); // [2, 1, 2, 4, 3, 5]

//        public E getFirst()	返回此列表中的第一个元素
        Integer integer = linkedList.getFirst();
        System.out.println(integer); // 2

//        public E getLast()	返回此列表中的最后一个元素
        integer = linkedList.getLast();
        System.out.println(integer); // 5

//        public E removeFirst()	从此列表中删除并返回第一个元素
        linkedList.removeFirst();
        System.out.println(linkedList); // [1, 2, 4, 3, 5]

//        public E removeLast()	从此列表中删除并返回最后一个元素
        linkedList.removeLast();
        System.out.println(linkedList); // [1, 2, 4, 3]
    }

}
