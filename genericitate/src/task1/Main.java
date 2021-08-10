package task1;

public class Main {
    public static void main(String[] args) {

        MyHashMap<Integer, MyString> myHashMap = new MyHashMap<>(10);
        MyString myString0 = new MyString("zero");
        myHashMap.put(0, myString0);
        MyString myString1 = new MyString("unu");
        myHashMap.put(1, myString1);
        MyString myString2= new MyString("doi");
        myHashMap.put(2, myString2);
        MyString myString3 = new MyString("trei");
        myHashMap.put(3, myString3);

        // prints the elements
        System.out.println(myHashMap);
        // prints the entry which has the 3 key
        System.out.println(myHashMap.get(3));
    }
}

