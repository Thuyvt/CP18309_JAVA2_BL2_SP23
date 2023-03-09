/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import Day1.MonAn;

/**
 *
 * @author ThuyVT
 */
public class PhoBo extends MonAn {
    private int quay;

    public PhoBo() {
    }

    public PhoBo(int quay, String ten, int gia, int soLuong) {
        super(ten, gia, soLuong);
        this.quay = quay;
    }

    public int getQuay() {
        return quay;
    }

    public void setQuay(int quay) {
        this.quay = quay;
    }

    @Override
    public String toString() {
        return "PhoBo{ten = " + super.getTen() +"gia=" + super.getGia() +
                "so luong =" + super.soLuong + "quay=" + quay + '}';
    }
    
    
}
