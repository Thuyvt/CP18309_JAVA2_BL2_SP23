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
        System.out.println("");
        String menu = sc.nextLine();
        switch(menu) {
            case "1" -> {
                ql.nhap(list);
                break;
            }
        }
    }
}
