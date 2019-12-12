package CollectionsFramework;
//LinkedHashSet maintains the order in which entries of the set were inserted

import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Create a HashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //Add elements to the hash set

        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");
        System.out.println(lhs);
    }
}
