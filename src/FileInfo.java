
import java.io.File;

public class FileInfo {

    public static void main(String[] args) {

        File f = new File("e:/data");

        if (f.isDirectory()) {
            String names[] = f.list();
            for (String name : names) {
                System.out.println(name);
            }

        }else{
            System.out.println("Not Found or Not a Directory");
        }

        /*
        long val=f.lastModified();
        java.util.Date dt=new java.util.Date(val);
        System.out.println(val);
        System.out.println(dt);
         */
        //boolean res=f.isHidden();
        ///boolean res=f.canWrite();
        //System.out.println(res);
        /*
        if (f.exists()) {
            long val = f.length();
            System.out.println("File Size : " + val);
        } else {
            System.out.println("Not Available...");
        }
         */
    }
}
/*
    File Methods (Non-Static)
    boolean isDirectory()   if it gives true that means its a directory
    boolean isFile()
    String[] list()     gives the contents of a folder
    boolean exists()
    long length()
    boolean isHidden()
    boolean canWrite()
    long lastModifier() 
        no of milli-second that have passed from 1st jan 1970 midnight to
        file modification.(epoch)


    File Constructor

        File(String)
        File(String,String)


 */
