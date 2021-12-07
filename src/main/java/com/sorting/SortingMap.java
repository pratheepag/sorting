package com.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class SortingMap {
    public static void main(String argv[]){
        HashMap<String, Integer> mapElements = new HashMap<>();

        mapElements.put("FRANCE", 70);
        mapElements.put("ITALY", 10);
        //Assign to LinkedList and sort
        //Sorting object by value
        List<Map.Entry<String, Integer> > list;
        list = new LinkedList<Map.Entry<String, Integer> >(mapElements.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for(Map.Entry<String, Integer> entry: temp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //
        HashMap<String, Integer> sortedMap = mapElements.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedMap.forEach((k, v) -> {
            String s = k + " " + v;
            System.out.println(s);
        });
        //Sorting object by key
        HashMap<String, Integer> sortedMapByKey = mapElements.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedMapByKey.forEach((k, v) -> {
            String s = k + " " + v;
            System.out.println(s);
        });


        Map<String, Integer> treeMap = new TreeMap<>(mapElements);
        for (String str : treeMap.keySet()) {
            System.out.println(str);
        }
    }
}
