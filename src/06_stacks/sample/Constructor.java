package s06_stacks.sample;

import s06_stacks.Stack;

public class Constructor {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            Top: 4
            Height: 1

            Stack:
            4
        */
    }
}
