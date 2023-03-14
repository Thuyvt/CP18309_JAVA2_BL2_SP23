/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

/**
 *
 * @author ThuyVT
 */
public class oto {
    private String hang;
    private int tuoi;
    private String xuatXu;
    private int kichco;
    private double namPH;
    private boolean tt;

    public oto() {
    }

    public oto(String hang, int tuoi, String xuatXu, int kichco, double namPH, boolean tt) {
        this.hang = hang;
        this.tuoi = tuoi;
        this.xuatXu = xuatXu;
        this.kichco = kichco;
        this.namPH = namPH;
        this.tt = tt;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getKichco() {
        return kichco;
    }

    public void setKichco(int kichco) {
        this.kichco = kichco;
    }

    public double getNamPH() {
        return namPH;
    }

    public void setNamPH(double namPH) {
        this.namPH = namPH;
    }

    public boolean isTt() {
        return tt;
    }

    public void setTt(boolean tt) {
        this.tt = tt;
    }

   
    
}
