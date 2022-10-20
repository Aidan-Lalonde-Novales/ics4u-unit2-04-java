/*
* This program runs alongside Stack.ts
* in order to add items to and view a popped stack.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-20
*/

import java.util.Scanner;

/**
 * This is a program that runs alongside MrCoxallStack.
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final MrCoxallStack myStack = new MrCoxallStack();
        final Scanner sc = new Scanner(System.in);
        final float pushCheck = -1;
        final float peekCheck = -2;
        final float popCheck = -3;

        while (true) {
            // Input & Process
            float tempNum = 0;
            float tempInput = 0;
            System.out.print("Enter -1 to push, -2 to peek, -3 to pop: ");
            tempInput = sc.nextFloat();

            if (tempInput == popCheck) {
                break;
            } else if (tempInput == peekCheck) {
                try {
                    System.out.println(myStack.peekStack());
                } catch (java.util.InputMismatchException ex) {
                    System.out.println("Please add a number first.");
                }
            } else if (tempInput == pushCheck) {
                System.out.print("Enter a number to add to the stack: ");
                try {
                    tempNum = sc.nextFloat();
                    myStack.pushStack(tempNum);
                } catch (java.util.InputMismatchException ex) {
                    System.out.println("Not a Number!");
                }
            } else {
                System.out.println("Invalid Input. Please Try Again.");
            }
        }

        // Output
        System.out.println("\nOriginal Stack:");
        try {
            System.out.println(myStack.getStack());
            System.out.println("\nPopped Item:");
            System.out.println(myStack.popStack());
        } catch (java.util.InputMismatchException ex) {
            System.out.println("None.");
        }
        System.out.println("\nDone.");
    }
}
