import java.util.*;
public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> set = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    set.add("Fry");
    set.add("Leela");
    set.add("Bender");

    // Check whether the Set contains a given String
    boolean hasString = set.contains("Leela");
    System.out.println("Does the set contain 'Leela?' " + hasString);

    // Remove an element from the Set
    set.remove("Bender");

    // Get the size of the Set
    System.out.println("Size of the Set after forgetting about Bender on last delivery: " + set.size());

    // Iterate over the elements of the Set, printing each one on a separate line

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
