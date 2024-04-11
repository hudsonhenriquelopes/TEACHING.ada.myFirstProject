package br.gov.caixa.exemplo.collections;

import java.util.*;

public class UsoCollections {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Primeiro item");
        arrayList.add("Item do meio");
        arrayList.add("Item do meio");
        arrayList.add("Último item");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Primeiro item");
        linkedList.add("Item do meio");
        linkedList.add("Item do meio");
        linkedList.add("Último item");

        System.out.println(arrayList + " // " + linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("maçã");
        hashSet.add("laranja");
        hashSet.add("maçã");
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("maçã");
        treeSet.add("laranja");
        treeSet.add("maçã");
        System.out.println("TreeSet: " + treeSet);

        Map<String, String> map = new HashMap<>();
        map.put("3", "Hudson 3");
        map.put("1", "Hudson 1");
        map.put("2", "Hudson 2");
        map.put("1", "Novo valor");
        System.out.println("Map " + map);

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("3", "Hudson 3");
        treeMap.put("1", "Hudson 1");
        treeMap.put("2", "Hudson 2");
        treeMap.put("1", "Novo valor");
        System.out.println("TreeMap " + treeMap);
    }
}
