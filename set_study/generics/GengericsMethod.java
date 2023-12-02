/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-14:47
 * @Description:
 */
public class GengericsMethod {

    public static <T> void show(T t)
    {
        System.out.println(t);
    }
    public static void main(String[] args) {
        int[] arr = {1, 1,2, 3, 4, 5};
        show(arr);

    }
}
