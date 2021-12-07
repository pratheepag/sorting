package com.sorting;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingObjectComparator {
    public static void main(String argv[]){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "RAM", 10000D));
        employeeList.add(new Employee(2, "ABI", 90000D));
        employeeList.add(new Employee(3, "Katherine", 5000D));
        employeeList.add(new Employee(4, "Katherine", 10000D));
        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        employeeList.forEach(k->{ System.out.println(k.getName());
                                    System.out.println(k.getSalary());
        });
    }
}
