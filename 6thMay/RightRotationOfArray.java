//Program to right rotate the elements of an array
import java.util.Scanner;

public class RightRotationOfArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int l = in.nextInt();
		int[] arr = new int[l]; 
		System.out.println("Enter array elements: ");
		for(int i=0; i<l; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print("Enter number of rotations: ");
		int n = in.nextInt();
		in.close();
		
		System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }
        
        for(int i = 0; i < n; i++){    
            int j, last;
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){
            	arr[j] = arr[j-1];    
            }  
            arr[0] = last;    
        }    
        
        System.out.println(); 
        System.out.println("Array after right rotation: ");    
        
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }
}