package WrapperClass;

import java.util.Scanner;

public class StringToInt {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("sum is:"+(Integer.parseInt(s1)+Integer.parseInt(s2)));
    }
}
