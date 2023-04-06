/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class QuanAo implements Serializable{
    private String ma;
    private String ten;
    private int loai;
    private String size;
    private double gia;

    public QuanAo() {
    }

    public QuanAo(String ma, String ten, int loai, String size, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.size = size;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public String getTrangThai() {
        if (this.gia > 50) {
            return "Dat";
        } else {
            return "Re";
        }
    }
    
}
