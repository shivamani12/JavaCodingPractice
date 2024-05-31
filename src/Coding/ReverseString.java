package Coding;

// how do you reverse a String 

public class ReverseString {
public static void main(String[] args) {
	
	String str="Shivam";
	
	char[] charArr=str.toCharArray();
	
	int left=0;
	int right=str.length()-1;
	
	while(left<right) {
		char temp=charArr[left];
		charArr[left]=charArr[right];
		charArr[right]=temp;
		
		left++;
		right--;
		}
	String ReversedString=new String (charArr);
	System.out.println(ReversedString);
		
	
}
}
