package statisticker;

import java.util.List;




public class Statistics 
{
public static class Stats {

  float average;
  float min;
  float max;

  public Stats(final float average, final float min, final float max) {
    this.average = average;
    this.min = min;
    this.max = max;
  }
}

  public static Stats getStatistics(final List<Float> numberList) {
    float sum = 0;
    float min = numberList.get(0);
    float max = numberList.get(0);
    float average = 0;

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

      average = sum / numberList.size();
	  return new Stats(average, min, max);
    }
	else{
		return new Stats(Float.NaN, Float.NaN, Float.NaN);
	}
    
  }

}
