package a0812;

// 자바 예외
// 프로그램 실행 중 발생하는 오류
// 예시 : 0으로 나누기 없는 배율에 인덱스 접근


public class Exception2 {
    public static void main(String[] args) {
        try{
            int num =10 / 0;
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 계속 실행");        
    }
    
}
