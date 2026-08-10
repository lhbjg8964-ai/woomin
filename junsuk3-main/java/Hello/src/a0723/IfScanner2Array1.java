package a0723;

import java.util.Scanner;

public class IfScanner2Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[3];

        System.out.print("국어점수 : ");
        score[0] = sc.nextInt();

        System.out.print("영어점수 : ");
        score[1]= sc.nextInt();
        
        System.out.print("수학점수 : ");
        score[2]   = sc.nextInt();
        
        int sum = score[0] + score[1] + score[2];
        double avg = (double) sum / score.length;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f%n", avg);

        sc.close();


    }
}
