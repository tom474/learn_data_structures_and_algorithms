package s05_doubly_linked_list.leetcode;

import s05_doubly_linked_list.DoublyLinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {
        DoublyLinkedList myDLL1 = new DoublyLinkedList(1);
        myDLL1.append(2);
        myDLL1.append(3);
        myDLL1.append(2);
        myDLL1.append(1);

        System.out.println("myDLL1 isPalindrome:");
        System.out.println( myDLL1.isPalindrome() );

        DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nmyDLL2 isPalindrome:");
        System.out.println( myDLL2.isPalindrome() );

        /*
       		EXPECTED OUTPUT:
        	----------------
            myDLL1 isPalindrome:
            true

            myDLL2 isPalindrome:
            false
     	*/
    }
}
