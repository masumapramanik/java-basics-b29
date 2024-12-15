package masuma;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

       /* System.out.println("Enter 1st Number:");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number");
        int b = in.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a==b){
            System.out.println(a+" is Equal to: " +b);

        }
         else{
            System.out.println(a+ "is less than" +b);
        }*/
        /*System.out.println("Please Enter your Name: ");
        String text = in.nextLine();
        if(text.equals("Masuma")){
            System.out.println("Done: Your text is Masuma ");

        }*/
        /*
        System.out.println("Please Enter your Name: ");
        String text = in.nextLine();
        if(text.equalsIgnoreCase("Masuma")){
            System.out.println("Done: Your text is Masuma ");

        }*/

        System.out.println("Please Enter your Name: ");
        String text = in.nextLine();
        switch (text){
            case "Animal":
                System.out.println("Animal");
            break;
            case "Book":
                System.out.println("Book");
            break;
            default:
                System.out.println("Unknown");
        }

    }
}
