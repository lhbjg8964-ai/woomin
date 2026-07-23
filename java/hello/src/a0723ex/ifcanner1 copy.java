package a0723ex;

import java.util.Scanner;

public class ifcanner1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("숫자 입력 :");
        int num =sc.nextInt();

        if (num >0) {
            System.out.println(num + "양수입니다.");
        }else{System.out.println(num + "양수아닙니다.");
        }
    }
    
}
