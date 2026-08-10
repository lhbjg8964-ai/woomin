package a0810;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieTicket {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        //영화 메뉴
         HashMap<String,Integer> menu= new HashMap<>();
        menu.put("어벤져스", 15000);
        menu.put("기생충", 12000);
        menu.put("범죄도시", 13000);
        menu.put("인터스텔라", 14000);
        menu.put("타이타닉", 12000);
        menu.put("겨울왕국", 11000);
        menu.put("오펜하이머", 15000);

       //예매 내역 저장
         HashMap<String, Integer> order = new HashMap<>();

       while(true){
           // 메뉴 출력
            System.out.println("\n=== 영화 메뉴 ===");
            for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
            }
            System.out.print("\n주문할 메뉴를 입력하세요 (종료: '종료'): ");
            String movieName = scanner.nextLine();
            if(movieName.equals("종료") ){
                break;
            }
             if(!menu.containsKey(movieName)){
                System.out.println("해당 영화가 없습니다. 다시입력해 주세요");
                continue;
            }
            //수량 입력
              System.out.print("매수을 입력하세요 : ");
               int quantity = scanner.nextInt();
               scanner.nextLine(); //버퍼지우기

            if(quantity <= 0){
               System.out.println("수량은 1개이상이어야 합니다.");
               continue;
            }

            if (order.containsKey(movieName)) {
               order.put(movieName, order.get(movieName) + quantity );
               //order.get(movieName) - 수량(기존값) + quantity(새로입력한 수량)
            } else {
               order.put(movieName, quantity); 
            }
            int price = menu.get(movieName); // 가격
            System.out.println(movieName + " " + quantity + "매가 에매 되었습니다. (금액: " + (price*quantity) + "원)" );

       }

       //주문 내역 및 총 금액계산 
            int totalAmount = 0;
            int totalQuantity = 0;
            System.out.println(" === 예매 내역 ===");
            for (Map.Entry<String, Integer> entry :order.entrySet()) {
                String movieName = entry.getKey();
                int quantity= entry.getValue(); //수량
                int price = menu.get(movieName);  //메뉴가격
                int subtotal = price * quantity;
                System.out.println(movieName + " X " + quantity + " = " + subtotal);
                totalAmount += subtotal; //개개별 상품 총액을 전체금액에 누적
                totalQuantity += quantity;
            }
            System.out.println("\n총 금액 : " + totalAmount + "원");
            scanner.close();
   }     
}
