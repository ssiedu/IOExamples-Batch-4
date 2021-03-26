
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class ObjectOutputExample {

    public static void main(String[] args) throws Exception {

        Employee emp=new Employee(1001,"ABCD",50000);
        emp.show();
        
        //here we will save the state of the object
        
        FileOutputStream fos=new FileOutputStream("e:/data/empobj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.close();
        fos.close();
        System.out.println("Object Stored Successfully......");
        
    }
}
