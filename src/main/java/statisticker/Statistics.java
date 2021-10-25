package statisticker;

import java.util.List;


static class stats {

  float average;
  float min;
  float max;

  public stats(final float average, final float min, final float max) {
    this.average = average;
    this.min = min;
    this.max = max;
  }
}

public class Statistics 
{

  public static stats getStatistics(final List<Float> numberList) {
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
	  return new stats(average, min, max);
    }
	else{
		return new stats(Float.NaN, Float.NaN, Float.NaN);
	}
    
  }

}
