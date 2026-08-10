package a0729;

public class Static2 {
   int num = 100;
    public static void main(String[] args) {
        // main static -  num은 일반 변수 - 객체생성없이 num 사용못함
        Static2 st = new Static2(); //객체생성
        System.out.println(st.num);
    }
}
