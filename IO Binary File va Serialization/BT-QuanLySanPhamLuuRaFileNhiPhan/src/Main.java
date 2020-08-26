
public class Main {

    public static void main(String[] args) {
        int choose = 0;
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        int studentId;

        showMenu();
        while (true) {
            choose = quanLySanPham.kiemTraSo(choose);
            switch (choose) {
                case 1 -> quanLySanPham.them();
                case 2 -> {
                    studentId = quanLySanPham.nhapID();
                    quanLySanPham.sua(studentId);
                }
                case 3 -> {
                    studentId = quanLySanPham.nhapID();
                    quanLySanPham.xoa(studentId);
                }
                case 4 -> quanLySanPham.hienThiDanhSach();
                case 5 -> {
                    studentId = quanLySanPham.nhapID();
                    quanLySanPham.timKiemSP(studentId);
                }
                case 0 -> {
                    System.out.println("Dang dong!");
                    System.exit(0);
                }
                default -> System.out.println("Khong co muc nay.");
            }
            showMenu();

        }
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them san pham");
        System.out.println("2. Sua san pham");
        System.out.println("3. Xoa san pham");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Tim kiem san pham");
        System.out.println("0. Thoat");
        System.out.println("---------------------------");
        System.out.println("Chon: ");
    }
}
