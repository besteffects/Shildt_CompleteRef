package comparator;

import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
        //Pass a reverse comparator to TreeSet() via a
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        //Add elements to the TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //Display the elements.
        for (String element : ts) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
