package Coding;

// write a fibonacci sequence
public class Fibonacci {
public static void main(String[] args) {
	

//	{0,1,1}
	
	
	int n=10;
	int n1=0;
	int n2=1;
	System.out.print(n1+" "+n2);
	
	for(int i=0; i<=n; i++){
			
		int n3 = n1+n2;   
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;	
	}
	
	
}
}
