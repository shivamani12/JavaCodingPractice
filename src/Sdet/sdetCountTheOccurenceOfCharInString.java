package Sdet;

public class sdetCountTheOccurenceOfCharInString {
public static void main(String[] args) {
	
	
	String str="Java Programming Java Oops";
	
	int total_count=str.length();
	
	int total_count_after_Remove=str.replace("a","").length();
	
	int count=total_count-total_count_after_Remove;
	
	System.out.println(count);
	
	
	
}
}
