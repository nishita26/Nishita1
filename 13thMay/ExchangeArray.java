package thirteen_may;

import java.util.Arrays;

public class ExchangeArray {
	public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
	public static void main(String[] args) {
		
		String[] a={"A","B","C"};
		System.out.println("before: "+Arrays.toString(a));
		swap(a,0,2);
		System.out.println("after: "+Arrays.toString(a));
	}

}