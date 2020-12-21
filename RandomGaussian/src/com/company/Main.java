package com.company;

public class Main {

    public static void main(String[] args) {

    double v = Math.random();
    double u = Math.random();
	double r = Math.sin(2*3.14*v)*Math.pow(-2*Math.log(u),1/2);
	System.out.println(r);
    }
}
