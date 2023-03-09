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
public class KhachHang implements IServiceKhachHang {

    @Override
    public void dangNhap() {
        System.out.println("Khach hang dang nhap thanh cong");
    }

    @Override
    public void dangKy() {
        System.out.println("Khach hang dang ky thanh cong");
    }

    @Override
    public void rutTien() {
        System.out.println("Khach hang rut tien thanh cong");
    }

    @Override
    public void chuyenTien() {
        System.out.println("Khach hang chuyen tien thanh cong");

    }

}
