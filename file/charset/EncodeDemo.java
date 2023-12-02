import java.io.UnsupportedEncodingException;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-21:34
 * @Description:
 */
public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "张三";
        String str2 = "nihao";

//        byte[] getBytes()	使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        System.out.println(str1.getBytes());
        System.out.println(str2.getBytes());

//        byte[] getBytes(String charsetName)	使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        System.out.println(str1.getBytes("UTF-8"));
        System.out.println(str2.getBytes("UTF-8"));
    }
}
