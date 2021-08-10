package dataprocessing;

import main.Utils;
import storage.DataRepository;

public class StepCountStrategyFactory{
   public StepCountStrategy createStrategy(String strategyType){
       if(strategyType != null && strategyType.equals(Utils.BASIC_STRATEGY))
       {
           return new BasicStepCountStrategy();
       }
       if(strategyType != null && strategyType.equals(Utils.FILTERED_STRATEGY))
       {
           return new FilteredStepCountStrategy();
       }
       return null;
   }

}
