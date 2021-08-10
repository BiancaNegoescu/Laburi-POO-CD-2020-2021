public class Lindt extends CandyBox {
    private float length, width, height;

    public Lindt(){
    }

    public Lindt(float length, float width, float height, String flavor, String origin){
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;

    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {

        return "Lindt{" + "The " + super.toString() + " has volume " + getVolume() + "}";

    }

    public void printLindtDim(){
        System.out.println(length + " " + width + " " + height);
    }

    public void printDim(){
        System.out.println(length +" " + width + " " + height );
    }
}
