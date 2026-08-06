package a0731.account1;

import a0731.account2.Account;

// 하나의 .java 파일에는 public 클래스를 하나만 만들 수 있다.
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while(a.transfer(b,3000)){
            ; //아무것도 안한다.
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());

    }
}
class Account{
    String num; //계좌번호
    int balance; // 잔액
   
    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String toStr() {
       return String.format("num : %s, balance: %d",num, balance);
    }

    public boolean transfer(Account b, int i) {
        if(balance < i){ //잔액이 송금액보다 작으면 거짓을 리턴
            return false;
        }
        balance = balance - i; // a의 잔액이 3000감소
        b.balance = b.balance + i; // b의 잔액이 3000씩 증가  
        return true;
    }



}
// 처음 a = 10,000 b=10,000
//첫번째 송금  a ->3,000 a=7000 b= 13000
 //두번째 송금  a ->3,000 a=4000 b= 16000
 //세두번째 송금  a ->3,000 a=1000 b= 19000
 //네번재 if (balance < i) - 잔액부족  return false;