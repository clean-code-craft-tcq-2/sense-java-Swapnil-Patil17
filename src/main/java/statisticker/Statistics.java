package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<___> numbers) {
        //implement the computation of statistics here
        public float sum=0;
		public float min=numbers[0];
		public float max=numbers[0]; 
		public float average=0;
		
		if(numbers.length != 0){
		
		  for(int i=0;i<numbers.length;i++){
			  sum +=numbers[i];
			  
			  if(max > numbers[i]){
				  max=numbers[i];
			  }
			  
			  if(min < numbers[i]){
				  min=numbers[i];
			  }
		  }
		  
		  average=sum/numbers.length;
		}
		else{
			average=NaN;
			min=NaN;
			max=NaN;
		}
    }
}
