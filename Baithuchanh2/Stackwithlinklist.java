package stackwithlinklist;

import java.util.EmptyStackException;
import java.util.LinkedList;
   
        
        //bai 3 4
public class Stackwithlinklist<T> {
    
    private final LinkedList<T> stack;
    public Stackwithlinklist() {
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
        Stackwithlinklist<String> stack = new Stackwithlinklist();
        stack.push("2002");
        stack.push("12");
        stack.push("21");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfIStrings();
    }
}
    
    
