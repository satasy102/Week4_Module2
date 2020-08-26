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
            else if (target.exists()) System.out.println("File Target da ton tai");
            else {
                fileReader = new FileReader(source);
                fileWriter = new FileWriter(target);

                BufferedReader reader = new BufferedReader(fileReader);

                String line;

                while ((line = reader.readLine()) != null) {
                    fileWriter.write(line);
                    fileWriter.write("\n");
                }

                System.out.println("Sao chep thanh cong");
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
