public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){
    }

    public ChocAmor(float length, String flavor, String origin){
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    public String toString() {
        return "Lindt{" + "The " + super.toString() + " has volume " + getVolume() + "}";
    }

    public void printChocAmorDim(){
        System.out.println(length);
    }

    public void printDim(){
        System.out.println(length);
    }
}
