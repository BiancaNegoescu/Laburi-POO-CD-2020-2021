import java.util.TreeSet;

public class onlyEvenNr3 extends TreeSet<Integer> {
    public boolean add (Integer x) {
        if (x % 2 == 0){
            return super.add(x);
        }
        return false;
    }
}
