import java.io.*;
public class  LineOriented {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader bufferIn = new BufferedReader(new FileReader("./source.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("./lineOriented.txt"))

        ) {
           String content;
           while ((content = bufferIn.readLine()) != null) {
               out.println(content);
           }
        } catch (IOException e) {
           System.out.println(e);
       }
    }
}