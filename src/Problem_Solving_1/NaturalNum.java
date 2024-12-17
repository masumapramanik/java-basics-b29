package Problem_Solving_1;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = 10;

        int sum = 0;

        for (int i=0;i<=number;i++) {
            sum = sum + i;
        }

        System.out.println("Summation: "+sum);


    }
}
