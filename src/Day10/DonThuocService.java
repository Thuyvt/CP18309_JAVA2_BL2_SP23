/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class DonThuocService {
    public String ghiFile(String path, List<DonThuoc> list) {
        try {
            // Mở luồng đến file cần lưu trữ
            FileOutputStream fos = new FileOutputStream(path);
            // Mở luồng ghi file dạng đối tượng
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // thực hiện ghi danh sách vào file
            oos.writeObject(list);
            
            // đóng luồng
            oos.close();
            fos.close();
            
            return "Ghi file thành công";
        } catch (Exception ex) {
            // In ra lỗi
            ex.printStackTrace();
            return "Ghi file thất bại";
        }
    }
}
