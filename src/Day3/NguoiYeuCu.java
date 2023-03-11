/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author ThuyVT
 */
public class NguoiYeuCu {
    private String ten;
    private int tuoi;
    private double canNang;
    private int gioiTinh; // 1- Nam, 2- Nữ
    private String queQuan;
    private boolean tthn; // true: đang độc thân, false: không độc thân

    public NguoiYeuCu() {
    }

    public NguoiYeuCu(String ten, int tuoi, double canNang, int gioiTinh, String queQuan, boolean tthn) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.tthn = tthn;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public boolean isTthn() {
        return tthn;
    }

    public void setTthn(boolean tthn) {
        this.tthn = tthn;
    }
    
    
    
}
