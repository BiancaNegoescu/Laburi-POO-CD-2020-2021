package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy{

    @Override
    public int getTotalSteps(DataRepository dataRepository) {
        return dataRepository.getData().stream().mapToInt(SensorData::getStepsCount).sum();
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }

}
