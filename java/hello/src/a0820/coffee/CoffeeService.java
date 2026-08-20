package a0820.coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 커피 주문과 결제를 처리하는 서비스 클래스
 */
public class CoffeeService {

    private boolean reOrder = false; // 추가 주문 여부
    private int orderNum = 1;        // 주문 번호

    private final Map<String, Integer> orderList;
    private final Coffee coffee;
    private final Scanner sc;

    private Customer customer;

    public CoffeeService() {
        // 입력한 순서대로 주문 내역을 출력하기 위해 LinkedHashMap 사용
        orderList = new LinkedHashMap<>();

        // 싱글톤 Coffee 객체 가져오기
        coffee = Coffee.getInstance();

        sc = new Scanner(System.in);
    }

    /**
     * 커피 주문 프로그램 시작
     */
    public void start() {

        // start()가 다시 실행될 경우 이전 주문 초기화
        orderList.clear();
        reOrder = false;

        System.out.println("\n어서 오세요. 더조은 커피숍입니다.");

        // 현재 주문 번호를 이용하여 고객 생성
        customer = new Customer(orderNum);

        // 메뉴 출력
        coffee.getMenu();

        // 주문이 취소된 경우 프로그램 종료
        if (!order()) {
            return;
        }

        // 주문 내역 출력 후 결제
        boolean paymentResult = totalOrder(customer);

        // 결제 실패 시 음료를 제공하지 않음
        if (!paymentResult) {
            return;
        }

        try {
            System.out.println("\n기다려 주시면 주문하신 음료가 나옵니다.");

            // 음료가 만들어지는 시간 표현
            Thread.sleep(2000);

            end();

        } catch (InterruptedException e) {
            // 인터럽트 상태 복원
            Thread.currentThread().interrupt();

            System.out.println("음료 준비 중 오류가 발생했습니다.");
        }
    }

