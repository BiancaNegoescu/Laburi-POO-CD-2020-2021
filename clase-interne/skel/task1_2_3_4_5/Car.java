package task1_2_3_4_5;


public class Car {
    public int year;
    public int price;
    public String type;

    public enum CarType{
        AUDI,
        VW,
        BMW;
    }

    public Car( int year, int price, String type){
        this.type = type;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
