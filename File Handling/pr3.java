
import java.io.*;

public class pr3 {
    public static void main(String[] args) throws Exception {
        // BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("H:/Java/File Handling/name.txt"));

        // String s="My name is Avinash ";    
        // System.out.println(s);
        // byte b[]=s.getBytes();    
        // bout.write(b);
        // bout.close();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("H:/Java/File Handling/name.txt"));
        int i;
        do{
            i = bin.read();
            if(i != -1)
                System.out.print((char)i);

        }while(i != -1);
        bin.close();
    }
}
