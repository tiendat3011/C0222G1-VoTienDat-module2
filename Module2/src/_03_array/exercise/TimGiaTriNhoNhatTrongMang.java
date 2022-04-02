package _03_array.exercise;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 11};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
