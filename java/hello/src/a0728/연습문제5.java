package a0728;

public class 연습문제5 {

    public static void main(String[] args) {

        System.out.println(getGrade(95)); // A
        System.out.println(getGrade(85)); // B
        System.out.println(getGrade(75)); // C
        System.out.println(getGrade(60)); // F
    }

    // 점수를 받아 학점을 반환하는 메서드
    public static char getGrade(int score) {

        if (score >= 90) {
            return 'A';

        } else if (score >= 80) {
            return 'B';

        } else if (score >= 70) {
            return 'C';

        } else {
            return 'F';
        }
    }
}