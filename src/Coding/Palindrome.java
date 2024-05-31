package Coding;

public class Palindrome {
public static void main(String[] args) {
	
	
	String str="madam";
	
	int left=0;
	int right=str.length()-1;
	
	
	boolean flag=true;
	
	while(left<right) {
		if(str.charAt(right)!= str.charAt(left)) {
			flag=false;
			break;
		}
		left++;
		right--;
		
	}
	
	if(flag) {
		System.out.println("it is palindrom");
	}else {
		System.out.println("its not ");
	}
	             		
	
}
}



