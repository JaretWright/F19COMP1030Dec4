import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class WriteToFile {
    public static void main(String[] args)  {
        try {

            //to make it so you can append to a file
            FileWriter fw = new FileWriter("appendFile.txt", true);
            Formatter outputFile = new Formatter(fw);

            System.out.printf("Here is a line to the console");
            outputFile.format("1 week left\n");
            outputFile.format("Lunch cost $%6.2f\n", 64.73);
            outputFile.format("Utsav has gifts for everyone\n");

            outputFile.close();
            fw.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
