package s9_hash_tables.sample;

import s9_hash_tables.HashTable;

public class Get {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0
        */
    }
}
