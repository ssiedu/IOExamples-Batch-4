
import java.io.FileInputStream;


public class FileReadingExampleTwo {

    public static void main(String[] args) throws Exception {

        //opening a stream on file info.txt
        FileInputStream fis=new FileInputStream("e:/data/info.txt");
        
        //reading the data
            
            int n=fis.available();  //no of bytes available to read
            byte b[]=new byte[n];
            fis.read(b);
            String s=new String(b);
            System.out.println(s);
        //closing he file
        fis.close();
    }
}
