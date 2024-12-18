package Oppcl3;

import java.util.Scanner;

public class ExceptionError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pleae enter 1st num:");
        int num1 = in.nextInt();
        System.out.println("Pleae enter 2nd num:");
        int num2 = in.nextInt();
        try {

            int res = num1 / num2;
            System.out.println(res);
        }
            catch(Exception e){
                System.out.println("You can not divide by Zero:");
            }
        }



    }

