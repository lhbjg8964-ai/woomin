package a0721;

public class Pl { public static void main(String[] args) {
    // 1-2번 문제
    int score = 80;
    score = 100;
    System.out.println("점수 : " + score);
    // 2-4번 문제
    String name1 = "홍길동";
    int age1 = 25;
    double height1 = 175.5;
    boolean isStudent = true;
    String R = "A";
    final int MAX_SCORE = 100;

    System.out.println("이름 : " + name1);
    System.out.println("나이 : " + age1);
    System.out.println("키 : " + height1);
    System.out.println("학생 여부 : " + isStudent);
    System.out.println("등급 : " + R);
    System.out.println("최고 점수 : " + MAX_SCORE);

    //3-3번 문제
    int num = 17;
    System.out.println("num % 2 (나머지 출력) = " + ( num % 2 ) ); // 1(나머지)
    System.out.println("num % 3 (나머지 출력) = " + ( num % 3 ) ); // 1(나머지)
    if (num % 2 == 0) {
            System.out.println(num + "짝수 입니다.");
        }else{
            System.out.println(num + "홀수 입니다.");
        }
    


}
    
}
