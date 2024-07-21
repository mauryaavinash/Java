// import java.io.IOException;
import java.io.*;
public class pr2 {
    public static void main(String[] args) throws IOException{
        int i;
        // //FileOutputStream fout =new  FileOutputStream("H:/Java/File Handling/name.txt");
        // String s = "Avinash";

        // char ch[] = s.toCharArray();
        // for(i = 0; i < s.length(); i++){
        //     fout.write(ch[i]);
        // }
        // fout.close();
        FileInputStream fin = new FileInputStream("H:/Java/File Handling/name.txt");
        do{
            i = fin.read();
            if(i != -1)
                System.out.print((char)i);
        }while(i != -1);
        fin.close();
    }
}
