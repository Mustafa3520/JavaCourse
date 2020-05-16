package day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {

    public static void main(String[] args) {
     //   Set<Character> hashSet = new LinkedHashSet<>();

        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        hashSet.remove("Three");
        System.out.println("HashSet: " + hashSet);


        LinkedHashSet<String> linkedSet = new LinkedHashSet();
        linkedSet.add("One");
        linkedSet.add("Two");
        linkedSet.add("Three");
        linkedSet.add("Four");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");

        linkedSet.add("ZERO");


        linkedSet.remove("Three");
        System.out.println("LinkedHashSet: " + linkedSet);

    }
}