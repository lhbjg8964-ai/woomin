package a0728;

public class 연습문제4 {

    public static void main(String[] args) {

        // "안녕하세요"를 3번 출력
        printMessage("자바", 3);
    }

    // 문자열과 반복 횟수를 전달받는 메서드
    private static void printMessage(String message, int count) {

        // count만큼 반복
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}