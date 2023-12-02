import java.util.ArrayList;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-14:44
 * @Description:
 */
public class GenericsClass <T>{
    public void main(String[] args) {
        ArrayList<T> arrayList = new ArrayList<T>();
        System.out.println(arrayList);
    }
}
