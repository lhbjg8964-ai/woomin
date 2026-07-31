package a0731.account1;

// 하나의 .java 파일에는 public 클래스를 하나만 만들 수 있다.
public class AccountTest {

    public static void main(String[] args) {

        // 계좌 생성
        Account a = new Account("철수", 10000);
        Account b = new Account("영희", 2000);

        System.out.println("===== 계좌 생성 =====");
        System.out.println("[철수, 잔액: " + a.balance + "원]");
        System.out.println("[영희, 잔액: " + b.balance + "원]");

        System.out.println();

        // 입금
        System.out.println("===== 입금 =====");
        a.deposit(5000);

        System.out.println();

        // 출금
        System.out.println("===== 출금 =====");
        a.withdraw(3000);

        // 잔액보다 많은 금액 출금
        a.withdraw(20000);

        System.out.println();

        // 송금
        System.out.println("===== 송금 =====");
        a.transfer(b, 3000);

        System.out.println();

        // 반복 송금
        System.out.println("===== 반복 송금 =====");

        while (a.transfer(b, 3000)) {
            ;
        }

        System.out.println();

        System.out.println("===== 최종 잔액 =====");
        System.out.println("[철수, 잔액: " + a.balance + "원]");
        System.out.println("[영희, 잔액: " + b.balance + "원]");
    }
}