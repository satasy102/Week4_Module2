import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlTinTuc {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnexpress.net/");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            scanner.close();

            content = content.replaceAll("\\n+", "");

                    Pattern p = Pattern.compile("title=\"(.*?)\"");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
