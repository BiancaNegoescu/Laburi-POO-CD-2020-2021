import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class mainTest {
    public mainTest() {
        super();
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Popescu", "Andrei", 9.78);
        Student s2 = new Student(123, "Popa", "Ioana", 9.78);
        Student s3 = new Student(974, "Balanescu", "Cristi", 8.76);
        Student s4 = new Student(756, "Zamfir", "Teodora", 9.89);
        Student s5 = new Student(456, "Zamfir", "Alina", 9.89);
        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        // task 2
        Collections.sort(students); // ordine asc dupa medie
        //Collections.reverse(students); ordine desc dupa medie
        System.out.println(students.toString());

        // task 3 sortare desc dupa medie cu fct lambda
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        System.out.println(students.toString());

        // task 4 PriorityQueue cu elem sortate cresc dupa id
        PriorityQueue<Student> queue = new PriorityQueue<Student>(students.size(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(), o2.getId());
            }
        });
        queue.addAll(students);
        System.out.println(queue);

        // task6
        HashMap<Student, LinkedList<String>> hashmap = new HashMap<>();
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("PC", "PL", "USO"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("PC", "MN", "SD"));
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("MN", "M3", "ELTH"));
        hashmap.put(s1, list1);
        hashmap.put(s2, list2);
        hashmap.put(s3, list3);
        for (Map.Entry<Student, LinkedList<String>> entry: hashmap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // task7
        // LinkedHashSet
        onlyEvenNr even = new onlyEvenNr();
        even.add(20);
        even.add(10);
        even.add(3);
        even.add(2);
        even.add(105);
        even.add(4);
        for (Integer elem: even) {
            System.out.println("LinkedHashSet: " + elem);
        }

        // HashSet
        onlyEvenNr2 even2 = new onlyEvenNr2();
        even2.add(20);
        even2.add(10);
        even2.add(3);
        even2.add(2);
        even2.add(105);
        even2.add(4);
        for (Integer elem: even2) {
            System.out.println("HashSet: " + elem);
        }

        // TreeSet
        onlyEvenNr3 even3 = new onlyEvenNr3();
        even3.add(20);
        even3.add(10);
        even3.add(3);
        even3.add(2);
        even3.add(105);
        even3.add(4);
        for (Integer elem: even3) {
            System.out.println("TreeSet: " + elem);
        }
        // Se observa ca in TreeSet elementele sunt sortate (set sortat)
        // In LinkedHashSet sunt afisate dupa cum au fost introduse (set ordonat)
        // In HashSet sunt puse in mod neordonat si nesortat, cam random adica (neordonat si nesortat)
    }

}
