import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamInOut {
    private static final String SANPHAM_FILE_NAME = "QuanLySanPham.txt";

    public void write(List<SanPham> sanPhamList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SANPHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPhamList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public List<SanPham> read() {
        List<SanPham> studentList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SANPHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            studentList = (List<SanPham>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return studentList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
