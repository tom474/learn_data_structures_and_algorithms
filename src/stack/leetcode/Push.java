package stack.leetcode;

import stack.leetcode.Stack;

public class Push {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.printStack();

        /*
            EXPECTED OUTPUT:
			3
			2
			1
        */
    }
}
