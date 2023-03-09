/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author ThuyVT
 */
public class TraSua extends MonAn{
    private String topping;

    public TraSua() {
    }

    public TraSua(String topping, String ten, int gia, int soLuong) {
        super(ten, gia, soLuong);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "TraSua{ten = " + super.getTen() +"gia=" + super.gia +
                "so luong =" + super.soLuong +"topping=" + topping + '}';
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    
}
