package Sdet;

public class sdetRemoveJunkString {
public static void main(String[] args) {
	
	String str="æēḍāæ latin String 0123456789";
	
	str=str.replaceAll("[^a-zA-Z0-9]","");
	
	System.out.println(str);
	
	String str2= "Shivam    Tomar";
	// remove the space
	
	str2=str2.replaceAll("\\s","");
	
	System.out.println(str2);
	
}
}
