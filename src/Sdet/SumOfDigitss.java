package Sdet;

public class SumOfDigitss {
public static void main(String[] args) {
	
	int number=1234;
	int sum=0;

	while(number!=0){
	int mod=number%10;
	sum=sum+mod;
	number=number/10;
	}
	System.out.println(sum);
	
	}
}
