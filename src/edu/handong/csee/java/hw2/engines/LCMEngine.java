package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * The LCMEngine class finds the least common multiple (LCM) of the given input values.
 */
public class LCMEngine implements Computable {
    /**
     * The name of the LCMEngine.
     */
    private static final String engineName = "LCM";

    /**
     * The first input value.
     */
    private int a;

    /**
     * The second input value.
     */
    private int b;

    /**
     * The calculated LCM value.
     */
    private int result;
    
    
    /**
     * Returns the engine name.
     * 
     * @return The engine name as a string.
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * Returns the first input value.
     * 
     * @return The first input value as an int.
     */
    public int getA() {
        return a;
    }

    /**
     * Sets the first input value.
     * 
     * @param a The first input value as an int.
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Returns the second input value.
     * 
     * @return The second input value as an int.
     */
    public int getB() {
        return b;
    }

    /**
     * Sets the second input value.
     * 
     * @param b The second input value as an int.
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Sets the result of the LCM calculation.
     * 
     * @param result The calculated LCM value as an int.
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * Sets the input values and computes the LCM.
     * 
     * @param args The input arguments as a string array.
     */
    public void setInput(String[] args) {
        if (args.length < 3) {
            InputChecker.printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit("LCM", 2);
        } else {
            a = Integer.parseInt(args[1]);
            if (a < 0) {
                InputChecker.printErrorMesssageForNegativeInputsAndExit("LCM");
            }
            result = a;
            
            for (int i = 2; i < args.length; i++) {
                b = Integer.parseInt(args[i]);
                if (b < 0) {
                    InputChecker.printErrorMesssageForNegativeInputsAndExit("LCM");
                }
                compute();
                a = result;
            }
        }
    }

    /**
     * Computes the LCM of the input values.
     */
    public void compute() {
        int tempA = a;
        int tempB = b;
        int product = tempA * tempB;
        int gcd;

        while (tempB != 0) {
            gcd = tempB;
            tempB = tempA % tempB;
            tempA = gcd;
        }

        result = product / tempA;
    }

    /**
     * Returns the result of the LCM calculation.
     * 
     * @return The calculated LCM value as a double.
     */
    public double getResult() {
        return result;
    }
}
