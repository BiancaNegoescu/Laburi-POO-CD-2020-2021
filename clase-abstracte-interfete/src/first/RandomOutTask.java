package first;

import java.util.Random;

public class RandomOutTask implements Task{

    public RandomOutTask(){
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        System.out.println("Random Integer number: "+ rand_int);
    }

    public void execute(){
    }
}
