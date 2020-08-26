import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File source = new File("source.txt");
        File target = new File("target.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            if (!source.exists()) {
                throw new FileNotFoundException();
            }
//            else if (target.exists()) System.out.println("File Target da ton tai");
            else {
                fileReader = new FileReader(source);
                fileWriter = new FileWriter(target);

                BufferedReader reader = new BufferedReader(fileReader);

                int line;
                int count=0;
                while ((line = reader.read()) != -1) {
                    fileWriter.write(line);
                    count++;
                    System.out.println(line);
                }

                System.out.println("Sao chep "+count+" ky tu thanh cong");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Source khong ton tai.");
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}
