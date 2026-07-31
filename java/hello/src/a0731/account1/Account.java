package a0731.account1;

public class Account {

    String owner;   // 예금주
    int balance;    // 잔액

    // 생성자
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // 입금 메서드
    public void deposit(int money) {
        balance += money;

        System.out.println(
            "[" + owner + "] " + money + "원 입금 -> 잔액: " + balance + "원"
        );
    }

    // 출금 메서드
    public boolean withdraw(int money) {

        // 잔액이 출금 금액보다 많거나 같으면 출금
        if (balance >= money) {
            balance -= money;

            System.out.println(
                "[" + owner + "] " + money + "원 출금 -> 잔액: " + balance + "원"
            );

            return true;
        }

        // 잔액이 부족한 경우
        System.out.println(
            "[" + owner + "] 출금 실패(잔액 부족)"
        );

        return false;
    }

    // 송금 메서드
    public boolean transfer(Account target, int money) {

        // 잔액이 송금 금액보다 많거나 같으면 송금
        if (balance >= money) {

            // 보내는 계좌의 잔액 차감
            balance -= money;

            // 받는 계좌의 잔액 증가
            target.balance += money;

            System.out.println(
                "(" + owner + " => " + target.owner + ") "
                + money + "원 송금 완료"
            );

            System.out.println(
                "[" + owner + ", 잔액: " + balance + "원]"
            );

            System.out.println(
                "[" + target.owner + ", 잔액: " + target.balance + "원]"
            );

            return true;
        }

        // 잔액 부족
        System.out.println(
            "(" + owner + " => " + target.owner + ") "
            + "송금 실패(잔액 부족)"
        );

        return false;
    }
}