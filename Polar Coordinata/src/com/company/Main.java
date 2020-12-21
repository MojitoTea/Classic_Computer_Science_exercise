package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedit x");
        double x = in.nextDouble();
        System.out.println("Vvedit y");
        double y = in.nextDouble();
        double theta = Math.atan2(x, y);
        System.out.println(theta);
    }
}
