package stack3;

import java.util.Stack;

public class Stack3 {
    
    static int evaluatePostfix(String exp) 
    { 
        Stack<Integer> stack3=new Stack<>();
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
            if(Character.isDigit(c)) 
            stack3.push(c - '0');
            else
            { 
                int val1 = stack3.pop(); 
                int val2 = stack3.pop(); 
                  
                switch(c) 
                { 
                    case '+' -> stack3.push(val2+val1); 
                      
                    case '-' -> stack3.push(val2- val1); 
                      
                    case '/' -> stack3.push(val2/val1); 
                      
                    case '*' -> stack3.push(val2*val1); 
              } 
            } 
        } 
        return stack3.pop();     
    }
    
    public static void main(String[] args) {
        String exp="221*+9-"; 
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
    
}
