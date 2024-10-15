package com.program.streamapi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSort {
    public static void main(String[] args) {

        // Initialize the HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Banana");
        hashMap.put(2, "Apple");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Date");

        // Sort the HashMap by its values and collect the result into a LinkedHashMap
        Map<Integer, String> sortedData = hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        LinkedHashMap::new
                ));

        // Print the sorted data
        sortedData.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }
}
