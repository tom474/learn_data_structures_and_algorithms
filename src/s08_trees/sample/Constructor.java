package s08_trees.sample;

import s08_trees.BinarySearchTree;

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
