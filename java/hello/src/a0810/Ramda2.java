package a0810;


interface Calculator{
    int sum(int a, int b);
    // 추상 메서드 하나만 가지고 있습니다.
    // 정수두개를 입력받아 정수하나만 반환
}

public class Ramda2 {
    public static void main(String[] args) {

        // public int sum(int a, int b) {
        // return a + b;}
        // Calculator mc = (a, b) -> a + b; 와 동일
        // 원래 int sum(int a, int b) 였지만 인터페이스에서 이미 int 자료형이 정의 됨 (a, b)로 축약(축약하는 것 = 람다)
        // -> (화살표)는 입력을 받아 실행해라
        //  a + b는 retun a + b 와 같다.

        // new가 없기에 객체 지정이 아니라 익명(이름이 없는)클래스이다.
        Calculator mc = (a, b) -> a + b;
        int result = mc.sum(3, 4); 
        System.out.println("result = " + result);
    }
    
}
