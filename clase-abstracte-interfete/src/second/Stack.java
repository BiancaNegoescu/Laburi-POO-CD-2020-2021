package second;

import first.Task;

import java.util.ArrayList;

public class Stack implements Container {

    ArrayList<Task> list = new ArrayList<>();

//    public Stack( ArrayList<Task> list) {
//        this.list = list;
//    }
    public Task task;

    public Task pop(){
        Task task2 = list.get(list.size() - 1);
        list.remove( list.get(list.size()-1) );
        return task2;
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

    public ArrayList<Task> getList() {
        return list;
    }

    public void transferFrom(Container container){
        while(!container.isEmpty()){
            list.add(container.pop());
        }

    }

}
