package a0728;

import java.util.Scanner;

public class 연습 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("=====================");
            System.out.println("계산기");
            System.out.println("=====================");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 종료");
            System.out.println("=====================");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    add();
                    break;

                case 2:
                    subtract();
                    break;

                case 3:
                    multiply();
                    break;

                case 4:
                    divide();
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 번호입니다.");
            }

            System.out.println();
        }
    }

    // 더하기
    private static void add() {

        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + (num1 + num2));
    }

    // 빼기
    private static void subtract() {

        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + (num1 - num2));
    }

    // 곱하기
    private static void multiply() {

        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + (num1 * num2));
    }

    // 나누기
    private static void divide() {

        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            System.out.println("결과 : " + (double) num1 / num2);
        }
    }
}