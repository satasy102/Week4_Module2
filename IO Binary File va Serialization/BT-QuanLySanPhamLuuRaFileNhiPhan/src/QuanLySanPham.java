import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    public static Scanner scanner = new Scanner(System.in);
    private final SanPhamInOut sanPhamInOut;
    private final List<SanPham> sanPhamList;

    public QuanLySanPham() {
        sanPhamInOut = new SanPhamInOut();
        sanPhamList = sanPhamInOut.read();
    }

    public void them() {
        int id = (sanPhamList.size() > 0) ? (sanPhamList.size() + 1) : 1;
        String tenSP = nhapTenSP();
        String maSP = nhapMaSP();
        String hangSX = nhapHangSX();
        String moTaSP = nhapMoTaSP();
        long giaSP = nhapGiaSP();

        SanPham sanPham = new SanPham(id, maSP, tenSP, hangSX, giaSP, moTaSP);
        sanPhamList.add(sanPham);
        sanPhamInOut.write(sanPhamList);

    }

    private long nhapGiaSP() {
        System.out.println("Nhap gia san pham");
        int gia = 0;
        return kiemTraSo(gia);
    }

    private String nhapMoTaSP() {
        System.out.println("Nhap cac mo ta san pham");
        return scanner.nextLine();
    }

    private String nhapHangSX() {
        System.out.println("Nhap hang san xuat");
        return scanner.nextLine();
    }

    private String nhapMaSP() {
        System.out.println("Nhap ma san pham");
        return scanner.nextLine();
    }

    private String nhapTenSP() {
        System.out.println("Nhap ten san pham");
        return scanner.nextLine();
    }

    public void sua(int id) {
        boolean isExisted = false;
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getId() == id) {
                isExisted = true;
                sanPham.setTenSP(nhapTenSP());
                sanPham.setMaSP(nhapMaSP());
                sanPham.setGiaSP(nhapGiaSP());
                sanPham.setHangSX(nhapHangSX());
                sanPham.setCacMoTaKhac(nhapMoTaSP());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d khong ton tai.\n", id);
        } else {
            sanPhamInOut.write(sanPhamList);
        }
    }

    public void xoa(int id) {
        SanPham sanPham = null;

        for (SanPham sp : sanPhamList) {
            if (sp.getId() == id) {
                sanPham = sp;
                break;
            }
        }
        if (sanPham != null) {
            sanPhamList.remove(sanPham);
            sanPhamInOut.write(sanPhamList);
        } else {
            System.out.printf("id = %d khong ton tai.\n", id);
        }
    }

    public void hienThiDanhSach() {
        tieuDe();
        for (SanPham sanPham : sanPhamList) {
            thongTinTungSanPham(sanPham);
        }
    }

    private void thongTinTungSanPham(SanPham sanPham) {
        System.out.printf("%5d | ", sanPham.getId());
        System.out.printf("%20s | ", sanPham.getMaSP());
        System.out.printf("%20s | ", sanPham.getTenSP());
        System.out.printf("%20s | ", sanPham.getHangSX());
        System.out.printf("%15d | ", sanPham.getGiaSP());
        System.out.printf("%s\n", sanPham.getCacMoTaKhac());
    }

    public void timKiemSP(int id) {
        SanPham sanPham = null;

        for (SanPham sp : sanPhamList) {
            if (sp.getId() == id) {
                sanPham = sp;
                break;
            }
        }

        if (sanPham != null) {
            tieuDe();

            thongTinTungSanPham(sanPham);
        } else {
            System.out.printf("id = %d khong ton tai.\n", id);
        }

    }

    private void tieuDe() {
        System.out.printf("%5s | ", "ID");
        System.out.printf("%20s | ", "MA SAN PHAM");
        System.out.printf("%20s | ", "TEN SAN PHAM");
        System.out.printf("%20s | ", "HANG SAN XUAT");
        System.out.printf("%15s | ", "GIA SAN PHAM");
        System.out.printf("%s\n", "CAC MO TA");
    }

    public int nhapID() {
        System.out.print("Nhap id san pham: ");
        while (true) {
            try {
                return Integer.parseInt((scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.out.print("Sai dinh dang so. Nhap lai ID:");
            }
        }
    }

    public int kiemTraSo(int num) {
        String str;
        while (true) {
            try {
                str = scanner.nextLine();
                num = Integer.parseInt(str);
                return num;
            } catch (NumberFormatException ex) {
                System.out.println("Sai dinh dang so. Nhap lai:");
            }
        }
    }
}
