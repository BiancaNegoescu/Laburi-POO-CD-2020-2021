import java.util.LinkedHashSet;

public class onlyEvenNr extends LinkedHashSet<Integer> {
    public boolean add (Integer x){
        if (x % 2 == 0){
            return super.add(x);
        }
        return false;
    }


}
