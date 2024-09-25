package s05_doubly_linked_list.sample;

import s05_doubly_linked_list.DoublyLinkedList;

public class RemoveLast {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeLast());

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null
     	*/
    }
}
