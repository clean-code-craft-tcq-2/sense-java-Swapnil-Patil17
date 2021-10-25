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
    
   if (numbers.isEmpty()) {
      return new Stats(Float.NaN, Float.NaN, Float.NaN);
    }
    float min = Collections.min(numbers);
    float max = Collections.max(numbers);
    float sum = 0.0f;
    for (Float number : numbers) {
      sum += number;
    }
    float average = sum / numbers.size();
    return new Stats(min, max, average);
}
}
