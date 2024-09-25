package s04_linked_list.sample;

import s04_linked_list.LinkedList;

public class Constructor {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4
        */
    }
}
