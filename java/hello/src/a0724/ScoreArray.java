package a0724;

public class ScoreArray {
    public static void main(String[] args) {
            // 학생 5명의 국어, 영어, 수학 점수
        int[] kor = {90, 85, 70, 100, 95};
        int[] eng = {80, 90, 75, 95, 88};
        int[] math = {85, 95, 80, 90, 92};
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("------------------------------------------------");
        for(int i = 0; i < kor.length; i++){
            int sum = kor[i] + eng [i] + math[i];
            double avg = (double) sum / 3;
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f%n",i+1,kor[i],eng[i],math[i],sum,avg);

        }


    }
}
