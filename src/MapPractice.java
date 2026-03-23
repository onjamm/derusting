import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Elena", 20);
    map.put("Damon", 180);
    map.put("Stefan", 170);
    // Get the value associated with a given key in the Map
    Integer value = map.get("Damon");
    System.out.println("Damon's Age: " + value);

    // Find the size (number of key/value pairs) of the Map
    System.out.println("Size of the Map: " + map.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    map.put("Damon", 185);
    System.out.println("Damon's New Age: " + map.get("Damon"));

    // Check whether the Map contains a given key
    boolean hasKey = map.containsKey("Stefan");
    System.out.println("Does the Map contain the key 'Stefan?' " + hasKey);

    // Check whether the Map contains a given value
    boolean hasValue = map.containsValue(170);
    System.out.println("Does the Map contain 170? " + hasValue);

    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys in the Map: ");
    for (String key : map.keySet()) {
        System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    System.out.println("Values in the Map: ");
    for (Integer mapValues : map.values()) {
        System.out.println(mapValues);
    }

    // Iterate over the entries in the map, printing each key and value
    System.out.println("Entries in the Map: ");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
