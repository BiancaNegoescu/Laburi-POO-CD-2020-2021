package storage;

import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;

import java.util.Observable;
import java.util.Observer;

public class DataAggregator implements Observer {
    public String strategyType;
    private StepCountStrategy strategy;
    private int steps;

    public void setStrategy(String strategyType){
        this.strategyType = strategyType;
    }

    @Override
    public void update(Observable o, Object dataRecord) {
        StepCountStrategyFactory factory = new StepCountStrategyFactory();
        this.strategy = factory.createStrategy(this.strategyType);
        this.steps = strategy.getTotalSteps((DataRepository) o);
        System.out.println("strategy name " +  strategy.getStrategyDescription() + " result: " + this.steps);
    }

}


