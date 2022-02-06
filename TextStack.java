import java.util.Scanner;

/**
 * Created by HP on 24/01/2022.
 */
public class TextStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack =new ArrayStack<>( 5 );
        Scanner in=new Scanner( System.in );
        System.out.println("id the stack empty?"+myStack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i < 5; i++) {
            myStack.push( in.nextInt() );
            System.out.println("top element ="+myStack.top());
            System.out.println("size ="+myStack.size());
            System.out.println("is the ctack empty?"+myStack.isEmpty());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("delete element ="+myStack.pop());
            System.out.println("top element ="+myStack.top());
            System.out.println("size ="+myStack.size());
            System.out.println("is the ctack empty?"+myStack.isEmpty());

        }
    }

}
