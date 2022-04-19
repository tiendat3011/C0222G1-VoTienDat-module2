package _11_stack_queue.exercise.tree_map2;

import java.util.Scanner;
import java.util.TreeMap;

public class OccurrencesInString {
    public static Scanner scanner = new Scanner(System.in);
//[Bài tập] Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map
    public static void main(String[] args) {
        System.out.println("Nhap chuoi ");
        String string = scanner.nextLine().toLowerCase();
        String[] newString = string.split(" ");//tách chuỗi
        int count = 1;

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newString.length; i++) {
            if (treeMap.containsKey(newString[i])) {
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1);
            } else {
                treeMap.put(newString[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}