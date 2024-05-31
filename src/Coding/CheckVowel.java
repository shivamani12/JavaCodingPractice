package Coding;

// check vowel 
public class CheckVowel {

	public static void main(String[] args) {
		
		
		String str="shyvym";
		
		for(int i=0; i<=str.length()-1; i++) {
			str=str.toLowerCase();
			if (str.contains("a")|| str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")){
				System.out.println("given String contain vowel");
				break;
			}else {
				System.out.println("does not contain vowel");
				break;
			}
		}
		
	}
	
}
