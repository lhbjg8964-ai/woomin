package a0724;

public class 문제7_2코드작성 {
    public static void main(String[] args) {
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 20);

            int tmp = a[0];
            a[0] = a[n];
            a[n] = tmp;
        }

        System.out.print("난수 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
    }
}