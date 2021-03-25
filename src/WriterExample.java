import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {
        //here we will write to a file using Writer class
        
        //step-1 (open the stream)
        FileWriter writer=new FileWriter("e:/data/info.txt");
        
        //step-2 (write the data on stream)
        String text="this text we are writing to a file using Writer....!";
        writer.write(text,0,25);
        
        //step-3 (close the stream)
        writer.close();
        
        System.out.println("Data Stored...!");
    }
}
