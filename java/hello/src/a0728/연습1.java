package a0728;

 import java.util.Scanner;

public class 연습1 {
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //static -> 프로그램이 시작될 댸 한 번만 만들어지는 공용변소/메서드
        //일반 변수 -> 객체를 만들어야 사용할 수 있는 변수
        while (true) {
            menu();//메뉴 출력 함수

            //키보드로 번호선택
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    add();//더하기
                    break;
                case 2:
                    subtract();//빼기
                    break;
                case 3:
                    multiply();//곱하기
                    break;//다시 처음부터 돌아감
                case 4:
                    divide();//나누기
                    break;//다시 처음부터 돌아감
                case 5:
                    System.out.printf("프로그램을 종료합니다.");
                    return;//빠져나감
            
                default:
                    System.out.println("잘못입력했습니다");
            }
        }

    }
        //더하기
    private static void add() {
        System.out.print("첫 번째 숫자");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + num1 + num2);
    }

    //빼기
    private static void subtract() {
         System.out.print("첫 번째 숫자");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + (num1-num2));
    }

    //곱하기
    private static void multiply() {
         System.out.print("첫 번째 숫자");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자");
        int num2 = sc.nextInt();

        System.out.println("결과 : " + (num1*num2));
    }

    //곱하기
    private static void divide() {
         System.out.print("첫 번째 숫자");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("잘못된 계산입니다.");
        }else{System.out.println("결과 : " + (double) num1/num2);
    }
}
    //메뉴 출력
    private static void menu() {
        System.out.println("\n==================================");
        System.out.println("           계산기");
        System.out.println("\n==================================");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기 ");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("5. 종료");
        System.out.print("메뉴 선택");
    }
    
}
