package masuma;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number");
        int b = in.nextInt();
        System.out.println("Summation of a+b:" +(a+b));
        System.out.println("Subtraction of a-b:" +(a-b));
        System.out.println("Multiplication of a*b:" +(a*b));
        System.out.println("Division of a/b:" +(a/b));
        System.out.println("Modulo of a%b:" +(a%b));
    }
}
