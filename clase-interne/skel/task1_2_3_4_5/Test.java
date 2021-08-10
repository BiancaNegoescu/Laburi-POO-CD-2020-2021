package task1_2_3_4_5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(2010, 7000, "VW");
        Car car2 = new Car(2014, 15000, "BMW");
        Car car3 = new Car(2018, 30000, "AUDI");

        Dealership deal = new Dealership();
        System.out.println("The final price: " + deal.getFinalPrice(car1));
        System.out.println("The final price: " + deal.getFinalPrice(car2));
        System.out.println("The final price: " + deal.getFinalPrice(car3));


        //task4
       Offer offer = new Offer(){
           public int getDiscount(Car car){
               return 500;
           }

       };
       Dealership d = new Dealership();
       d.negotiate(car3, offer);

        //task5
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.removeIf((v) -> v.price > 14000 );
        System.out.println(cars.toString());

    }
}
