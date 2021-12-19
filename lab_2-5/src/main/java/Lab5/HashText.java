package Lab5;

import java.io.FileInputStream;
import java.io.IOException;

public class HashText {
    public static void Console(){
        int c;
        try(FileInputStream reader = new FileInputStream("/Users/maxma/test/src/main/java/Lab5/result.txt"))
        {
            // читаем посимвольно
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void Hash(){
        String text1 = "==> crunchify:4 ";
        System.out.print("\nEncryption: ");
        char[] chars = text1.toCharArray();
        for(char k : chars){
            k+=5;
            System.out.print(k);
        }
        System.out.print("\nDecryption: ");
        int key = 5;
        String text2 = "BBC%hwzshmnk~?9%";
        char[] chars_key = text2.toCharArray();
        for (char f: chars_key){
            f -= key;
            System.out.print(f);
        }
    }
}
