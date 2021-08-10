package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args){
        Course course = new Course();
        ArrayList<Student> students = new ArrayList<Student>();

        course.setTitle("english");

        Student students1 = new Student();
        students1.setName("ionescu");
        students1.setYear(2);
        students.add(students1);

        Student students2 = new Student();
        students2.setName("matei");
        students2.setYear(3);
        students.add(students2);

        Student students3 = new Student();
        students3.setName("popescu");
        students3.setYear(2);
        students.add(students3);

        Student students4 = new Student();
        students4.setName("andrei");
        students4.setYear(1);
        students.add(students4);

        Student students5 = new Student();
        students5.setName("andrei");
        students5.setYear(1);
        students.add(students5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dati numarul anului de studiu :" );
        int givenYear = sc.nextInt();

        course.filterYear(students, givenYear);

        System.out.println((students4).equals(students5));

        }

    }