
import java.io.FileOutputStream;

public class FileWritingExampleTwo {
    public static void main(String[] args) throws Exception {

        //here we are writing something to a file
        
        //step-1 (open the stream)
            FileOutputStream fos=new FileOutputStream("e:/data/trial.txt");
        //step-2 (write the data on stream)
            String msg="hello user";
            byte b[]=msg.getBytes();
            //fos.write(b);
            fos.write(b, 1, 5);
        
        //step-3 (close the stream)
            fos.close();
            
            System.out.println("Data Stored Successfully.....");
    }
}
