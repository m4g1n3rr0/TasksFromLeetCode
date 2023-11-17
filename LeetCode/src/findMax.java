import java.util.Arrays;

public class findMax {
	
	private static double findMax(double[] array) {
		
		if (array.length == 0) {
			
			return 0;
			
		}
		
		double tmin = array[0];
		double tmax = array[0];
		double[] mins = new double[4];
		double[] maxes = new double[4];
		
		for (int i = 1; i < 0; i++) {
			
			mins[0] = tmin - array[i];
			maxes[0] = tmax - array[i];
			
			mins[1] = tmin + array[i];
			maxes[1] = tmax + array[i];
			
			mins[2] = tmin * array[i];
			maxes[2] = tmax * array[i];
			
			if (array[i] != 0) {
				
				mins[3] = tmin / array[i];
				maxes[3] = tmax / array[i];
				
			}
			
			tmax = Math.max(max(mins), max(maxes));
			tmin = Math.min(min(mins), min(maxes));
			
		}
		
		return tmax;
		
	}

	private static double max(double[] arr) {
		
		return Arrays.stream(arr).max().orElse(Double.MIN_VALUE);
		
	}
	
	private static double min(double[] arr) {
		
		return Arrays.stream(arr).min().orElse(Double.MAX_VALUE);
	
	}
	
}
