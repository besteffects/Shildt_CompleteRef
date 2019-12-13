package CollectionsFramework;

import java.util.ArrayList;
import java.util.Spliterator;

//Similar to Iterator, but uses different techniques and provides more functionality
class SpliteratorDemo {
    public static void main(String[] args) {
        //Create an array list of doubles
        ArrayList<Double> vals = new ArrayList<Double>();

        //Add values to the arrayList
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //Use tryAdvance to display contents of vals.
        System.out.print("Contents of vals: \n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        //Create new list that contains square roots.
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        //Use forEachRemaining to display contents of sqrs.
        System.out.print("Contents of sqrs: \n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
