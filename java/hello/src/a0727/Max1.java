package a0727;

public class Max1 {public static void main(String[] args) {
    
    int[] score = { 85, 90, 78, 92, 88 };
       int max = score[0];
       //최고점수를 찾아서 프린트해보세요

       for(int i = 1; i<score.length;i++){
        if(score[i]>max){
            max = score[i];
        }
       }
       System.out.println("최고점 : " + max);
    }
}