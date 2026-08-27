package a0827.product;

public class Product {
    String name; // 상품명
    int price; // 상품 가격
    int stock; // 재고 수량

    // 기본 생성자
    public Product() {
    }
    // 매개 변수 생성자
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
     // toString() 메서드
    @Override
    public String toString() {
        return "상품명 : [" + name + "], 가격 : [" + price + "원], 재고 수량 : [" + stock + "개]";
    }

    // getTotalValue(): 상품의 총 가치를 계산하는 메서드
    public int getTotalValue(){ // 반환값: int
    // 총 가치 = 가격 × 재고 수량
        return price * stock;
    }

    // isAvailable() : 재고가 있는지 확인하는 메서드
    public boolean isAvailable(){ // 반환값: boolean
    // 재고가 0보다 크면 true, 0이면 false 반환
        return stock > 0;
    }
    
}




