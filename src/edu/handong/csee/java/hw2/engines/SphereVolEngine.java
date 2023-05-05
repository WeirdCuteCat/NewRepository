package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * The SphereVolEngine class calculates the volume of a sphere.
 */
public class SphereVolEngine implements Computable {
    /**
     * The name of the SphereVolEngine.
     */
    private static final String engineName = "SPHEREVOL";

    /**
     * The radius of the sphere.
     */
    private double radius;

    /**
     * The calculated volume of the sphere.
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
     * Returns the radius of the sphere.
     * 
     * @return The radius as a double.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius of the sphere.
     * 
     * @param radius The radius as a double.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Sets the result of the sphere volume calculation.
     * 
     * @param result The calculated volume as a double.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Sets the input values for the radius and computes the volume of the sphere.
     * 
     * @param args The input arguments as a string array.
     */
    public void setInput(String[] args) {
        if (args.length > 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit("SPHEREVOL", 1);
        } 
        else if (Integer.parseInt(args[1]) < 0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit("SPHEREVOL");
        }
        else{
            radius = Double.parseDouble(args[1]);
            compute();
        }
    }
    
    /**
     * Computes the volume of the sphere using the radius.
     */
    public void compute() {
        result = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Returns the result of the sphere volume calculation.
     * 
     * @return The calculated volume as a double.
     */
    public double getResult() {
        return result;
    }
}