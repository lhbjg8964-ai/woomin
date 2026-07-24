import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[45];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 45);

            int tmp = lotto[0];
            lotto[0] = lotto[n];
            lotto[n] = tmp;
        }

        System.out.print("로또 번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}