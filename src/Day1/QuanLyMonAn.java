/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {

    Scanner sc = new Scanner(System.in);

    public void nhap(List<MonAn> list) {
        String nhapTiep;
        do {
            String ten = getInput("ten: ");
            int gia = Integer.parseInt(getInput("gia: "));
            int soLuong = Integer.parseInt(getInput("so luong: "));
            list.add(new MonAn(ten, gia, soLuong));
            nhapTiep = getInput("tiep hay khong y-co/n-khong:");
        } while (nhapTiep.equalsIgnoreCase("y"));

//        mon.setTen(ten);
    }

    public String getInput(String message) {
        System.out.println("Nhap " + message);
        return sc.nextLine();
    }

    public void xuat(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (MonAn mon : list) {
                System.out.println(mon.toString());
            }
        }
    }

    public void tinhTong(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            int tongTien = 0;
            for (MonAn mon : list) {
                tongTien += mon.getTongTien();
            }
            System.out.println("Tong tien phai tra la " + tongTien);
        }
    }

    public void timMax(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            MonAn max = list.get(0);

            for (MonAn mon : list) {
                if (max.getTongTien() < mon.getTongTien()) {
                    max = mon;
                }
            }

            System.out.println("Mon an co tong tien lon nhat");
            System.out.println(max.toString());
        }
    }

    public void sapXep(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            // C1
            Collections.sort(list, Comparator.comparing(MonAn::getTongTien).reversed());
            System.out.println("Danh sach sau sap xep");
            xuat(list);
            // C2: Lamda expression
            list.sort((mon1, mon2) -> mon2.getTongTien() - mon1.getTongTien());
            System.out.println("Danh sach sau sap xep");
            xuat(list);
        }
    }
}
