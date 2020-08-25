import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        InputStream iS = null;
        OutputStream oS = null;

        try {
            File source = new File("source.txt");
            File target = new File("target.txt");

            if (!source.exists()) {
                System.out.println("File source is not existed");
            } else if (target.exists()) {
                System.out.println("File target is existed");
            } else {

                iS = new FileInputStream(source);
                oS = new FileOutputStream(target);
//                Scanner sc = new Scanner(iS);
//                int count = 0;
//                while (sc.hasNextByte()) {
//                    sc.nextByte();
//                    count++;
//                }

                byte[] buffer = new byte[1024];

                while (iS.read(buffer) > 0) {
                    oS.write(buffer);
                }


                System.out.println("File is copied successful!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (iS != null) iS.close();

            if (oS != null) oS.close();

        }
    }
}
