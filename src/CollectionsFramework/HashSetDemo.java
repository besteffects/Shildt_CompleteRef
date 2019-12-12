package CollectionsFramework;
//Demonstrate HashSet
//HashSet does not guarantee the order of elements, but it is quick (execution time of methods
// add(), contains(), remove() and size() is constant)
import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        //Create a HashSet
        HashSet<String> hs = new HashSet<String>();

        //Add elements to the hash set

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
