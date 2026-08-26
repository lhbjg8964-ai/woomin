package a0824.casting2;

public class ElectricCar extends Vehicle {
    private double batteryCare;
    private int seats;
   

    public ElectricCar(String name, int id, double baseFee, double batteryCare, int seats) {
        super(name, id, baseFee);
        this.batteryCare = batteryCare;
        this.seats = seats;
    }



    @Override
    double calculateFee() {
        return baseFee + batteryCare + seats;
    }

      void chargeBattery() {
        System.out.println(name + "이(가) " + seats + "인승 전기차를 충전합니다.");
    }

}
