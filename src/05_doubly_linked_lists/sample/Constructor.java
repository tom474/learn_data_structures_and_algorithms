package s05_doubly_linked_list.sample;

import s05_doubly_linked_list.DoublyLinkedList;

public class Constructor {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 7
            Length: 1

            Linked List:
            7
        */
    }
}
