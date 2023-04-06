/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class QuanAoService {

    public String ghiFile(String path, List<QuanAo> danhSach) {
        try {
            File file = new File(path);
            // kiểm tra file nếu chưa tồn tại thực hiện tạo mới
            if (!file.exists()) {
                file.createNewFile();
            }
            // ghi danh sách ra file
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // ghi cả danh sách vào file
//          oos.writeObject(danhSach);
            // ghi từng đối tượng vào file
            for (QuanAo ma : danhSach) {
                oos.writeObject(ma);
            }
            // đóng luồng
            oos.close();
            fos.close();
            return "Ghi file thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path, List<QuanAo> danhSach) {
        try {
            File file = new File(path);
            // file có tồn tại hay không
            if (!file.exists()) {
                return "File không tồn tại";
            }
            // doc file
            // Mở luồng đọc file cơ bản
            FileInputStream fis = new FileInputStream(file);
            // Mở luồng đọc file dạng đối tượng
            ObjectInputStream ois = new ObjectInputStream(fis);
            // ghi vào là 1 danh sách, đọc ra cũng phải là 1 danh sách
//            danhSach.addAll((List<MonAn>) ois.readObject());
            QuanAo ma = new QuanAo();
            while (fis.available() > 0) {
                // đọc từng dòng trong file
                ma = (QuanAo) ois.readObject();
                // thêm đối tượng vào danh sách
                danhSach.add(ma);
            }

            System.out.println(danhSach.size());
            // đóng luồng
            ois.close();
            fis.close();
            return "Đọc file thành công";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Đọc file thát bại";
        }
    }
    
}
