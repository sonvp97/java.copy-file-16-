import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("num.txt");
        File file1 = new File("num1.txt");
        copyFileUsingStream(file,file1);
    }
    static void copyFileUsingStream(File source,File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}