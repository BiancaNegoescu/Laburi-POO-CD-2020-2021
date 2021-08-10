package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Course {
    private String title;
    private String description;
    private ArrayList <Student> students;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static void filterYear(ArrayList<Student> students, int givenYear) {
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getYear() == givenYear)
                System.out.println(students.get(i).toString());
        }
    }
}