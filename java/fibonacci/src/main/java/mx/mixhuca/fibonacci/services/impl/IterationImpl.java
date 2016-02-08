package mx.mixhuca.fibonacci.services.impl;

import mx.mixhuca.fibonacci.services.*;

public class IterationImpl implements FibonacciServices {
	
	public void printFibonacciSequence(long number){
		
		long iniTime = System.currentTimeMillis();
		
		long a = 0;
		long b = 1;
		long c = 0;

		for(int i=0; i<number; i++){

			if(i >= 2){
				c = a + b;
				a = b;
				b = c;
				System.out.println(i + " : " + c);
			} else if(i == 0){
				System.out.println(i + " : " + a);	
			} else if(i == 1){
				System.out.println(i + " : " + b);	
			} 



		}
		
		System.out.println(System.currentTimeMillis() - iniTime);
	}


}