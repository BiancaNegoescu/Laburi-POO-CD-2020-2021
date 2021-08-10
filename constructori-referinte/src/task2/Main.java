package task2;

import java.util.*;
import java.io.*;

// am modificat eu in loc de Student cu Student1 ca mi aparea duplicate din cauza lui Student de la primul lab

public class Main {
    public static void main (String[] args) {
        Student1 student1 = new Student1 (42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        */
        Student1 student2 = new Student1(student1);

        student2.setName("Cezar");
        student2.setSurname("Ghiu");
        
        /*
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();
    }
}