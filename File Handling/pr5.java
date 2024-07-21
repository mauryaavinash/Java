// character array reader;

import java.io.*;
public class pr5 {
    public static void main(String[] args) throws IOException {
        
        char[] ary = {'a','v','i','n','a','s','h'};
        CharArrayReader reader= new CharArrayReader(ary);

        int i;
        do{
            i = reader.read();
            if(i != -1)
                System.out.print((char)i);
        }while(i != -1);
    }
}
