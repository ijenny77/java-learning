import java.io.*;

public class InputOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream source = null;
        FileOutputStream target = null; 

        try {
            source = new FileInputStream("./source.txt");
            target = new FileOutputStream("./destination.txt");
            int content ;
            while((content = source.read()) != -1){
                target.write((byte)content);
            }
        } finally{
            source.close();
            target.close();
        }
    }
}