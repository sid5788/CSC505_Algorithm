package Arrays;

public class slidingWindowMin {
	public static int[] slidingWindowMin( int[] in,  int w) {
	     int[] min_left = new int[in.length];
	     int[] min_right = new int[in.length];

	    min_left[0] = in[0];
	    min_right[in.length - 1] = in[in.length - 1];

	    for (int i = 1; i < in.length; i++) {
	        min_left[i] = (i % w == 0) ? in[i] : Math.min(min_left[i - 1], in[i]);

	         int j = in.length - i - 1;
	        min_right[j] = (j % w == 0) ? in[j] : Math.min(min_right[j + 1], in[j]);
	    }

	     int[] sliding_min = new int[in.length - w + 1];
	    for (int i = 0, j = 0; i + w <= in.length; i++) {
	        sliding_min[j++] = Math.min(min_right[i], min_left[i + w - 1]);
	    }

	    return sliding_min;
	}
}
