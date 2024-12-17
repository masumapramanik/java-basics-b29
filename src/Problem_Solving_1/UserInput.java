package Problem_Solving_1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if(a<=0){
            System.out.println("Negative number");
        }


    }
}
