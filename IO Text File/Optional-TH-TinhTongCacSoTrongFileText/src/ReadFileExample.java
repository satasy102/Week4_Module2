import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File inFile=new File("Number.txt");
            if(!inFile.exists()) throw new FileNotFoundException();
            FileReader fileReader=new FileReader(inFile);
            BufferedReader reader=new BufferedReader(fileReader);

            String line=null;
            double sum=0;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
                sum+=Double.parseDouble(line);
            }

            System.out.println("Tong la: " + sum);

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Co 1 hoac nhieu du lieu khong phai dang so");
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
