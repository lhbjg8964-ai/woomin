package a0824.casting2;

public class Truck extends Vehicle {
    private int workHours;
    private double hourlyRate;
    
    public Truck(String name, int id, double baseFee,int workHours, double hourlyRate) {
        super(name, id, baseFee);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
     
    @Override
    double calculateFee() {
        return baseFee +(workHours * hourlyRate);
    }
    void haulCargo(){
        System.out.println(name + "이(가) 화물차로 "+ workHours + " 시간 운행합니다.");
    }

}
