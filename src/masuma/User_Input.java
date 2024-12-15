package masuma;

import java.util.Scanner;

public class User_Input {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        //String name = input.next();
        String name = input.nextLine();
        System.out.println("your name is: "+name);
        System.out.println("Enter your Age: ");
        double age = input.nextDouble();
        System.out.println("your name is: "+age);


    }
}
