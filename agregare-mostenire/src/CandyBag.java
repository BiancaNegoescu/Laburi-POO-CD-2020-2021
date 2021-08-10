import java.util.ArrayList;

public class CandyBag {
    ArrayList<CandyBox> candybox= new ArrayList<>();

    public CandyBag(CandyBox candybox){
        this.candybox.add(candybox);
        this.candybox.add(new Baravelli(5,10,"ciocolata", "Belgia"));
        this.candybox.add(new ChocAmor(10, "trufe","Italia"));
        this.candybox.add(new Lindt(4,4,4,"vanilie","Franta"));

    }

}
