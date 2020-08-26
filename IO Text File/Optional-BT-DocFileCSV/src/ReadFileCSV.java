import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args) {
        try{

            File inFile=new File("mytest.csv");
            FileReader fileReader=new FileReader(inFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;

            while ((line=reader.readLine())!=null){
                String[] country=line.split(",");
                System.out.println("Code "+ country[4]+ ": "+ country[5]);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
