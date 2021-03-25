
import java.io.FileReader;


public class ReaderExample {

    public static void main(String[] args) throws Exception {

        FileReader reader=new FileReader("e:/data/info.txt");
        char ch[]=new char[50];
        reader.read(ch);
        String s=new String(ch);
        System.out.println(s);
        reader.close();
        
    }
}