    /**
     * 주문받기
     *
     * @return 주문 완료 true, 주문 취소 false
     */
    private boolean order() {

        System.out.println("\n취소를 원하시면 0번을 눌러주세요.");

        while (true) {
            try {
                System.out.print("\n원하는 음료의 번호를 선택하세요: ");
                String choice = sc.nextLine().trim();

                // 입력한 문자열 전체를 숫자로 변환
                int choiceNum = Integer.parseInt(choice);

                // 0번은 주문 취소
                if (choiceNum == 0) {
                    System.out.println("주문이 취소되었습니다.");
                    return false;
                }

                // 메뉴 번호 범위 확인
                if (choiceNum < 1 || choiceNum > coffee.coffeeList.size()) {
                    System.out.println("메뉴에 있는 번호를 입력해주세요.");
                    continue;
                }

                // 사용자 입력은 1번부터, List index는 0번부터 시작
                String coffeeName = coffee.coffeeList.get(choiceNum - 1);

                System.out.println("선택하신 음료는 " + coffeeName + "입니다.");
                System.out.print("몇 잔 주문하시겠습니까? ");

                int orderCount =
                        Integer.parseInt(sc.nextLine().trim());

                // 1잔 이상만 주문 가능
                if (orderCount <= 0) {
                    System.out.println("주문 수량은 1잔 이상이어야 합니다.");
                    continue;
                }

                if (reOrder) {
                    /*
                     * 기존 커피가 있으면 기존 수량에 추가하고,
                     * 없으면 기본값 0에 주문 수량을 더함
                     */
                    orderList.put(
                        coffeeName,
                        orderList.getOrDefault(coffeeName, 0)
                            + orderCount
                    );
                } else {
                    // 첫 주문
                    orderList.put(coffeeName, orderCount);
                }

                // Customer 객체에 주문 목록 저장
                customer.setCoffeeOrder(orderList);

                // 추가 주문 여부 확인
                if (addOrder()) {
                    reOrder = true;
                    coffee.getMenu();
                } else {
                    return true;
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
            } catch (Exception e) {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    /**
     * 추가 주문 여부 확인
     *
     * @return 추가 주문 true, 주문 종료 false
     */
    private boolean addOrder() {

        while (true) {
            System.out.println("\n주문을 계속하시겠습니까?");
            System.out.print("예(Y) / 아니오(N): ");

            String yesOrNo = sc.nextLine().trim();

            if (yesOrNo.equals("예")
                    || yesOrNo.equalsIgnoreCase("y")) {

                return true;

            } else if (yesOrNo.equals("아니오")
                    || yesOrNo.equalsIgnoreCase("n")) {

                return false;

            } else {
                System.out.println("Y 또는 N을 입력해주세요.");
            }
        }
    }

    /**
     * 주문 내역과 총금액 출력
     *
     * @return 결제 성공 true, 결제 실패 false
     */
    private boolean totalOrder(Customer customer) {

        int number = 1;
        int totalMoney = 0;

        DecimalFormat format = new DecimalFormat("#,##0원");
        StringBuilder message = new StringBuilder();

        message.append("\n\n")
               .append("+----------------------------------------------------+\n")
               .append("|                                                    |\n")
               .append("|          ")
               .append(customer.getOrderName())
               .append("번 고객님의 주문 내역입니다.          |\n")
               .append("|                                                    |\n");

        for (Map.Entry<String, Integer> order
                : customer.getCoffeeOrder().entrySet()) {

            String coffeeName = order.getKey();
            int orderCount = order.getValue();

            // 커피 한 잔의 가격
            int coffeeUnitPrice = coffee.menu.get(coffeeName);

            // 해당 커피의 총금액
            int coffeePrice = coffeeUnitPrice * orderCount;

            // 전체 주문 금액에 추가
            totalMoney += coffeePrice;

            message.append(
                String.format(
                    "| [%d] %-20s : %2d잔  %8s |\n",
                    number,
                    coffeeName,
                    orderCount,
                    format.format(coffeePrice)
                )
            );

            number++;
        }

        // 반복문이 끝난 후 한 번만 출력
        message.append("|                                                    |\n")
               .append("+----------------------------------------------------+\n")
               .append("총 결제 금액은 ")
               .append(format.format(totalMoney))
               .append("입니다.\n");

        System.out.println(message);

        // 전체 금액으로 한 번만 결제
        return payment(totalMoney);
    }

    /**
     * 결제 처리
     *
     * @return 결제 성공 true, 결제 실패 false
     */
    private boolean payment(int totalMoney) {

        DecimalFormat format = new DecimalFormat("#,##0원");

        System.out.println("결제를 도와드리겠습니다. 카드를 넣어주세요.");
        System.out.println("결제 중입니다...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

            System.out.println("결제가 중단되었습니다.");
            return false;
        }

        // 고객의 현재 잔액에서 주문 금액 차감
        int payResult = customer.getMoney() - totalMoney;

        if (payResult < 0) {
            int shortage = Math.abs(payResult);

            System.out.println("잔액이 부족합니다.");
            System.out.println(
                "부족한 금액: " + format.format(shortage)
            );
            System.out.println("주문을 다시 진행해주세요.");

            return false;
        }

        // 결제 후 잔액 저장
        customer.setMoney(payResult);

        System.out.println("결제가 완료되었습니다.");
        System.out.println(
            "결제 후 잔액: " + format.format(payResult)
        );
        System.out.println("이용해주셔서 감사합니다.");

        // 다음 고객을 위해 주문 번호 증가
        orderNum++;

        return true;
    }

    /**
     * 음료 준비 완료 메시지
     */
    private void end() {

        int number = 1;
        StringBuilder message = new StringBuilder();

        message.append("\n\n")
               .append("+----------------------------------------------------+\n")
               .append("|                                                    |\n")
               .append("|          ")
               .append(customer.getOrderName())
               .append("번 고객님, 주문하신 음료가 나왔습니다.       |\n")
               .append("|                                                    |\n");

        System.out.print(message);

        for (Map.Entry<String, Integer> order
                : customer.getCoffeeOrder().entrySet()) {

            System.out.printf(
                "| [%d] %-20s : %2d잔 %9s|\n",
                number,
                order.getKey(),
                order.getValue(),
                ""
            );

            number++;
        }

        System.out.println("|                                                    |");
        System.out.println("+----------------------------------------------------+");
    }
}