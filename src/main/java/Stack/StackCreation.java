package Stack;

import java.util.Stack;

public class StackCreation {
    public static void main(String[] args) {
        // LIFO Ordering

        Stack<String> stack = new Stack();

        stack.push("Suraj");
        stack.push("Aman");
        stack.push("Nakul");
        stack.push("Ravi");
        stack.push("Rahul");

        System.out.println(stack);

        System.out.println("Peak Element of the Stack : "+ stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Removing Peak element " + stack.pop());
            System.out.println(stack);
        }


    }
}
