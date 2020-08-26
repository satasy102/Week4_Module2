import java.io.Serializable;

public class SanPham implements Serializable {
    private int id;
    private String maSP;
    private String tenSP;
    private String hangSX;
    private long giaSP;
    private String cacMoTaKhac;

    public SanPham(){}

    public SanPham(int id, String maSP, String tenSP, String hangSX, long giaSP, String cacMoTaKhac) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.giaSP = giaSP;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public long getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(long giaSP) {
        this.giaSP = giaSP;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }
}
