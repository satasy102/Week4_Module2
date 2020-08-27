import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTenLopHoc {
    //Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    //
    //Không chứa các ký tự đặc biệt
    //
    //Theo sau ký tự bắt đầu là 4 ký tự số
    //
    //Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    private static final String REGEX= "^[CAP]\\d{4}[GHIKLM]$";

    public static boolean validate(String regex) {
        Pattern pattern= Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("C0318G: "+validate("C0318G"));
        System.out.println("M0318G: "+validate("M0318G"));
        System.out.println("P0323/A: "+validate("P0323/A"));
    }
}
