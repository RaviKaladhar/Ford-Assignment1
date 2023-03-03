package controlStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        char operator;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the operator");
        operator=scanner.next().charAt(0);
        System.out.println("enter the first number:");
        Integer n1=scanner.nextInt();
        System.out.println("enter the second number:");
        Integer n2=scanner.nextInt();
        switch (operator)
        {
            case '+':
                System.out.println("sum is:"+(n1+n2));
                break;
            case '-':
                System.out.println("difference is:"+(Math.max(n1,n2)-Math.min(n1,n2)));
            break;
            case '*':
                System.out.println("multiplication is:"+(n1*n2));
                break;
            case '/':
                System.out.println("division is :"+(Math.max(n1,n2)/Math.min(n1,n2)));
                break;
            case '%':
                System.out.println("modulus is:"+(Math.max(n1,n2)%Math.min(n1,n2)));
                break;
            default:
                System.out.println("entered operator is invalid");
        }
}}
