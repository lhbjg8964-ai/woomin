package a0824.casting2;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== 차량 대여 시스템 ===");
        //다양한 타입의 차량들을 부모타입 배열에 저장(업캐스팅)
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Sedan("아반떼", 1, 50000, 20000);
        vehicles[1] = new Truck("포터", 2, 0, 8, 15000);
        vehicles[2] = new ElectricCar("아이오닉", 3, 80000, 10000, 5);
        vehicles[3] = new Sedan("소나타", 4, 60000, 25000);
        vehicles[4] = new Truck("마이티", 5, 0, 6, 18000);

        System.out.println("==== 모든 차량 정보 출력 ====");
        for(Vehicle v : vehicles){
            v.printInfo(); //다형성
        }

        
        System.out.println("==== 전체 요금 합계 ====");
        double totalFee = 0;
        for(Vehicle v : vehicles){
           totalFee += v.calculateFee();
        }
        System.out.println("전체 요금 합계: " + String.format("%,.0f", totalFee));

        System.out.println("\n=== 차량 타입별 처리 ===");
          for(Vehicle v : vehicles){
           if(v instanceof Sedan){
                Sedan sd = (Sedan) v;
                sd.driveSedan();
           }else if(v instanceof Truck){
                Truck tr = (Truck) v;
                tr.haulCargo();
           }else if (v instanceof ElectricCar) {
                ElectricCar ev = (ElectricCar) v;
                ev.chargeBattery();
           }

        }

        System.out.println("\n===  특정 차량 검색  === ");
        String searchName = "아반떼";
        Vehicle found = findVehicle(vehicles, searchName);
        if(found != null){
            System.out.println("검색결과 :");
            found.printInfo();
        }else{
            System.out.println(searchName + "을(를) 찾을 수 없습니다.");
        }
    }

    private static Vehicle findVehicle(Vehicle[] vehicles, String searchName) {
         for(Vehicle v : vehicles){
           if(v.getName().equals(searchName)){
             return v;
           }
        }
        return null;
    }
}
