package a0723;

import java.util.Scanner;

public class IfScanner2Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[3];
        int sum = 0;
        // System.out.print("국어점수 : ");
        // score[0] = sc.nextInt();

        // System.out.print("영어점수 : ");
        // score[1]= sc.nextInt();
        
        // System.out.print("수학점수 : ");
        // score[2]   = sc.nextInt();
        
        // int sum = score[0] + score[1] + score[2];

        //입력 + 합계 계산
        for(int i = 0; i < score.length; i++){
            System.out.print((i+1) + "번째 점수 : ");
            score[i] = sc.nextInt();
            sum +=score[i];
        }


        double avg = (double) sum / score.length;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f%n", avg);

        sc.close();


    }
}
