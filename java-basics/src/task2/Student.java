package task2;

import java.util.Objects;
import java.util.Scanner;

class Student {
     private String name;
     private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYear() == student.getYear() &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                '}';
    }
}
