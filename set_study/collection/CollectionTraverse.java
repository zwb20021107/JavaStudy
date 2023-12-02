import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-1:52
 * @Description:
 */
public class CollectionTraverse {
    public static void main(String[] args) {
        // 定义数组 [1, 2, 3, 2]
        Collection<Integer> arraylist = new ArrayList<Integer>();

        // add 1, 2, 3, 2
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(2);

        // 遍历方法一
        // 使用遍历迭代器方法 Iterator
//        Iterator<E> iterator()	返回集合中的迭代器对象，该迭代器对象默认指向当前集合的0索引
//        迭代器如果取元素越界会出现什么问题。
//        会出现NoSuchElementException异常。

        System.out.println("遍历迭代器遍历");
        Iterator<Integer> iterator = arraylist.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        // 遍历方法二
        // foreach/增强for循环
        System.out.println("foreach/增强for循环");
        for(Integer i : arraylist){
            System.out.println(i);
        }

        // 遍历方法三 Lambda表达式遍历集合
        System.out.println("Lambda表达式遍历集合");
        arraylist.forEach(e -> {
            System.out.println(e);
        });




    }
}
