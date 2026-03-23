import java.util.*;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "Batman";

    // Find the length of the string
    int stringLength = myString.length();
    System.out.println("Length of myString: " + stringLength);

    // Concatenate (add) two strings together and reassign the result
    String sidekick = "Robin";
    String duo = myString + " and " + sidekick;
    System.out.println("Concatenated string: " + duo);

    // Find the value of the character at index 3
    char charAtIndexThree = myString.charAt(3);
    System.out.println("Character at index 3: " + charAtIndexThree);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsSubstring = duo.contains("Robin");
    System.out.println("Is Robin in the duo?" + containsSubstring);

    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("Characters in myString: ");
    for (int i = 0; i < myString.length(); i++) {
        System.out.println(myString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add(myString);
    stringList.add(sidekick);
    stringList.add("Joker");
    stringList.add("Penguin");
    stringList.add("Riddler");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedList = String.join(", ", stringList);
    System.out.println("Joined List: " + joinedList);

    // Check whether two strings are equal
    boolean equals = myString.equals(sidekick);
    System.out.println("Is Batman Robin? " + equals);


    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
