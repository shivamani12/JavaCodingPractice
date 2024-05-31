package Coding;

public class ReverseAnInteger {
public static void main(String[] args) {
	
	int number = 1234;
	
	int reverseNumber=reverse(number);
	System.out.println(reverseNumber);
	
}

 public static int reverse(int number) {
	 
	 int reverseNumber=0;
	 
	 while(number !=0) {
		 reverseNumber = reverseNumber*10+number%10;
		 number=number/10;
		 }
	return  reverseNumber;
	 
 }
 
}
