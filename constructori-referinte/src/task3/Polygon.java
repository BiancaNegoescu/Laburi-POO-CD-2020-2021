package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Polygon {
    ArrayList<Point> points;

    public  Polygon(int n){
        points = new ArrayList<>(n);
    }

    public Polygon(ArrayList<Float> v) {
        this(v.size() / 2);
        int i = 0;
        while (i < v.size()) {
            points.add(new Point(v.get(i), v.get(i+1)));
            i+=2;
        }
        show(this.points);
    }

      public void show(ArrayList<Point> v){
          for (int i =0; i< v.size() ;i++)
              System.out.println(v.get(i));

    }


}



