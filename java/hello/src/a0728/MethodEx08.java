package a0728;
//함수를 이용해 배열의 평균 을 구하시오
public class MethodEx08 {
    public static void main(String[] args) {
           int[] score = {90,80,70,100};

        System.out.println(average(score));
    }

    private static double average(int[] score) {
        int sum = 0;

        for(int i=0;i<score.length;i++){

            sum += score[i];

        }

        return (double)sum / score.length;

    }



    
}
