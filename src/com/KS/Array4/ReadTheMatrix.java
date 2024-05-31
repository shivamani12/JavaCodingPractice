package com.KS.Array4;

import java.util.Scanner;

public class ReadTheMatrix {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int r=2;
	int c=4;
	 
	int matrix[][]=new int[r][c];
	
	for(int i=0; i<r; i++) {
		for(int j=0; j<c; j++) {
			matrix[i][j]=sc.nextInt();
			System.out.println(matrix[i][j]);
		}
	}
	
	
	
}
}
