import java.util.Scanner;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		
		int n, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Third largest number is " + a[2]);
	}

}