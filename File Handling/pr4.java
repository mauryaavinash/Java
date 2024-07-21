// bufferedWriter
// bufferReader
import java.io.*;
public class pr4 {
    public static void main(String[] args) throws IOException{
        
        // BufferedWriter bout = new BufferedWriter(new FileWriter("H:/Java/File Handling/name.txt"));

        // bout.write("My name is Golu Maurya");
        // bout.close();

        BufferedReader br = new BufferedReader(new FileReader("H:/Java/File Handling/name.txt"));

        int i;
        do{
            i = br.read();
            if(i != -1)
                System.out.print((char)i);
        }while(i!= -1);
    }
}
