package com.bikram.collectionconceptmap;

import java.util.concurrent.ConcurrentHashMap;

/*Thread-safe without full locking
✔ High concurrency
✔ Better performance than Hashtable
✔ No null key or value*/
public class Test {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Bikram");
        map.put(2, "Ravi");

        System.out.println(map.get(1));
    }
}