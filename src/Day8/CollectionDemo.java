/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import Day5.LapTop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionDemo {

    public static void main(String[] args) {
        // HashSet: loai bo phan tu trung lap
        Set<String> hashSetStr = new HashSet<>();
        // add(): them gia tri
        hashSetStr.add("Java 1");
        hashSetStr.add("Java 2");
        hashSetStr.add("Java 1");
        hashSetStr.add("c");
        System.out.println(hashSetStr);
        // remove(): xoa gia tri
        hashSetStr.remove("Java 1");
        System.out.println(hashSetStr);

        // TreeSet: sap xep cac phan tu
        Set<Integer> treeSetInt = new TreeSet<>();
        treeSetInt.add(9);
        treeSetInt.add(9);
        treeSetInt.add(5);
        treeSetInt.add(8);
        treeSetInt.add(1);
        System.out.println(treeSetInt);

        List<LapTop> list = new ArrayList<>();
        LapTop m2 = new LapTop("M2", 33000, "Mac", 1, false);
        list.add(m2);
        list.add(m2);
        list.add(new LapTop("M5", 35000, "Mac", 1, false));
        list.add(new LapTop("M3", 32000, "Mac", 1, false));
        list.add(new LapTop("M4", 34000, "Mac", 1, false));
        list.add(new LapTop("M1", 31000, "Mac", 1, false));
        Set<LapTop> setLap = new HashSet<>();
        // addAll(): them toan bo list vao set
        setLap.addAll(list);
        // for de duyet set
        for (LapTop lt : setLap) {
            System.out.print(lt.getTen() + " ");
        }
        Set<LapTop> treeLap = new TreeSet<>();
        treeLap.addAll(list);
        System.out.println("\nDanh sach laptop = treeSet");
        for (LapTop lt : treeLap) {
            System.out.print(lt.getTen() + " ");
        }
        // Map
        Map<String, String> map = new HashMap<>();
        // put(): them phan tu vao map
        map.put("MOB1023", "Java 2");
        map.put("MOB1023", "Java 2");
        map.put("MOB1014", "Java 1");
        map.put("COM108", "C");
        System.out.println("\n" +map);
        // get(key): hien thi thong tin 1 doi tuong
        System.out.println("Mon MOB1014 la:" + map.get("MOB1014"));
        // duyet map
        // keySet(): lay ra tap gia tri cua key
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + " - " +map.get(k));
        }
    }
}
