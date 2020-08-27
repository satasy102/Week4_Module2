import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {
    //Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    //
    //x là ký tự số
    //
    //Không chứa các ký tự đặc biệt

    private static final String REGEX="^[(]\\d{2}[)]-[(][0]{1}[1-9]\\d{8}[)]$";

    public static boolean validate(String regex) {
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("(84)-(0978489648): " + validate("(84)-(0978489648)"));
        System.out.println("(98)+(22222222): " + validate("(98)+(22222222)"));
    }
}
