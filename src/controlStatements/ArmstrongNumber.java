package controlStatements;

public class ArmstrongNumber {
    public static void main(String args[])
    {
        for (int i=1;i<=500;i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                int temp=n%10;
                sum+=Math.pow(temp,3);
                n=n/10;
            }
            if(sum==i)
            System.out.print(i+",");
        }
    }
}
