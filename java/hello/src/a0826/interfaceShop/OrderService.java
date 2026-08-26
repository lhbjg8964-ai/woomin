package a0826.interfaceShop;

public class OrderService {
    private Discount discount;  // 할인
    private Payable payable; // 결제
    private Notifier notifier; //알림
    public OrderService(Discount discount, Payable payable, Notifier notifier) {
        this.discount = discount;
        this.payable = payable;
        this.notifier = notifier;
    }
    public boolean checkout(String prodoctName, int price) {
        System.out.println("상품 : " + prodoctName + "| 원가: " + price + "원" );
        System.out.println("적용 할인 : " + discount.getName());

        int payAmount = (int) discount.apply(price);
        boolean ok = payable.pay(payAmount);
        if(ok){
            notifier.send(prodoctName + "결제 완료 (" + payAmount + ")원");
            System.out.println("주문 성공");
        }else{
            System.out.println("주문 실패");
        }
        return ok;
        
    }
    
    
}
