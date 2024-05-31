package Sdet;

public class SdetFindMinMax {
public static void main(String[] args) {
	
	
	int numbers[]= {100,2,33,-4,5};
	
	int max=numbers[0];
	int min=numbers[0];
	for(int i=0; i<=numbers.length-1; i++) {
		
		if(numbers[i]>max) {
			max=numbers[i];
		}else if(numbers[i]<min){
			min=numbers[i];
		}
	
	}
	System.out.println(max);
	System.out.println(min);
	
}
}
