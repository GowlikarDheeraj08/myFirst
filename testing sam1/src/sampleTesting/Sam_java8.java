package sampleTesting;

import java.util.Random;
import java.util.Scanner;

public class Sam_java8 {
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Random rann=new Random();
	System.out.println("your otp");
	int ranNo=rann.nextInt(9999-100)+1;
	System.out.println(ranNo);
	int inputOp=sc.nextInt();
	if(ranNo==inputOp) {
		System.out.println("valid and verified");
	}
	else {
		System.out.println("invalid");
	}
	
	
}
}
