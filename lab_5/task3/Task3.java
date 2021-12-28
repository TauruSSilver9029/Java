package task5.task3;

import java.io.*;

public class Task3 {

    public static void main(String[] args) throws IOException {
        char keyChar = 35;

        try (Reader reader = new BufferedReader(new FileReader("filetoread.txt"));
             Writer writer = new DecodedWriter(new BufferedWriter(new FileWriter("filetoprint.txt")), keyChar)) {

            int readedChar;

            while ((readedChar = reader.read()) != -1) {
                writer.write(readedChar);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}

