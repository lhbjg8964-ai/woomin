package a0826.exception;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            System.out.println("=== 첫 번째 출금 시도 (5,000원) ===");
            account.withdraw(5000); // 성공
            
            System.out.println("=== 두 번째 출금 시도 (8,000원) ===");
            account.withdraw(8000); // 실패: 예외발생

            System.out.println("이 코드는 실행되지 않았습니다"); // 예외 발생 시 건너뜀

        } catch (InsufficientBalanceException e) {
            // 우리가 만든 사용자 정의 예외를 잡아서 처리
            System.out.println("[예외 처리 성공]" + e.getMessage());
        }

        System.out.println("=== 프로그램 정상 종료 ===");
    }
    
}
