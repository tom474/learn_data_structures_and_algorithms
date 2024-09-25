package s04_linked_list.sample;

import s04_linked_list.LinkedList;

public class Get {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println(myLinkedList.get(3).value);

        /*
            EXPECTED OUTPUT:
            ----------------
            3
        */
    }
}
