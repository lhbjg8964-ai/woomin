package a0722;

public class Assignment {
    public static void main(String[] args) {
        int value = 10;
        System.out.printf("초기값 : " + value); // 10

        value += 5;
        System.out.printf("value + 5 : " + value); // 15

        value -= 3;
        System.out.printf("value -= 3 :" + value); // 12

        value *= 2;
        System.out.printf("value *= 2 :" + value); // 24

        value /= 4; 
        System.out.printf("value /= 4 : " + value); // 6

        value %= 4;
        System.out.printf("value %= 4 :" + value); // 2

        System.out.printf("\n 최종값 : " + value); // 2

        int sum = 10;
        sum += 10;
        sum += 25;
        sum += 30;
        double avg = (double) sum / 3; // 소수점까지 나누려면 double로 정수에서 변환하기
        double avg1 = sum / 3.0;
        System.out.printf("합계 :" + sum);
        System.out.printf("평균 :" + ( (double) sum / 3));
        System.out.printf("평균1 :" + avg);
        System.out.printf("평균2 :" + avg1);
    }
    
}
