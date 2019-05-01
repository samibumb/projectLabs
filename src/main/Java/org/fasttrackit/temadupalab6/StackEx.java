package org.fasttrackit.temadupalab6;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("first");
        printStack(stack);

        stack.push("second");
        printStack(stack);

        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);

        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s) {
        if (s.isEmpty()) {
            System.out.println("You have nothing in your stack");
        } else {
            System.out.printf("%s Sami\n", s);
        }
    }
}