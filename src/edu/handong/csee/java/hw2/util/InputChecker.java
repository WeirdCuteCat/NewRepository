package edu.handong.csee.java.hw2.util;

/**
 * The InputChecker class provides utility methods to validate user inputs and display appropriate error messages.
 */
public class InputChecker {
    
    /**
     * Prints an error message for an incorrect number of required inputs and terminates the program.
     * @param engineName The name of the calculation engine.
     * @param numOfRequiredInputs The number of required inputs for the specified engine.
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * Prints an error message for an incorrect number of minimum required inputs and terminates the program.
     * @param engineName The name of the calculation engine.
     * @param TheNumberOfMinimumRequired The minimum number of required inputs for the specified engine.
     */
    public static void printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int TheNumberOfMinimumRequired) {
        System.out.println("You need at least " + TheNumberOfMinimumRequired + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    /**
     * Prints an error message for negative input values and terminates the program.
     * @param engineName The name of the calculation engine.
     */
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName){
        System.out.println("The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
