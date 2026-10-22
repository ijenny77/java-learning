import java.io.*;

public class BufferedStream{
    public static void main(String[] args) throws IOException {
        BufferedInputStream srcFile = null;
        BufferedOutputStream destFile = null;

        try {
            srcFile = new BufferedInputStream(new FileInputStream("src.txt"));
            destFile = new BufferedOutputStream(new FileOutputStream("destFile.txt"));
            int content;
            while((content = srcFile.read())!= -1){
                destFile.write((byte) content);
            }
        } finally{
            srcFile.close();
            destFile.close();
        }
    }
}