import java.io.File;
import java.io.IOException;

public class FileOpen {
    public static void main(String[] args) {
        File file=new File("e://text/name2.txt");
        if (file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
        }else{
            System.out.println("文件不存在！\n正在创建文件。。。。");
            try {
                file.createNewFile();
                System.out.println("文件创建成功！");
                System.out.println(file.getName());
                System.out.println(file.getAbsoluteFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
