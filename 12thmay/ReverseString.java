package twelve_may;

import java.util.Scanner;
import java.util.Stack;
 
class ReverseString
{
    
    public static String reverse(String str)
    {
        
        if (str == null || str.equals("")) {
            return str;
        }
 
        
        Stack<Character> stack = new Stack<Character>();
 
        // push every character of the given string into the stack
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
 
        
        int a = 0;
 
        // pop characters from the stack 
        while (!stack.isEmpty())
        {
            
            ch[a++] = stack.pop();
        }
 
        // convert the character array into a string and return it
        return String.copyValueOf(ch);
    }
 
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=in.nextLine();
        in.close();
 
        str = reverse(str);        
 
        System.out.println("The reversed string is " + str);
    }
}