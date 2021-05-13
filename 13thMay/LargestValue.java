package thirteen_may;

public class LargestValue {

	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max=x;
		
		if (y.compareTo(max) > 0)
	        max = y;

	    if (z.compareTo(max) > 0)
	    	max = z;
	    	return max;
	    }
	public static void main(String[] args) {
		
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 1, 2, 5, maximum(1, 2, 5));
	    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
	        8.8, 7.7));
	    System.out.printf("Maximum of %s, %s and %s is %s\n", "mango", "apple", "banana", maximum(
	        "mango", "apple", "banana"));
	}

	}
