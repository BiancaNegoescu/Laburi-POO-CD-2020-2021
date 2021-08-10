package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy{
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);

    @Override
    public int getTotalSteps(DataRepository repository) {
        return repository.getData().stream().filter(o1 -> o1.getStepsCount() > 0)
                .filter(o1 -> o1.getTimestamp() > TIME_FOR_MAX_DIFF)
                .filter(o1 -> o1.getStepsCount() < MAX_DIFF_STEPS_CONSECUTIVE_RECORDS)
                .mapToInt(SensorData::getStepsCount).sum();
    }

    @Override
    public String getStrategyDescription() {
        return Utils.FILTERED_STRATEGY;
    }
}
