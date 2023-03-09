/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        IServiceKhachHang kh = new KhachHang();
        kh.dangKy();
        kh.dangNhap();
        kh.rutTien();
        kh.chuyenTien();
        
        NhanVien nv = new NhanVien();
        nv.dangKy();
        nv.dangNhap();
        nv.rutTien();
        nv.chuyenTien();
        nv.moTaiKhoan();
        nv.khoaTaiKhoan();
    }
}
