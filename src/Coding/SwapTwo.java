package Coding;

// How do you swap two numbers without using third variable

public class SwapTwo {
public static void main(String[] args) {
	
	
	int a =10;
	int b=20;
	
	a=a+b;
//	a=10+20  ,,, a=30
	
	b=a-b;
	// b=30-20,,,b=10
	
	a=a-b;
	
	// a=30-10,,, a=20;
	
	System.out.println("SWAP result  a,b=>");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
}
}
