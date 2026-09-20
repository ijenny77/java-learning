
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOPractice{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("My name is Jenny\n");
            writer.write("I am 16 years old\n");            
            writer.close();
        }catch(IOException e){
            System.out.println("Error writing to file.");
        }
        try {
            File file = new File("test.txt");
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
                System.out.println("Not found yet.");
        }
    }
}