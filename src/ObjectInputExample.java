
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ObjectInputExample {

    public static void main(String[] args) throws Exception {
        //here we will read the object from empobj.txt (deserialize)
        
        FileInputStream fis=new FileInputStream("e:/data/empobj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee e=(Employee)ois.readObject();
        e.show();
        ois.close();
        fis.close();
        
    }
}
