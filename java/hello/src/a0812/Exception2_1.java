package a0812;

// 자바 예외
// 프로그램 실행 중 발생하는 오류
// 예시 : 0으로 나누기 없는 배율에 인덱스 접근


public class Exception2_1 {
    public static void main(String[] args) {
        try{
            int num =10 / 0;
        }catch(Exception e){ //e 에는 오류정보가 있습니다
            System.out.println(e); // java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage()); // by zero
             e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                 //at a0812.Exception2_1.main(Exception2_1.java:11)


        }
        System.out.println("프로그램 계속 실행");        
    }
    
}
