package mx.mixhuca.fibonacci.services.impl;

import mx.mixhuca.fibonacci.services.*;

public class RecursionImpl implements FibonacciServices {
	
	public void printFibonacciSequence(long number){
		
		long iniTime = System.currentTimeMillis();
		
		for(int i=0; i<number; i++){
			System.out.println(i + " : " + getFibNumber(i));
		}
		
		System.out.println(System.currentTimeMillis() - iniTime);
	}
	
	private long getFibNumber(final long number){
		
		if(number < 2){
			return number;
		} else {
			return getFibNumber(number - 1) + getFibNumber(number - 2);
		}
	}
}