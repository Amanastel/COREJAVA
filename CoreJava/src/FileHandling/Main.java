package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        File file = new File("src/FileHandling/abc.txt");

        if (!file.exists())
            try {
                file.createNewFile();
                System.out.println("File created");
            } catch (Exception e) {
                System.out.println(e);
            }
        else
            System.out.println("File already exists");



        // file writer
        try {
            FileWriter fileWriter = new FileWriter("src/FileHandling/abc.txt");
            fileWriter.write("this is a file handling program in java");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


         */




        File file = new File("src/FileHandling/abc.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        if (file.delete())
            System.out.println("File deleted");
        else
            System.out.println("File not deleted");

    }
}
