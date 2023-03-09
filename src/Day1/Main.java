/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyMonAn ql = new QuanLyMonAn();
        List<MonAn> list = new ArrayList<>();
        while (true) {
            System.out.println("======MENU=======");
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. Tinh tong");
            System.out.println("4. Tim max");
            System.out.println("5. Sap xep");
            String menu = sc.nextLine();
            switch (menu) {
                case "1" -> {
                    ql.nhap(list);
                    break;
                }
                case "2" -> {
                    ql.xuat(list);
                    break;
                }
                case "3" -> {
                    ql.tinhTong(list);
                    break;
                }
                case "4" -> {
                    ql.timMax(list);
                    break;
                }
                case "5" -> {
                    ql.sapXep(list);
                    break;
                }
                case "0" -> {
                    System.exit(0);
                }
            }
        }
    }
}
