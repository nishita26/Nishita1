package twelve_may;
import java.util.*;

public class SwapNumberUsingVector {

	public static void main(String[] args) {
			Vector<Integer> v=new Vector<Integer>();
			Scanner in=new Scanner(System.in);
			System.out.print("Enter First Number: ");
			int a=in.nextInt();
			System.out.print("Enter Second Number: ");
			int b=in.nextInt();
			in.close();
			v.add(a);
			v.add(b);
			System.out.println("Before swapping:"+v);
			Collections.swap(v,0,1);
			System.out.println("After Swapping:"+v);
			
	}

}
