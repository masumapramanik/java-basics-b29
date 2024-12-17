package Problem_Solving_1;

import java.util.Scanner;

public class Sum_Sub_Mul_Div {
    public static void Sum_Sub_Mul_Div(int number1, int number2){

        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;

        System.out.println("Summation: " +sum+ ", Substraction: " +sub+ ", Multiplication: " +mul+ ", Division: " +div);
    }
    public static void main(String[] args){
        System.out.println("Enter a number1: ");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        System.out.println("Enter a number2: ");
        int number2 = in.nextInt();
        Sum_Sub_Mul_Div(number1,number2);
    }
}
