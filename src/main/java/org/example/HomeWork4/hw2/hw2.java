package org.example.HomeWork4.hw2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class hw2 {
    public static void main(String[] args) {
        String text = "()";
        String text2 = "()[]{}";
        String text3 = "(]";
        System.out.println("1= " + charCeck(text));
        System.out.println("2= " + charCeck(text2));
        System.out.println("3= " + charCeck(text3));

    }

    private static boolean charCeck(String text) {
        Stack<Character> stack = new Stack<>();
        for (char i : text.toCharArray()) {
            if (i == '(')
                stack.push(')');
                else if (i == '{')
                    stack.push('}');
                else if (i == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != i)
                    return false;


        }
        return true;
    }
}

