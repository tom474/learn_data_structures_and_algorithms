package queue.testcase;

import queue.Queue;

public class Constructor {
    public static void main(String[] args) {
        Queue myQueue = new Queue(4);
        myQueue.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            First: 4
            Last: 4
            Length: 1

            Queue:
            4
        */
    }
}
