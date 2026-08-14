package a0812.file.Travel;

public class Travel {
    private String city;
    private int days;
    private int cost;

    public Travel(String city, int days, int cost) {
        this.city = city;
        this.days = days;
        this.cost = cost;
    }

    public String getCity() {
        return city;
    }

    public int getDays() {
        return days;
    }

    public int getCost() {
        return cost;
    }
}