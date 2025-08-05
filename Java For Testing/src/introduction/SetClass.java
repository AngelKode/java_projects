package introduction;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Suzuki");
        hashSet.add("Honda");
        hashSet.add("Audi");

        System.out.println("Hash set:");
        for(String el : hashSet){
            System.out.println(el + "\n");
        }

        List<String> myList = new ArrayList<>();
        myList.add("Suzuki");
        myList.add("Honda");
        myList.add("Audi");

        System.out.println("Array List:");
        for(String el : myList){
            System.out.println(el + "\n");
        }

        Set<String> linkedHS = new LinkedHashSet<>();
        linkedHS.add("Suzuki");
        linkedHS.add("Honda");
        linkedHS.add("Audi");

        System.out.println("Linked Hash set:");
        for(String el : linkedHS){
            System.out.println(el + "\n");
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Suzuki");
        treeSet.add("Honda");
        treeSet.add("Audi");

        System.out.println("Tree set:");
        for(String el : treeSet){
            System.out.println(el + "\n");
        }


    }
}
