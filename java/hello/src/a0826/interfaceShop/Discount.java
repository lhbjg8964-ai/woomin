package a0826.interfaceShop;

// 원가에 할인 적용
public interface Discount { 
    double apply(int price); // 상품가격을 받아서 할인되 가격을 반환
    String getName(); //어떤할인 (회원 쿠폰 할인없음)
    
}
