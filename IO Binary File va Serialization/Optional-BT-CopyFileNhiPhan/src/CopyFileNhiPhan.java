import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileNhiPhan {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("anh.PNG");
        FileOutputStream fout = new FileOutputStream("anhcopy.PNG");

        try {
            byte[] buffer = new byte[fin.available()];
            while ((fin.read(buffer) > 0)) {
                fout.write(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fin.close();
            fout.close();
        }
    }
}

