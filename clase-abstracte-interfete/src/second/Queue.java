package second;

import first.Task;

import java.util.ArrayList;

public class Queue  implements Container{

    ArrayList<Task> list = new ArrayList<>();

    public Task task;

    public Task pop(){
        task = list.get(0);
        list.remove(list.get(0));
        return task;
    }

    public void push(Task task){
        list.add(task);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void transferFrom(Container container){
        while (!container.isEmpty()){
           list.add(container.pop());
        }
    }

    public ArrayList<Task> getList() {
        return list;
    }

}
