import java.io.File;
import java.io.IOException;
public class pr1{
    public static void main(String[] args) throws IOException{
        
        File f1 = new File("H:/Java/File Handling/name.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
        // f1.delete();
        System.out.println(f1.length());

    }
}