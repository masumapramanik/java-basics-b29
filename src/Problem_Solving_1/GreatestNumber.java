package Problem_Solving_1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number");
        int b = in.nextInt();
        System.out.println("Enter 3rd Number");
        int c = in.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println(a+": Number a is greatest");
            }
        } else {
            if (c>b) {
                System.out.println(c+": Number c is greatest");
            } else {
                System.out.println(b+": Number b is greatest");
            }
        }
    }
}
