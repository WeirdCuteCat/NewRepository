package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * The CubeVolEngine class calculates the volume of a cube with the given side length.
 */
public class CubeVolEngine implements Computable {
    /**
     * The name of the CubeVolEngine.
     */
    private static final String engineName = "CUBEVOL";

    /**
     * The length of a side of the cube.
     */
    private double sideLength;

    /**
     * The calculated volume of the cube.
     */
    private double volume;

    
    /**
     * Returns the engine name.
     * 
     * @return The engine name as a string.
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * Returns the side length of the cube.
     * 
     * @return The side length as a double.
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Sets the side length of the cube.
     * 
     * @param sideLength The side length as a double.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Returns the volume of the cube.
     * 
     * @return The volume as a double.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the cube.
     * 
     * @param volume The volume as a double.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }   

    /**
     * Sets the input value and computes the volume of the cube.
     * 
     * @param args The input arguments as a string array.
     */
    public void setInput(String[] args) {
        if (args.length > 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit("CUBEVOL", 1);
        } 
        else if (Integer.parseInt(args[1]) < 0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit("CUBEVOL");
        }
        else{
            sideLength = Double.parseDouble(args[1]);
            compute();
        }
    }

    /**
     * Computes the volume of the cube.
     */
    public void compute() {
        volume = Math.pow(sideLength, 3);
    }

    /**
     * Returns the result of the volume calculation.
     * 
     * @return The calculated volume as a double.
     */
    public double getResult() {
        return volume;
    }
}
