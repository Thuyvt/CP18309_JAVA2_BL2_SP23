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
public class NhanVien implements IServiceKhachHang, IServiceGDV {

    @Override
    public void dangNhap() {
        System.out.println("Nhan vien dang nhap thanh cong");
    }

    @Override
    public void dangKy() {
        System.out.println("Nhan vien dang ky thanh cong");
    }

    @Override
    public void rutTien() {
        System.out.println("Nhan vien rut tien thanh cong");
    }

    @Override
    public void chuyenTien() {
        System.out.println("Nhan vien chuyen tien thanh cong");

    }
    
    @Override
    public void moTaiKhoan() {
        System.out.println("Nhan vien mo tai khoan thanh cong");
    }

    @Override
    public void khoaTaiKhoan() {
        System.out.println("Nhan vien khoa tai khoan thanh cong");
    }
    
}
