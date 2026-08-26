package a0826.exception;

public class BankAccount {
    private int balance = 10000; // 초기 잔고 1,000원

    public int getBalance() {
        return balance;
    }

    // 출금 메서드
    public void withdraw(int amount){ // 예외발생 할 수 있으니 호출하는 쪽에서 처리
        if(balance < amount){ // 잔고가 부족하면 사용자 정의 예외를 강제로 발생시킴 (throw)
            throw new InsufficientBalanceException("잔고부족 : 현재잔고는 " + balance + "원인데" + amount + "원을 출금하려함");
            // throw - 실제 예외가 발생한곳에
        }
        balance-=amount;
        System.out.println(amount+ "원이 정상 출금 : 남은잔고 : " + balance + "원 입니다.");
    }
    
}
