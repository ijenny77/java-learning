import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader src = null;
        FileWriter dest = null;

        try {
            src = new FileReader("src.txt");
            dest = new FileWriter("dest.txt");
            int content;
            while((content = src.read())!= -1){
                dest.write((char) content);
            }
        } finally{
            src.close();
            dest.close();
        }
    }    
}