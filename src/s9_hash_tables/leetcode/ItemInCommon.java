package s9_hash_tables.leetcode;

import java.util.HashMap;

public class ItemInCommon {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true
        */
    }
}
