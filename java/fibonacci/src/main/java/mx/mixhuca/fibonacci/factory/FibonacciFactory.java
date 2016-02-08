package mx.mixhuca.fibonacci.factory;

import mx.mixhuca.fibonacci.enums.FibonacciStrategy;
import mx.mixhuca.fibonacci.services.FibonacciServices;
import mx.mixhuca.fibonacci.services.impl.IterationImpl;
import mx.mixhuca.fibonacci.services.impl.RecursionImpl;

public class FibonacciFactory{

	public FibonacciServices getStrategy(FibonacciStrategy strategy){

		FibonacciServices fibonacciServices = null;
		switch(strategy){
			case RECURSION:
				fibonacciServices = new RecursionImpl();
				break;
			case ITERATION:
				fibonacciServices = new IterationImpl();
				break;
		}
		
		return fibonacciServices;
	}
}