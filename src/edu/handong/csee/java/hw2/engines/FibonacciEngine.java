package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * The FibonacciEngine class calculates the nth Fibonacci number of the given input value.
 */
public class FibonacciEngine implements Computable {
    /**
     * The name of the FibonacciEngine.
     */
    private static final String engineName = "FIBONACCI";

    /**
     * The input value n.
     */
    private int n;

    /**
     * The calculated nth Fibonacci number.
     */
    private double result;
    
    /**
     * Returns the engine name.
     * 
     * @return The engine name as a string.
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * Returns the input value n.
     * 
     * @return The input value n as an int.
     */
    public int getN() {
        return n;
    }

    /**
     * Sets the input value n.
     * 
     * @param n The input value n as an int.
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Sets the result of the Fibonacci calculation.
     * 
     * @param result The calculated nth Fibonacci number as a double.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Sets the input value and computes the nth Fibonacci number.
     * 
     * @param args The input arguments as a string array.
     */
    public void setInput(String[] args) {
        if (args.length > 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit("FIBONACCI", 1);
        } 
        else if (Integer.parseInt(args[1]) < 0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit("FIBONACCI");
        }
        else{
            n = Integer.parseInt(args[1]);
            compute();
        }
    }

    /**
     * Computes the nth Fibonacci number.
     */
    public void compute() {
        if (n <= 1) {
            result = n;
        } else {
            double fib1 = 0, fib2 = 1;
            for (int i = 2; i <= n; i++) {
                double nextFib = fib1 + fib2;
                fib1 = fib2;
                fib2 = nextFib;
            }
            result = fib2;
        }
    }

    /**
     * Returns the result of the Fibonacci calculation.
     * 
     * @return The calculated nth Fibonacci number as a double.
     */
    public double getResult() {
        return result;
    }
}
