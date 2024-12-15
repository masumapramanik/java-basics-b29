package masuma;

public class Method {

    public static void sum(int a,int b){
        System.out.println("sum: "+(a+b));
    }
    public static void sum(int a,int b,int c){
        System.out.println("sum: "+(a+b+c));
    }

    public void mul(int a,int b,int c,int d){
        System.out.println("sum: "+(a*b*c*d));
    }


    public static void main(String[] args){
      sum(20, 30);
      sum(30,50);
      sum(30,30,40);
      Method obj = new Method();
      obj.mul(3,4,5,2);
    }


    //static,non static
    /*static int x= 10;
    int y= 20;
    public void case1(){
        System.out.println(x+y);
    }
    public static void case2(){
        Method obj = new Method();

        System.out.println(x*obj.y);
    }
     */
}
