package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
    
  public static class Stats {

    Float min, max, average;

    public Stats(final Float min, final Float max, final Float avg) {
      this.min = min;
      this.average = avg;
      this.max = max;
    }
  }

  public static Stats getStatistics(final List<Float> numberList) {
	Float sum;
 	Float max = numberList.get(0);
 	Float min = numberList.get(0);
    if (numberList.size() != 0) {

      for (int i = 0; i < numberList.size(); i++) {
        sum += numberList.get(i);

        if (max > numberList.get(i)) {
          max = numberList.get(i);
        }

        if (min < numberList.get(i)) {
          min = numberList.get(i);
        }
      }

      Float average = sum / numberList.size();
	  return new stats(average, min, max);
    }
	else{
		return new stats(Float.NaN, Float.NaN, Float.NaN);
	}

}
}
