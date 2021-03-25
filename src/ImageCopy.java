
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy {

    public static void main(String[] args) throws Exception {

        //reading an image file and writing its contents to some other file.
        
        FileInputStream fis=new FileInputStream("d:/images/whatsnew.png");
        FileOutputStream fos=new FileOutputStream("e:/data/picture.png");
        
        //reading the data from input stream
        int size=fis.available();
        byte b[]=new byte[size];
        fis.read(b);
        fis.close();
        
        //writing the data to output stream
        fos.write(b);
        fos.close();
        
        System.out.println("Data Transferred...");
        
        
    }
}
