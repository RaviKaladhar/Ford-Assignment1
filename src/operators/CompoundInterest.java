package operators;

public class CompoundInterest {
    public static void main(String args[])
    {
        Double principle=20000.0;
        Integer time=2;
        Double rateOfInterest=0.05;
        Integer n=1;
        Double amount;
        amount=principle*Math.pow((1+rateOfInterest/n),(n*time));
        System.out.println("compound interest is:"+(amount-principle));
    }
}
