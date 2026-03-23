public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negative = -3.1403403403213f;
    System.out.println("Negative float: " +negative);

    // Create an int with a positive value and assign it to a variable
    int positive = 999;
    System.out.println("Positive: " +positive);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = positive % 3;
    System.out.println("Remainder: " + remainder);
    // Use the modulo % operator to determine whether the number is even
    int even = positive % 2;
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    if (even == 0) {
        System.out.println("It's Even!");

    } else {
        System.out.println("It's odd!");
    }
    // if the number is odd.

    // Divide the number by another number using integer division
    int division = positive / 3 ;
    System.out.println("Integer division: " + division);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
