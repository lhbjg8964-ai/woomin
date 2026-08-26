package a0824.casting2;

//차량 대여 시스템(부모, 추상클래스)
abstract class Vehicle {
    protected String name;
    protected int id;
    protected double baseFee;

    public Vehicle(String name, int id, double baseFee) {
        this.name = name;
        this.id = id;
        this.baseFee = baseFee;
    }

    //추상메서드 각 차종마다 다른 계산 방식
    abstract double calculateFee();

    public String getName() {
        return name;
    }

        
    // 공통 메서드
    void printInfo() {
        System.out.println("ID: " + id + ", 이름: " + name + 
                          ", 기본요금: " + baseFee + 
                          ", 실요금: " + calculateFee());
    }
     
   

}



//abstract ?
//차종마다 요금 계산방식이 다르기때문
//부모는 '규칙'만 정함
// 추상메서드는 자식에서 반드시 구현
