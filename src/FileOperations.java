
import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        File f=new File("e:/data/Demo.java");
        boolean res=f.createNewFile();
        /*
        File f1 = new File("e:/data/file2.txt");
        File f2 = new File("e:/data/file2f01.txt");
        boolean res = f1.renameTo(f2);
        //File f=new File("e:/data/abcd");
        //boolean res=f.delete();
        //boolean res=f.mkdir();
        */
        if (res == true) {
            System.out.println("Operation Success...");
        } else {
            System.out.println("Operation Failed...");
        }

    }
}
/*
    methods for creating folder, deleting file/folder, renameing file, creating file

    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()
    
    
*/
