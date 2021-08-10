package first;

public class CounterOutTask implements  Task{
    private static int counter = 0;

    public CounterOutTask(){
        counter++;
        System.out.println("the counter is: " + counter);
    }

    public void execute(){
    }
}
