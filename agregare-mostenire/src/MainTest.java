import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args){

        CandyBox candybox = new CandyBox("capsuni", "china");
        CandyBox lindt = new Lindt(5,6,7,"vanilie","Franta");
        CandyBox baravelli = new Baravelli(6,7,"ciocolata", "Belgia");
        CandyBox chocAmor = new ChocAmor(9, "ciocolata", "Italia");


        CandyBag candyBag = new CandyBag(lindt);
        candyBag.candybox.add(baravelli);
        candyBag.candybox.add(chocAmor);
        Area area = new Area(candyBag,7,"Mihai Eminescu");
        area.getBirthdayCard();

    }
}
