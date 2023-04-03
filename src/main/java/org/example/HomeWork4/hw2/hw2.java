package org.example.HomeWork4.hw2;

import java.util.Deque;
import java.util.HashMap;
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
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> complement =
                new HashMap<Character, Character>();

        complement.put(')', '(');
        complement.put(']', '[');
        complement.put('}', '{');

        for (Character c : text.toCharArray()) {
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty() || stack.pop() != complement.get(c)) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }

}

