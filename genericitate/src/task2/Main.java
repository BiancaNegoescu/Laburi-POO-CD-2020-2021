package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    private static void addAll(Collection<? extends Sumabil> sumabil) {
        Iterator<? extends Sumabil> iterator = sumabil.iterator();

        // always store the sum at the first elem
        Sumabil firstEl = iterator.next();
        while(iterator.hasNext()) {
            firstEl.addValue(iterator.next());
        }
    }

    public static void main(String[] args) {
        // for matrix
        MyMatrix m1 = new MyMatrix();
        MyMatrix m2 = new MyMatrix();
        MyMatrix m3 = new MyMatrix();
        // copy the first matrix to use it to store the sum of all
        MyMatrix m1Copy = m1.copyMatrix();

        System.out.println("M1:");
        m1.printMatrix();
        System.out.println("M2:");
        m2.printMatrix();
        System.out.println("M3");
        m3.printMatrix();

        System.out.println("M1 + M2 + M3");
        System.out.println("sum by adding them one by one");
        m1.addValue(m2);
        m1.addValue(m3);
        m1.printMatrix();
        System.out.println();

        ArrayList<Sumabil> sumabils = new ArrayList<>();
        // previous M1
        sumabils.add(m1Copy);
        sumabils.add(m2);
        sumabils.add(m3);
        addAll(sumabils);
        System.out.println("sum using addAll");
        m1Copy.printMatrix();
        sumabils.clear();

        // for vector
        MyVector3 v1 = new MyVector3(1,2,6);
        MyVector3 v2 = new MyVector3(3,67,12);
        MyVector3 v3 = new MyVector3(5,12,61);

        System.out.println("V1:");
        v1.printVector();
        System.out.println("V2:");
        v2.printVector();
        System.out.println("V3");
        v3.printVector();

        System.out.println("V1 + V2 + V3:");
        System.out.println("sum by adding one by one");
        v1.addValue(v2);
        v1.addValue(v3);
        v1.printVector();
        System.out.println();

        // prev V1
        v1 = new MyVector3(1,2,6);
        sumabils.add(v1);
        sumabils.add(v2);
        sumabils.add(v3);
        addAll(sumabils);
        System.out.println("sum using addAll");
        v1.printVector();
    }
}