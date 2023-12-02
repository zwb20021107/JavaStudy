package set;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-15:01
 * @Description:
 */
public class HashSetDemo {

    public static void main(String[] args) {
        String s1 = "zhangsan";
        String s2 = "lisi";

        // 哈希值 是JDK根据对象的地址，按照某种规则算出来的int类型的数值
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
