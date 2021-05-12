package twelve_may;

public class NumberOfBSTree {
	public static class Node {
		int data;
		Node left , right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node root;
	
	public NumberOfBSTree() {
		root = null;
	}
	
	public int factorial(int num) {
		int fact = 1;  
        if(num == 0)  
            return 1; 
        else { 
        	while(num > 1) { 
        		fact = fact * num;  
                num--; 
        	}
        	return fact;
        }
	}
	
	public int numOfBST(int key) {  
		int cn = factorial(2 * key)/(factorial(key + 1) * factorial(key));  
        return cn;
	}
	public static void main(String[] args) {
		
		NumberOfBSTree bst = new NumberOfBSTree();
		System.out.println("Total number of possible Binary Search Trees with given key: " + bst.numOfBST(4));
	}

}
