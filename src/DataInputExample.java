
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExample {

    public static void main(String[] args) throws Exception {
        //here we will read premitive values from a file

        FileInputStream fis = new FileInputStream("e:/data/empinfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        int eno=dis.readInt();
        double sal=dis.readDouble();
        boolean married=dis.readBoolean();
        dis.close(); fis.close();
        System.out.println("Ecode    : "+eno);
        System.out.println("Salary   : "+sal);
        System.out.println("M.Status : "+married);

    }
}
