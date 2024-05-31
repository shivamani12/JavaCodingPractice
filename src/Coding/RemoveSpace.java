package Coding;


// remove space from string 


public class RemoveSpace {
public static void main(String[] args) {
	

	
	String str= "this\tis my home";
	
	String strWithoutSpace=str.replaceAll("\\s","");
	System.out.println(strWithoutSpace);
	
	
	
}
	
}
