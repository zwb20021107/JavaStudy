import java.io.File;

/**
 * @Author Wenbin Zuo
 * @Date 2023-12-02-21:15
 * @Description:
 */
public class FileTraverse {

    public static void traverse(File file){
        if(file.isDirectory()){
            for(File f: file.listFiles()){
                if(f.isFile()){
                    System.out.println(f.getName());
                }
                if(f.isDirectory()){
                    System.out.println(f.getName());
                    traverse(f);
                }
            }
        }

    }

    public static void main(String[] args) {

//        public String[] list()	获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        File file1 = new File("./data");
        for(String e : file1.list())
        {
            System.out.println(e);
        }
//        public File[] listFiles()(常用)	获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = file1.listFiles();
        // 遍历所有文件
        for(File f : files){
            traverse(f);
        }

    }
}
