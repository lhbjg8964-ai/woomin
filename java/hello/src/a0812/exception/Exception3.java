package a0812.exception;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        try { // 예외가 발생할 가능성이 있는 코드
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) { // 어떻게 처리할 것인지 작성 
            System.out.println("배열 범위를 벗어났습니다." + e.getMessage());
            e.printStackTrace();

            // e.getMessage() 예외 메세지
    }
}
}