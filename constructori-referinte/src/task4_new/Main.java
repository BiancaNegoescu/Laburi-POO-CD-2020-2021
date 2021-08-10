package task4_new;

import task4_new.Book;

public class Main {
    public static void main(String[] args) {
        task4_new.Book b1 = new task4_new.Book("Morometii", "Marin Preda", 1955);
        System.out.println(b1);

        task4_new.Book b2 = new Book("Levantul", "Mircea Cărtărescu", 1990);
        System.out.println(b2);

        b1.toString();
        b2.toString();
    }
}