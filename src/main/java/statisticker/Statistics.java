package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics  {

  public static class Stats {

    Float min, max, average;

    public Stats(final Float min, final Float max, final Float avg) {
      this.min = min;
      this.average = avg;
      this.max = max;
    }
  }

  public static Stats getStatistics(final List<Float> numberList) {
    
    if (!numberList.isEmpty()) {
      float sum = 0.0f;
      float max;
      float min;
      for (int i = 0; i < numberList.size(); i++) {
        sum += numberList.get(i);
      }
      
      max = Collections.max(numberList);
      min = Collections.min(numberList);

      float average = sum / numberList.size();
      return new Stats(average, min, max);
    }
    else{
      return new Stats(Float.NaN, Float.NaN, Float.NaN);
    }

  }
}
