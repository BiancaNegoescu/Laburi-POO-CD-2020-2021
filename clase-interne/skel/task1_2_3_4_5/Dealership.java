package task1_2_3_4_5;

import java.util.Random;

public class Dealership {
    public int discount;
    private class BrandOffer implements Offer{

       public int getDiscount(Car car){
          for(Car.CarType cartype : Car.CarType.values()){
              if (car.type.equals(cartype.toString())) {
                  discount = (int) (0.05 * car.price);
                  System.out.println("Brand discount: "+ discount);
              }
           }
           return discount;
       }
    }
    private class DealerOffer implements Offer{
        public int getDiscount(Car car){
            discount = 100*(2020-car.year);
            System.out.println("Dealer discount: "+ discount);
            return discount;
        }
    }

    private class SpecialOffer implements Offer{
        public int getDiscount(Car car){
            Random rand = new Random();
            discount = rand.nextInt(300);
            System.out.println("Special discount: "+ discount);
            return discount;
        }
    }

    public int getFinalPrice(Car car){
       BrandOffer offer = new BrandOffer();
       int discount1 = offer.getDiscount(car);
       DealerOffer offer1 = new DealerOffer();
       int discount2 = offer1.getDiscount(car);
       SpecialOffer offer2 = new SpecialOffer();
       int discount3 = offer2.getDiscount(car);

       int totalDiscount = discount1 + discount2 + discount3;
       car.price = car.price - totalDiscount;
       return car.price;
    }

    public void negotiate(Car car, Offer offer){
        Random rand = new Random();
        if (rand.nextInt(2)==1)
            car.price-= offer.getDiscount(car);
        System.out.println("client discount: "+ offer.getDiscount(car));
        System.out.println("Final Price after negotiation: "+ car.price);
    }



}
