import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class FileExamples {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a file or directory name: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        System.out.printf("The file or directory '%s' exists: %b%n", fileName, file.exists());

        if (file.exists())
        {
            System.out.printf("The file %s a directory.%n", file.isDirectory()?"is":"is not");
            System.out.printf("The file %s a file.%n", file.isFile()?"is":"is not");
            System.out.printf("The relative path is %s%n", file.getPath());
            System.out.printf("The absolute path is %s%n", file.getAbsolutePath());
            System.out.printf("The file was last modified on: %s%n", file.lastModified());
            Date dateModified = new Date(file.lastModified());
            System.out.printf("The file was last modified on: %s%n", dateModified);

            if (file.isDirectory())
            {
                System.out.println("The items in the directory are:");
                File[] directoryElements = file.listFiles();

                for (int i=0; i<directoryElements.length; i++)
                    System.out.println("    "+directoryElements[i].getName());
            }
            else if (file.isFile())
            {
                try {
                    Scanner fileToRead = new Scanner(file);

                    System.out.println("\nHere is the contents of the file:");
                    while(fileToRead.hasNext())
                    {
                        System.out.println(fileToRead.nextLine());
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
