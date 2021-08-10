public class Area {
    CandyBag candybag;
    int number;
    String street;

    public Area() {
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candybag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Address: " + number + " " + street + '\n' + "la multi ani!");

        //am parcurs evitand instanceof -> am scris metoda printDim in Lindt, Baravelli, ChocAmor
        for (int i = 0; i < candybag.candybox.size(); i++) {
            System.out.println("Volume " + candybag.candybox.get(i).getVolume());
            System.out.println(candybag.candybox.get(i).toString());
            candybag.candybox.get(i).printDim();
        }
    }
}
            // am parcurs cu toString
           // System.out.println(candybag.candybox.get(i).toString());

            // am parcurs cu instanceof
//            if (candybag.candybox.get(i) instanceof Lindt){
//                System.out.println(((Lindt)candybag.candybox.get(i)).getVolume());
//                ((Lindt) candybag.candybox.get(i)).printLindtDim();
//                System.out.println(((Lindt)candybag.candybox.get(i)).toString()+'\n');
//            }
//            if (candybag.candybox.get(i) instanceof Baravelli){
//                System.out.println(((Baravelli)candybag.candybox.get(i)).getVolume());
//                ((Baravelli)candybag.candybox.get(i)).printBaravelliDim();
//                System.out.println(((Baravelli)candybag.candybox.get(i)).toString()+'\n');
//            }
//            if (candybag.candybox.get(i) instanceof ChocAmor){
//                System.out.println(((ChocAmor)candybag.candybox.get(i)).getVolume());
//                ((ChocAmor) candybag.candybox.get(i)).printChocAmorDim();
//                System.out.println(((ChocAmor)candybag.candybox.get(i)).toString()+'\n');
//            }
//        }
//    }
//
//}
