package task2;

public class MyVector3 implements Sumabil {

    private int x;
    private int y;
    private int z;

    public MyVector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void addValue(Sumabil value) {
        this.x += ((MyVector3)value).getX();
        this.y += ((MyVector3)value).getY();
        this.z += ((MyVector3)value).getZ();

    }

    public void printVector() {
        System.out.println(x + " " + y + " " + z);
        System.out.println();
    }
}