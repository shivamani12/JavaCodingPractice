package Rough;



public final class rough { 
	
	private String name;
	
	rough(){
		
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return this.name;
	}
	
public static void main(String[] args) {
	
	
			rough r=new rough();
			r.name="shivam";
			r.name.concat("world");
			System.out.println(r);
		
		
	}	
}