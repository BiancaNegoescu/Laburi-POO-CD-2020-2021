import java.util.*;

public class MyImmutableArray {
    private ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> array){
        immutableArray = new ArrayList<Integer>(array);
    }

    public List<Integer> getArray(){
        return Collections.unmodifiableList(immutableArray);
    }

    public static void main(String[] args) {
        MyImmutableArray immutableArray = new MyImmutableArray(new ArrayList<>(Arrays.asList(1,3,5,7)));
        immutableArray.getArray();
        System.out.println(immutableArray.getArray());
        immutableArray.getArray().add(90);
        System.out.println(immutableArray.getArray());
    }
}
