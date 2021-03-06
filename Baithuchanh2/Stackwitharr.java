package stackwitharr;

import java.util.EmptyStackException;
import java.util.Stack;


//bai 1 

public class Stackwitharr {
    
    static void showpush(Stack st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
   }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
   }
    
    
    public static void main(String[] args) {
        Stack st = new Stack() {};
        System.out.println("stack: " + st);
        showpush(st, 2002);
        showpush(st, 12);
        showpush(st, 21);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
    
}
