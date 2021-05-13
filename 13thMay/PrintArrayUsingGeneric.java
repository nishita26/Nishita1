package thirteen_may;

public class PrintArrayUsingGeneric {

	public static <E> void printArray(E[] arr) {
		for(E element : arr) {
			System.out.println(element);
		}
		System.out.println();
		
	}
	public static void main(String[] args)
	{
		Integer[] intarr= {1, 2, 3, 4, 5};
		Double[] doublearr= {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] chararr= {'H', 'I'};
		String[] strarr= {"Hello", "How","Are", "You?"};
		
		System.out.println("Print Integer Array: ");
		printArray(intarr );
		
		System.out.println("Print Double Array: ");
		printArray(doublearr);
		
		System.out.println("Print Character Array: ");
		printArray(chararr);
		
		System.out.println("Print String Array:");
		printArray(strarr);
		
		
		

	}

}
