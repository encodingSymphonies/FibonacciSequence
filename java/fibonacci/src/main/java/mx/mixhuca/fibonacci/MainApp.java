package mx.mixhuca.fibonacci;

import mx.mixhuca.fibonacci.enums.FibonacciStrategy;
import mx.mixhuca.fibonacci.factory.FibonacciFactory;
import mx.mixhuca.fibonacci.services.FibonacciServices;

public class MainApp {

	private FibonacciFactory factory = new FibonacciFactory();
	
	private FibonacciServices fibonacciServices;

    public static void main(String[] args) throws Exception {

        MainApp ma = new MainApp();
        ma.run();
    }
    
    /**
     * 
     */
    /**
     * 
     */
    private void run(){
    	fibonacciServices = factory.getStrategy(FibonacciStrategy.ITERATION);
    	fibonacciServices.printFibonacciSequence(30);
    	
    	System.out.println("===========================================================");
    	
    	fibonacciServices = factory.getStrategy(FibonacciStrategy.RECURSION);
    	fibonacciServices.printFibonacciSequence(30);
    }


}
