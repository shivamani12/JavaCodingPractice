package com.KS.String;

import java.time.Duration;
import java.time.LocalDateTime;

public class DiffBetweenTwoDates62 {
public static void main(String[] args) {
	
	
	LocalDateTime d1=LocalDateTime.of(2020,12,1,11,20,20);
	LocalDateTime d2=LocalDateTime.of(2019,12,1,10,20,20);

	Duration duration=Duration.between(d1, d2);
	System.out.println(duration);
	
	
	
	
}
}
