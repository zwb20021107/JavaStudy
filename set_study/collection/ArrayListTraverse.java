import java.util.ArrayList;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-2:09
 * @Description:
 */
public class ArrayListTraverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 添加元素
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(12);
        arrayList.add(6);


        for(int i = 0; i < arrayList.size(); i ++ )
        {
            System.out.println(arrayList.get(i));
        }

    }
}
