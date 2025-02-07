package s05_doubly_linked_list.sample;

import s05_doubly_linked_list.DoublyLinkedList;

public class Append {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.printAll();

        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Doubly Linked List:
        	1
        	2
     	*/
    }
}
