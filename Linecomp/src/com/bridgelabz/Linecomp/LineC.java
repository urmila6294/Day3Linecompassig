package com.bridgelabz.Linecomp;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineC {
    public static void main (String[] args)
    {
        System.out.println("Welcome to LineComparison Computation Program");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first Xaxis coordinator number as x1:  ");
        int x1= sc.nextInt();
        System.out.print("Enter second  Xaxis coordinator number as x2:  ");
        int x2= sc.nextInt();
        System.out.print("Enter first Yaxis coordinator number as y1: ");
        int y1= sc.nextInt();
        System.out.print("Enter Second Yaxis coordinator number as y2: ");
        int y2= sc.nextInt();
        double length=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Total= " +length);
    }
}



