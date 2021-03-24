
import java.io.FileOutputStream;


public class FileWritingExampleOne {

    public static void main(String[] args) throws Exception {

        //here we are writing something to a file
        
        //step-1 (open the stream)
            FileOutputStream fos=new FileOutputStream("e:/data/trial.txt",true);
        //step-2 (write the data on stream)
            fos.write(69);
            fos.write(70);
            fos.write(71);
            fos.write(72);
            fos.write(73);
        //step-3 (close the stream)
            fos.close();
            
            System.out.println("Data Stored Successfully.....");
    }
}

/*
    if you want to append the data in an existing file

    FileOutputStream ob=new FileOutputStream(filename,true);    //append
                                                      false     //overwrite

*/