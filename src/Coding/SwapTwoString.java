package Coding;

public class SwapTwoString {
public static void main(String[] args) {
	
	
	String str1="Hello";
	String str2="world";
	
	str1=str1+str2;
	//Helloworld
	
	str2=str1.substring(0,str1.length()-str2.length());
	System.out.println(str2);
	//Hello
	str1 = str1.substring(str2.length());
	System.out.println(str1);
	
	
	
}
}
