package a0730.product1;

public class Product {
    private String name;
    private int price; //가격
    private int quantity; //수량
    private double discountRate; //할인율
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountRate = 0.0; //기본할인율 0%
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    //할인율 설정 ( 유효성 검사)
    public void setDiscountRate(double discountRate) {
        if(discountRate < 0 || discountRate >1){
            System.out.println("할인율은 0.0 ~ 1.0 사이 여야합니다.");
            return;//
        }

        this.discountRate = discountRate;
    }
    public void printProductInfo() {
        System.out.println("====상품정보===");
        System.out.println("상품명: " + name);
        System.out.println("단가: " + String.format("%,d", price)+"원");
        System.out.println("수량: " + quantity + "개");
        System.out.println("총금액: " + String.format("%,d", calcTotalPrice())+"원");
        if(discountRate > 0){
            System.out.println("할인율: " + (discountRate * 100) + "%");
             System.out.println("할인 금액: " + String.format("%,d", calcDiscoutAmount())+"원");
            System.out.println("할인후 금액: " + String.format("%,d", calcFinalPrice())+"원"); 
        }else{ //할인율이 0 인것
            System.out.println("할인후 금액: " + String.format("%,d", calcFinalPrice())+"원"); 
        }


    }

    //최종금액
    private int  calcFinalPrice() {
       return calcTotalPrice()  - calcDiscoutAmount();
       //총금액 - 할인금액 = 최종금액
    }
    //할인금액
    private int  calcDiscoutAmount() {
        return (int)(calcTotalPrice() * discountRate);
    }
    //기본금액(총금액)
    private int calcTotalPrice() {
        return price * quantity;  //수량 * 단가 
    }
    public void printReceipt() {
         System.out.println("===영수증===");
         printProductInfo();
         System.out.println("부가세" + String.format("%,d",calcVAT())+"원");
         System.out.println("최종 결제 금액" + String.format("%,d",calcPriceVAT())+ "원");
    }

    //부가세
    private int calcVAT() {
        return (int)(calcFinalPrice()*0.1);
    }

    //최종금액 (부가새 포함글맥 )
     private int calcPriceVAT() {
      return calcFinalPrice()+calcVAT();
    }
    

}
