package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double T,v;
        System.out.println("Vvedite T farengiet");
        T=in.nextDouble();
        System.out.println("Vvedite v u milah/chas");
        v=in.nextDouble();
        if(T<50 && (v<120 || v>3)) {
            double w = 35.74 + 0.6215 * T + (0.4275*T - 35.75)*Math.pow(v, 0.16);
            System.out.println(w+"  "+"Ohlagdenie");
        }
        else
        {
            System.out.println("False Parametrs");
        }

    }
}
