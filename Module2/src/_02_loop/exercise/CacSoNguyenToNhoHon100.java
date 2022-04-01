package _02_loop.exercise;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            int a = 0;
            for (int i = 2; num > i; i++) {
                if (num % i == 0) {
                    a++;
                }
            }
            if (a == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}

