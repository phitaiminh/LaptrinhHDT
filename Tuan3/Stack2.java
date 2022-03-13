package stack2;

import java.util.EmptyStackException;
import java.util.LinkedList;
   
        
        
public class Stack2<T> {
    
    private final LinkedList<T> stack;
    public Stack2() {
        stack = new LinkedList();
    }
    
    public void push(T element) {
        stack.addFirst(element);
    }
    
    public T pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    return stack.removeFirst();
    }
    
    public int size() {
        return stack.size();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private static void stackOfIStrings() {
        Stack2<String> stack2 = new Stack2();
        stack2.push("One");
        stack2.push("Tow");
        stack2.push("Three");
        System.out.println("1.1 Size of stack after push operations: " + stack2.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack2.isEmpty()) {
            System.out.printf(" %s", stack2.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack2.size());
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfIStrings();
    }
}
    
    
