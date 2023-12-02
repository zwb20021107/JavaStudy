import java.io.UnsupportedEncodingException;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-21:39
 * @Description:
 */
public class DecodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "张三";
        byte[] bytes1 = str1.getBytes();
        byte[] bytes2 = str1.getBytes("UTF-8");


//        String(byte[] bytes)	通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        System.out.println(new String(bytes1));
//        String(byte[] bytes, String charsetName)	通过指定的字符集解码指定的字节数组来构造新的 String
        System.out.println(new String(bytes2, "UTF-8"));

    }
}
