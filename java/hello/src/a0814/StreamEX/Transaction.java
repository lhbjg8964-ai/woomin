package a0814.StreamEX;

public class Transaction {
    private Trader trader;
    private int year;
    private int value;
    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader() {
        return trader;
    }
    public void setTrader(Trader trader) {
        this.trader = trader;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "거래자: " + trader.getName()
                + ", 도시: " + trader.getCity()
                + ", 연도: " + year
                + ", 금액: " + value;
 
    }
}
