import java.io.File;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-20:46
 * @Description:
 */
public class FileCreate {
    public static void main(String[] args) {
//        public File(String pathname)	根据文件路径创建文件对象
        File file1 = new File("../data");
//        public File(String parent, String child)	根据父路径名字符串和子路径名字符串创建文件对象
        File file2 = new File("../data", "/b");
//        public File(File  parent, String child)	根据父路径对应文件对象和子路径名字符串创建文件对象
        File file3 = new File(file1, "/b");
    }
}
