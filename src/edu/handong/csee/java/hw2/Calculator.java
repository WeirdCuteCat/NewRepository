package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.engines.*;
/**
 * The Calculator class performs calculations using various calculation engines based on the given arguments.
 */
public class Calculator {

    /**
     * The main method creates and runs a Calculator object based on the arguments provided by the user.
     * @param args The arguments provided by the user.
     */
    public static void main(String[] args) {
        // Code content

        if (args.length == 0) {
            System.out.println("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL.");
            System.out.println("For example, java -cp [your classpath] edu.handong.csee.java.hw2.Calculator MAX 12 4 5 45 100");
            System.exit(0);
        }

        Calculator myCalculator = new Calculator();

        myCalculator.run(args);
    }
    /**
     * The run method selects the appropriate calculation engine based on the user's input, performs the calculation, and outputs the result.
     * @param args The arguments provided by the user.
     */
    public void run(String[] args) {

        String engineName = args[0].toUpperCase();

        Computable engine =null;

        switch(engineName) {
            case "LCM":
                engine = new LCMEngine();
                break;
            case "GCD":
                engine = new GCDEngine();
                break;
            case "SQRT":
                engine = new SQRTEngine();
                break;
            case "FACTORIAL":
                engine = new FactorialEngine();
                break;
            case "FIBONACCI":
                engine = new FibonacciEngine();
                break;
            case "MAX":
                engine = new MaxEngine();
                break;
            case "MIN":
                engine = new MinEngine();
                break;
            case "CUBEVOL":
                engine = new CubeVolEngine();
                break;
            case "SPHEREVOL":
                engine = new SphereVolEngine();
                break;
            default:
                System.out.println("Invalid command: " + engineName);
                System.exit(0);
        }

        engine.setInput(args);
        engine.compute();

        System.out.println("The result of " +  engineName + " is " + engine.getResult() + ".");
    }
}