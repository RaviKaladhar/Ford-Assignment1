package Strings;
import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String []args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the length of array:");
    int n=scanner.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the integer values to calculate their sum and average");
    for(int i=0;i< arr.length;i++)
    {
        arr[i]=scanner.nextInt();
    }
    int sum=0,average;
    for(int i:arr)
    {
        sum+=i;
    }
    System.out.println("sum: "+sum);
    System.out.println("average: "+sum/ arr.length);
}}
