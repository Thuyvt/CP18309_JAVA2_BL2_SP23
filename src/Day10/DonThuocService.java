/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class DonThuocService {
    public String ghiFile(String path, List<DonThuoc> list) {
        try {
            // B1: Mở luồng đến file cần lưu trữ
            FileOutputStream fos = new FileOutputStream(path);
            // B2: Mở luồng ghi file dạng đối tượng
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // B3: thực hiện ghi danh sách vào file
            oos.writeObject(list);
            
            // B4: đóng luồng
            oos.close();
            fos.close();
            // B5: implements Serializable trong đối tượng
            
            return "Ghi file thành công";
        } catch (Exception ex) {
            // In ra lỗi
            ex.printStackTrace();
            return "Ghi file thất bại";
        }
    }
    
    public String docFile(String path, List<DonThuoc> danhSach) {
        try {
            // B1: mở luồng đọc dữ liệu vào chương trình
            FileInputStream fis = new FileInputStream(path);
            // B2: mở luồng đọc file dạng đối tượng
            ObjectInputStream ois = new ObjectInputStream(fis);
            // B3: Đọc dữ liệu trong file
            List<DonThuoc> ds = (List<DonThuoc>) ois.readObject();
            // xóa dữ liệu danh sách cũ
            danhSach.clear();
            // thêm danh sách từ file vào danh sách gốc
            danhSach.addAll(ds);
            
            // B5: đóng luồng
            ois.close();
            fis.close();
            
            return "Đọc file thành công";
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Đọc file thất bại";
        }
    }
}
