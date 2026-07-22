package a0721;

import a0720.string;

public class ScoreCalc { public static void main(String[] args) {
    int 국어 = 90;
    int 영어 = 85; 
    int 수학 = 78;
    int 합격 = (국어+영어+수학) *3 ;

    System.out.println("국어 : " + 국어);
    System.out.println("영어 : " + 영어);
    System.out.println("수학 : " + 수학);
    System.out.println("총점 : " + (국어+영어+수학));
    System.out.println("평균 : " + (국어+영어+수학) /(double)3 );

    if ((국어 + 영어 + 수학) /3 > 80) {
            System.out.println("합격.");
        }else{
            System.out.println("불합격.");
        }

        
}
    
}
