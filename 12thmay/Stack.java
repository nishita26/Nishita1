package twelve_may;

public class Stack {
	
	static final int MAX=1000;
	int top;
	int a[]=new int[MAX];
	
	boolean isEmpty() {
		return (top<0);
	}
	Stack(){
		top=-1;
	}
	//push the element
	boolean push(int x) {
		if(top>= (MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	
	//pop the element
	int pop() 
	{
		if(top<0)
		{
			System.out.println("Stack undeflow");
			return 0;
		}
		else {
			int x=a[top--];
			return x;
		}
	}
	
	public void printstack()
	{
		for(int i=0;i<=top;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop()+" popped from stack");
		System.out.println("Element present in the stack: ");
		s.printstack();
				
	}

}
