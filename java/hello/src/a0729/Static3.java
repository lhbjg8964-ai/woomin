package a0729;

public class Static3 {
    public static void main(String[] args) {
        hello();
        //함수도 static을 붙이면 객체생성이 필요없다.
    }

    private static void hello() {
       System.out.println("안녕하세요");
    }
}
