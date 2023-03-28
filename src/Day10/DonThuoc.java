/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class DonThuoc implements Serializable {

    private String ten;
    private int soLuong;
    private String loai;
    private double gia;
    private String hang;
    private String mota;
    private boolean theoDon;

    public DonThuoc() {
    }

    public DonThuoc(String ten, int soLuong, String loai, double gia, String hang, String mota, boolean theoDon) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.loai = loai;
        this.gia = gia;
        this.hang = hang;
        this.mota = mota;
        this.theoDon = theoDon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public boolean isTheoDon() {
        return theoDon;
    }

    public void setTheoDon(boolean theoDon) {
        this.theoDon = theoDon;
    }
        /* 
     Tên thuốc: String
 Số lượng: int
 Loại: String (viên/vỉ/lọ/)
 Giá: doube
 Hãng sản xuất: String
 Mô tả: String
 Là thuốc theo đơn: boolean
     */
    public void inThongTin() {
        System.out.println("Tên:" + this.ten);
        System.out.println("Số lượng:" + this.soLuong);
        System.out.println("Loại:" + this.loai);
        System.out.println("Gia:" + this.gia);
        System.out.println("Hãng:"+ this.hang);
        System.out.println("Mô tả:" + this.mota);
        System.out.println("Thuốc theo đơn:" + this.theoDon);
    }

    @Override
    public String toString() {
        return "DonThuoc{" + "ten=" + ten + ", soLuong=" + soLuong + ", loai=" + loai + ", gia=" + gia + ", hang=" + hang + ", mota=" + mota + ", theoDon=" + theoDon + '}';
    }
    
    public double tinhTien() {
        return this.gia * this.soLuong;
    }
}
