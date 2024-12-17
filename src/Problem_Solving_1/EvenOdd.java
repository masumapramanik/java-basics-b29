package Problem_Solving_1;

import java.util.Scanner;

public class EvenOdd {
    public static void even_odd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even ");
        } else {
            System.out.println("Odd ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        even_odd(number);
       /* if(number % 2 == 0) {
            System.out.println("Even ");
        }
        else{
                System.out.println("Odd ");
            }*/

    }
}
