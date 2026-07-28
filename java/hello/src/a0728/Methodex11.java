package a0728;

//문자열 길이
public class Methodex11 {

    public static void main(String[] args) {
        int sum = total(90,80,70);//인수

        System.out.printf("총점 :" + sum);
    
    }

    private static int total(int i, int j, int k) {//매개변수
        return  i + j + k;
    }
}