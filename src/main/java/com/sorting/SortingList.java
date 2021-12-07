package com.sorting;

import java.util.*;

public class SortingList {
    public static void main(String argv[]){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(50);
        integerList.add(20);

        //Ascending Order
        Collections.sort(integerList);
        System.out.println("Ascending Order");
        System.out.println(Arrays.toString(integerList.toArray()));

        //Descending Order
        System.out.println("Descending Order");
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerList.toArray()));

        //Using streams sort
        integerList.stream().sorted().forEach(System.out::println);

        //Using streams sort in descending order
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
