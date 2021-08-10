public class Baravelli extends CandyBox {
    private float radius, height;

    public Baravelli(){
    }

    public Baravelli(float radius, float height, String flavor, String origin){
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return 3.14f*(radius*radius)*height;
    }

    public String toString() {
        return "Baravelli{" + "The " + super.toString() + " has volume " + getVolume() + "}";
    }

    public void printBaravelliDim(){
        System.out.println(radius + " " + height);
    }

    public void printDim(){ // am facut printDim ul asta peste tot sa evit instanceof
        System.out.println(radius + " " + height );
    }
}
