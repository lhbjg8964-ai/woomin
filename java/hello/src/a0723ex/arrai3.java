package a0723ex;

public class arrai3 {public static void main(String[] args) {
    //배열 사용하지 않는 경우
    int[] score = {90, 85, 78, 95, 88};
    
    // for(int i =0; i <5; i++){
    //     System.out.println(score[i]);
    for(int i =0; i < score.length; i++){
        System.out.println(i+ " 번째 인덱스" + score[i]);
    }
}
    
}
