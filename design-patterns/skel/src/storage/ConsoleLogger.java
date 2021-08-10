package storage;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {
    SensorData newData;
    @Override
    public void update(Observable o, Object dataRecord) {
        System.out.println(dataRecord);
    }

}
