import java.io.File;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-20:55
 * @Description:
 */
public class FileInfo {
    public static void main(String[] args) {
        // 定义目录
        File file1 = new File("./data");

        // 定位文件
        File file2 = new File("./data/a/b/b.txt");

        // 不存在文件
        File file3 = new File("./d");


//        public boolean isDirectory()	判断此路径名表示的File是否为文件夹
        System.out.println(file1.isDirectory());// true
        System.out.println(file2.isDirectory());//false
        System.out.println(file3.isDirectory());//false


//        public boolean isFile()	判断此路径名表示的File是否为文件
        System.out.println(file1.isFile());// false
        System.out.println(file2.isFile());//true
        System.out.println(file3.isFile());//false

//        public boolean exists()	判断此路径名表示的File是否存在
        System.out.println(file1.exists());// true
        System.out.println(file2.exists());//true
        System.out.println(file3.exists());//false

//        public long length()	返回文件的大小（字节数量）
        System.out.println(file1.length());// true
        System.out.println(file2.length());//true
        System.out.println(file3.length());//false


//        public String getAbsolutePath()	返回文件的绝对路径
        System.out.println(file3.getAbsolutePath());

//        public String getPath()	返回定义文件时使用的路径
        System.out.println(file3.getPath());
        System.out.println(file2.getPath());

//        public String getName()	返回文件的名称，带后缀
        System.out.println(file2.getName());
        System.out.println(file1.getName());

//        public long lastModified()	返回文件的最后修改时间（时间毫秒值）
        System.out.println(file2.lastModified());
    }
}
