package Coding;

import java.util.Random;

public class GenerateRandom {
public static void main(String[] args) {
	
	Random rand=new Random();
	
	int rand_int=rand.nextInt(1000);
	System.out.println(rand_int);
	
	double rand_double=rand.nextDouble();
	System.out.println(rand_double);
	
	
	
}
}
