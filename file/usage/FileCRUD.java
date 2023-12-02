import java.io.File;
import java.io.IOException;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-21:03
 * @Description:
 */
public class FileCRUD {
    public static void main(String[] args) throws IOException {
//        public boolean createNewFile()	创建一个新的空的文件
        File file1 = new File("./data/1.txt");
        file1.createNewFile();

//        public boolean mkdir()	只能创建一级文件夹
        File file2 = new File("./d");
        file2.mkdir();
//        public boolean mkdirs()	可以创建多级文件夹
        File file3 = new File("./c/d/s/a/");
        file3.mkdirs();
//        public boolean delete()	删除由此抽象路径名表示的文件或空文件夹
        File file4 = new File("data/a/c/cc");
        file4.delete();

    }
}
