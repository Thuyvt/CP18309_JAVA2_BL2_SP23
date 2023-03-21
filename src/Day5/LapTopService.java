/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class LapTopService {

    // Kiểm tra ký tự bao gồm chữ và số
    public boolean isChuoi(String str) {
        return str.matches("[a-z A-Z 0-9]+");
    }

    // Kiểm tra ký tự có phải số nguyên hay không
    public boolean isSoNguyen(String str) {
        return str.matches("\\d+");
    }

    // Kiểm tra ký tự có phải số thực hay không
    public boolean isSoThuc(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    // Tìm kiếm
    // subString(a, b) : cắt chuỗi từ a đến b
    // toLowerCase(): chuyển chuỗi thành viết thường
    // toUpperCase(): chuyển chuỗi thành viết hoa
    // startWiths("abc"): chuỗi bắt đầu bằng "abc"
    // endWiths("abc"): chuỗi kết thúc bằng "abc"
    // contains("abc"): chuỗi có chứa "abc"   
    public List<LapTop> timBangTen(List<LapTop> dsGoc, String ten) {
        List<LapTop> dsTimDuoc = new ArrayList<>();
        for (LapTop lt : dsGoc) {
            if (lt.getTen().toLowerCase().contains(ten.toLowerCase())) {
                dsTimDuoc.add(lt);
            }
        }
        return dsTimDuoc;
    }

    // Sắp xếp
    public void sapXep(List<LapTop> ds) {
        //  Sắp xếp theo tên tăng dần
        ds.sort(Comparator.comparing(LapTop::getTen));
        // Sắp xếp giảm giần theo tên
//        ds.sort(Comparator.comparing(LapTop::getTen).reversed());
    }
}
