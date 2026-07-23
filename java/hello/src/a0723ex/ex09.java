package a0723ex;

public class ex09 {public static void main(String[] args) {
    int kor = 80;
    int eng = 95;
    int math = 100;

    // int avg = (kor + eng + math) / 3;
    double avg = (kor + eng + math) / 3.0;
    System.out.println("평균 :" + avg);
    System.out.printf("평균 : %.1f%n" , avg);
}   // %f - 실수 출력
    // %.1f = 소수점 1자리까지 츨력
    // %n : 줄바꿈
    
}
