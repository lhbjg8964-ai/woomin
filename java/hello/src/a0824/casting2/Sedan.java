package  a0824.casting2;

 class Sedan extends Vehicle {
   private double insurance;
   
    public Sedan(String name, int id, double baseFee, double insurance) {
        super(name, id, baseFee);
        this.insurance = insurance;
    }
   
    @Override
    double calculateFee() {
        return  baseFee + insurance;
    }

    void driveSedan(){
        System.out.println(name + "이(가) 세단으로 운행합니다.");
    }
    

}
