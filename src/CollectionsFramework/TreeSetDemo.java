package CollectionsFramework;

import java.util.TreeSet;

// Objects are sorted in sorted, ascending order. Access times are fast
class TreeSetDemo {
    public static void main(String[] args) {
        //Create a tree set.

        TreeSet<String> ts = new TreeSet<String>();

        //Add elements to the tree set

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts); //elements are printed as sorted

        System.out.println(ts.subSet("C", "F")); //print elements from C(inclusive) to F (exclusive)
    }
}
