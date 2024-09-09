/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        //The usage of semicolons at the end of the loops are different

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; // The addition of semicolons at the end of statements
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // The curly bracket usage at the end of the if statement is different

            System.out.println("Fizz Buzz"); // System.out.println is different.

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i += 1;
        return i;
    }
}
