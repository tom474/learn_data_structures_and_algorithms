package binarysearchtree.testcase;

import binarysearchtree.BinarySearchTree;

public class Constructor {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root: " + myBST.getRoot());

        /*
            EXPECTED OUTPUT:
            ----------------
            Root: null
        */
    }
}
