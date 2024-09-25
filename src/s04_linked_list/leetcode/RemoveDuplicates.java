package s04_linked_list.leetcode;

import s04_linked_list.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4
        */
    }
}
