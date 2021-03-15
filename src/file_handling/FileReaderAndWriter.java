package file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

    public static void main(String[] args) {


        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("FHDemo.txt");
            fileWriter.write("Today is Sunday");

            System.out.println("File write successfully..");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        try {
            fileReader = new FileReader("FHDemo.txt");
            int i = fileReader.read();

            while (i > 0) {
                System.out.println((char) i);
                i = fileReader.read();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}