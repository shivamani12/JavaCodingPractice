package Coding;


 // factorial number of 5

public class FactorialNumber {
public static void main(String[] args) {
	
	
	
	// 5 = 5*4*3*2*1=120
	
	int n=5;
	int factorial = 1;
	
	for(int i=1; i<=5; i++){
		int result = factorial * i ;
		factorial = result;	
}
	
	System.out.println(factorial);
	
	
}
}
