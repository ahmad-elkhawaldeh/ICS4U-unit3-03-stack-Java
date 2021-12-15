/*
* This program test the stack class
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-08
*/

import java.util.Scanner;

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;
    /**
    * Constant.
    */
    public static final int TWENTY_SEVEN = 27;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final MrCoxallStack stack = new MrCoxallStack();

        // input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Inicial Stack:");
        stack.showStack();

        System.out.println("User input:");
        String input1 = userInput.nextLine();

        System.out.println("Stack with user input converted to int:");

        try {
            int input1Int = Integer.parseInt(input1);
            stack.push(input1Int);
            stack.showStack();
        } catch (Exception e) {
            System.out.println("The input was not a number.");
        }

        System.out.println("User input:");
        String input2 = userInput.nextLine();
        System.out.println("Stack with user input raw:");
        stack.push(input2);
        stack.showStack();

        System.out.println("POP:");
        stack.pop();
        stack.showStack();

        System.out.println("POP again:");
        stack.pop();
        stack.showStack();

        System.out.println("POP an empty:");
        Object returnStack = stack.pop();
        System.out.println(returnStack);

        System.out.println("\nDone.");
    }
}
