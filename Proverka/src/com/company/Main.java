package com.company;
import java.util.Scanner;
public class Main {

    public static <g> void main(String[] args) {
	double x,v,t;
	Scanner in = new Scanner(System.in);
	System.out.println("Write x:");
	x = in.nextDouble();
	System.out.println("Write speed:");
	v = in.nextDouble();
	System.out.println("Write time:");
	t = in.nextDouble();
	final double g = 9.80665;
	double S = x+v*t-((g*Math.pow(t,2))/2);
	System.out.println(S+"m");

    }
}
