package Problem_Solving_1;

import java.util.Scanner;

public class Max3Num {
    public static void Max3Num(int a,int b,int c){
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
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three Number1: ");
        int a = in.nextInt();

        System.out.println("Enter a number2: ");
        int b = in.nextInt();
        System.out.println("Enter a number3: ");
        int c = in.nextInt();

        Max3Num(a,b,c);


    }
}
