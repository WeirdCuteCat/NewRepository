package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * The MinEngine class finds the minimum value among the given input values.
 */
public class MinEngine implements Computable {
    /**
     * The name of the MinEngine.
     */
    private static final String engineName = "MIN";

    /**
     * The input values.
     */
    private double[] inputs;

    /**
     * The calculated minimum value.
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
     * Returns the input values.
     * 
     * @return The input values as a double array.
     */
    public double[] getInputs() {
        return inputs;
    }

    /**
     * Sets the input values.
     * 
     * @param inputs The input values as a double array.
     */
    public void setInputs(double[] inputs) {
        this.inputs = inputs;
    }

    /**
     * Sets the result of the minimum value calculation.
     * 
     * @param result The calculated minimum value as a double.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Sets the input values and computes the minimum value.
     * 
     * @param args The input arguments as a string array.
     */
    public void setInput(String[] args) {
        if (args.length < 3) {
            InputChecker.printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit("MIN", 2);
        } 
        else {
            double[] doubleArray = new double[args.length-1];
            for (int i = 0; i < args.length-1; i++){
                doubleArray[i] = Double.parseDouble(args[i+1]);
            }
            inputs = doubleArray;
        }
    }

    /**
     * Computes the minimum value among the input values.
     */
    public void compute() {
        double min = inputs[0];
        for (double i : inputs){
            if (min > i){
                min = i;
            }
        }
        result = min;
    }

    /**
     * Returns the result of the minimum value calculation.
     * 
     * @return The calculated minimum value as a double.
     */
    public double getResult() {
        return result;
    }
}