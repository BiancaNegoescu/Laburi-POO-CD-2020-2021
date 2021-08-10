package storage;

import communication.ServerMessage;
import main.Utils;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {
    SensorData newData;
    @Override
    public void update(Observable o, Object dataRecord) {
        ServerMessage msg = new ServerMessage( ((SensorData) dataRecord).getStepsCount(),
                Utils.getClientId(), ((SensorData) dataRecord).getTimestamp() );
        System.out.println(msg);
    }
}
