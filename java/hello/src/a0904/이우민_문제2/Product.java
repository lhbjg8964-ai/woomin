package a0904.이우민_문제2;

public class Product {
    private String name; //상품 이름
    private int price; // 상품 가격
    private int quantity; // 상품수량

    public Product() { // 매개변수가 없는 기본 생성자
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
    
    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price + "원" + ", 수량: " + quantity + "개";
    }
}
