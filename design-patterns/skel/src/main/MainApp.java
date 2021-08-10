package main;

import storage.ConsoleLogger;
import storage.DataAggregator;
import storage.DataRepository;
import storage.SensorData;
import storage.ServerCommunicationController;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Choose a strategy: type 'basic or 'filtered");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = new DataRepository();
        // TODO: use the StepCountStrategyFactory to create a strategy

        // TODO: add observers to the dataRepository
        // don't forget to provide the strategy to the DataAggregator observer
        ConsoleLogger observer1 = new ConsoleLogger();
        DataAggregator observer2 = new DataAggregator();
        ServerCommunicationController observer3 = new ServerCommunicationController();

        dataRepository.addObserver(observer1);
        dataRepository.addObserver(observer2);
        dataRepository.addObserver(observer3);

        dataRepository.setStrategy(strategyType);
        observer2.setStrategy(strategyType);

        long baseTimestamp = System.currentTimeMillis();

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();


        // TODO: after the first successful run, change this to baseTimestamp + 40000 and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();

    }
}
