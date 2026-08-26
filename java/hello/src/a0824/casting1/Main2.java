package a0824.casting1;

public class Main2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        //업캐스팅 (자식의 객체를 부모 타입 변수에 담음)
        //겉모습은 Vechicle 실제로는 안에 Car 객체 들어있음

        v.start();
        //다형성 적용
        // Vehicle에 있는 Start를 호출하는 것 같지만 실제 객체는 Car이므로 오버라이딩 된 Car의 "자동차 시동"이 출력

        v.stop();
        //부모에만 있는 메서드 호출가능
        //실제 객체 Car에는 stop 없으므로 부모의 "차량 정지"가 출력됨

        // v.drive(); 부모타입의 눈에는 Car 전용 메서드인 drive() 보이지 않음

        Car c = (Car) v;
        // 다운캐스팅 (부모 타입을 다시 원래의 자식타입으로 강제 형변환)
        // v 안에 들어있던 진짜객체가 Car 였기 떄문에 안전하게 변환가능

        c.drive();

        if(v instanceof Car){ //정말 Car 인지 확인하고 맞으면
            ((Car) v).drive(); //다운 캐스팅
        }

        if (v instanceof Car) { // Car인가?
        Car c1 = (Car) v;
        c1.drive();
}


    }
}

class Vehicle{
    void start(){
        System.out.println("차량 시작");
    }

    void stop(){
        System.out.println("차량 정지");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("자동차 시동");
    }

    void drive(){
        System.out.println("자동차 주행");
    }

}