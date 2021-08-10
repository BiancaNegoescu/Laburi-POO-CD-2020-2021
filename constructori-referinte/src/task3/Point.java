package task3;

public class Point {
    float x;
    float y;

    public Point(float x, float y){
        this.y = y;
        this.x = x;
    }

    public void changeCoords(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: (" +
                  x +
                "," + y +
                ')';
    }

    public static void main(String[] args){
        Point point = new Point(1.7f, 2.6f);
        System.out.println(point.toString());
        point.changeCoords(10.9f,11.2f);
        System.out.println(point.toString());
    }
}
