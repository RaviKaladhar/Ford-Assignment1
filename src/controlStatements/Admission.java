package controlStatements;

import java.util.Scanner;

public class Admission {
    public static void main(String args[])
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Input the marks obtained in Physics: ");
    int physics=scanner.nextInt();
    System.out.println("Input the marks obtained in Chemistry: ");
    int chemistry=scanner.nextInt();
    System.out.println("Input the marks obtained in Mathematics: ");
    int maths=scanner.nextInt();
    int total=maths+physics+chemistry;
    int mathPhysics=maths+physics;
    if(maths>=65&&chemistry>=50&&physics>=55&&(total>=180||mathPhysics>=140))
        System.out.println("The candidate is eligible for admission");
}}
