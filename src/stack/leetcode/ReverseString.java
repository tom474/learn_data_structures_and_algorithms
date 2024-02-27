package stack.leetcode;

import stack.leetcode.Stack;

public class ReverseString {
    static public String reverseString(String string) {
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        for (char c : string.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
    }
}
