package Oppcl3;

public class MethodOverloading {
    public static void sum(int a,int b){
        System.out.println("sum: "+(a+b));
    }
    public static void sum(int a,int b,int c){
        System.out.println("sum: "+(a+b+c));
    }
    public static void main(String[] args){
        sum(2,3);
    }
}
