package a0821.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {

    private ArrayList<Car> cars = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // 더미 데이터
    public CarManager() {
        cars.add(new Car("12가3456", "소나타", "흰색", 2022, 2500));
        cars.add(new Car("34나7890", "아반떼", "검정", 2021, 1800));
        cars.add(new Car("56다1234", "그랜저", "은색", 2023, 4200));
        cars.add(new Car("78라5678", "쏘렌토", "파랑", 2020, 3100));
        cars.add(new Car("90마9012", "소나타", "회색", 2024, 2800));
    }

    // 프로그램 실행
    public void run() {

        boolean run = true;

        while (run) {

            printMenu();

            System.out.print("선택> ");
            String choice = sc.nextLine();

            switch (choice) {

                case "1":
                    createCar();
                    break;

                case "2":
                    readCars();
                    break;

                case "3":
                    updateCar();
                    break;

                case "4":
                    deleteCar();
                    break;

                case "5":
                    searchByNumber();
                    break;

                case "6":
                    searchByModel();
                    break;

                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 메뉴
    private void printMenu() {

        System.out.println();
        System.out.println("========== 차량 관리 시스템 ==========");
        System.out.println("1. 차량 등록 (C)");
        System.out.println("2. 전체 조회 (R)");
        System.out.println("3. 차량 수정 (U)");
        System.out.println("4. 차량 삭제 (D)");
        System.out.println("5. 차량번호 검색");
        System.out.println("6. 차종으로 검색");
        System.out.println("0. 종료");
    }

    // 1. 차량 등록
    private void createCar() {

        System.out.print("차량번호: ");
        String carNumber = sc.nextLine();

        // 차량번호 중복 검사
        if (findByNumber(carNumber) != null) {
            System.out.println("이미 등록된 차량번호입니다.");
            return;
        }

        System.out.print("차종: ");
        String model = sc.nextLine();

        System.out.print("색상: ");
        String color = sc.nextLine();

        System.out.print("연식: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("가격(만원): ");
        int price = Integer.parseInt(sc.nextLine());

        Car car = new Car(carNumber, model, color, year, price);

        cars.add(car);

        System.out.println("차량이 등록되었습니다.");
    }

    // 2. 전체 조회
    private void readCars() {

        if (cars.isEmpty()) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        for (int i = 0; i < cars.size(); i++) {

            System.out.println(
                "[" + (i + 1) + "] " + cars.get(i)
            );
        }
    }

    // 3. 차량 수정
    private void updateCar() {

        System.out.print("수정할 차량번호: ");
        String carNumber = sc.nextLine();

        Car car = findByNumber(carNumber);

        if (car == null) {
            System.out.println("해당 차량이 없습니다.");
            return;
        }

        System.out.print("새 차종: ");
        String model = sc.nextLine();

        System.out.print("새 색상: ");
        String color = sc.nextLine();

        System.out.print("새 연식: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("새 가격(만원): ");
        int price = Integer.parseInt(sc.nextLine());

        car.setModel(model);
        car.setColor(color);
        car.setYear(year);
        car.setPrice(price);

        System.out.println("수정되었습니다.");
    }

    // 4. 차량 삭제
    private void deleteCar() {

        System.out.print("삭제할 차량번호: ");
        String carNumber = sc.nextLine();

        Car car = findByNumber(carNumber);

        if (car == null) {
            System.out.println("해당 차량이 없습니다.");
            return;
        }

        cars.remove(car);

        System.out.println("삭제되었습니다.");
    }

    // 5. 차량번호 검색
    private void searchByNumber() {

        System.out.print("검색할 차량번호: ");
        String carNumber = sc.nextLine();

        Car car = findByNumber(carNumber);

        if (car == null) {
            System.out.println("해당 차량이 없습니다.");
            return;
        }

        System.out.println(car);
    }

    // 6. 차종 검색
    private void searchByModel() {

        System.out.print("검색할 차종(일부 가능): ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (Car car : cars) {

            if (car.getModel().contains(keyword)) {
                System.out.println(car);
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    // 차량번호로 차량 찾기
    private Car findByNumber(String carNumber) {

        for (Car car : cars) {

            if (car.getCarNumber().equals(carNumber)) {
                return car;
            }
        }

        return null;
    }
}