package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double x,y,z;
	System.out.println("Write x:");
	x = in.nextDouble();
	System.out.println("Write y:");
	y = in.nextDouble();
	System.out.println("Write z:");
	z = in.nextDouble();
	if((x<y)&&(y<z)||(x>y)&&(y>z)){
	    System.out.println(true);
    }
	else {
	    System.out.println(false);

    }
    }
}
