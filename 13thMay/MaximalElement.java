package thirteen_may;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximalElement {
	
	public static <T extends Comparable<T>> T max(List<T> list,int begin,int end) {
		T max=list.get(begin);
		for(int i= begin+1; i < end;i++) {
			if(list.get(i).compareTo(max) > 0) {
				max=list.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=in.nextInt();
		System.out.print("Enter the elements:");
		for(int i=0; i<size;i++) {
			int n=in.nextInt();
			al.add(n);
		}
		in.close();
		System.out.print("Maximal Element: "+max(al,0,size));
	}

}
