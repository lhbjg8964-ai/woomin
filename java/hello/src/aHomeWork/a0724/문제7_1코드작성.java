package a0724;

import java.util.Scanner;

public class 문제7_1코드작성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번 학생 점수 입력");
            System.out.print("국어 : ");
            kor[i] = sc.nextInt();

            System.out.print("영어 : ");
            eng[i] = sc.nextInt();

            System.out.print("수학 : ");
            math[i] = sc.nextInt();

            System.out.println();
        }
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            int sum = kor[i] + eng[i] + math[i];
            double avg = (double) sum / 3;

            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\n",
                    i + 1, kor[i], eng[i], math[i], sum, avg);
        }

        sc.close();
    }
}