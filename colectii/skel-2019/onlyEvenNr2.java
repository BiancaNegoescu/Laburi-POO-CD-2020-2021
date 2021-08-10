import java.util.HashSet;

public class onlyEvenNr2 extends HashSet<Integer>{
        public boolean add(Integer x) {
            if (x % 2 == 0) {
                return super.add(x);
            }
            return false;
        }
}

