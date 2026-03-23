public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] words = new String[4];
    // Set the value of the array at each index to be a different String
    words[0] = "Sam";
    words[1] = "Dean";
    words[2] = "Castiel";
    words[3] = "Crowley";
    
    // It's OK to do this one-by-one

    // Get the value of the array at index 2
    String indexTwo = words[2];
    System.out.println("Value at Index 2: " + indexTwo);
    System.out.println();
    

    // Get the length of the array
    int length = words.length;
    System.out.println("Length of word array: " + length);
    System.out.println();

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < 4; i++) {
        System.out.println(words[i]);
    }

    
    System.out.println();
    // Iterate over the array using a for-each loop and print out each item
    for (String word : words) {
        System.out.println(word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
