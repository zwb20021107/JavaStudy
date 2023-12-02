import java.util.ArrayList;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-2:02
 * @Description:
 */
public class ArrayListAPI {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 添加元素
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(12);
        arrayList.add(6);
        System.out.println(arrayList);//[1, 4, 12, 6]


//        void add(int index,E element)	在此集合中的指定位置插入指定的元素
        arrayList.add(1, 2);
        System.out.println(arrayList); //[1, 2, 4, 12, 6]

//        E remove(int index)	删除指定索引处的元素，返回被删除的元素
        arrayList.remove(4);
        System.out.println(arrayList);// [1, 2, 4, 12]

//        E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        arrayList.set(2, 3);
        System.out.println(arrayList); // [1, 2, 3, 12]

//        E get(int index)	返回指定索引处的元素
        Integer integer = arrayList.get(1);
        System.out.println(integer); // 2
    }
}
