/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so nguyen:");
            int soNguyen = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap so thuc:");
            double soThuc = Double.parseDouble(sc.nextLine());
            double soNull = Double.parseDouble(null);
        } catch (InputMismatchException ip) {
            System.out.println("Nhap sai dinh dang so nguyen");
            System.out.println(ip.getMessage());
        } catch (NumberFormatException nf) {
            System.out.println("Nhap sai dinh dang so thuc");
        } catch (Exception ex) {
            System.out.println("Co loi xay ra");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Het bai");
        }
    }
}
