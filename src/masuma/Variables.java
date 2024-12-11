package masuma;

public class Variables {
    static int  num = 100;
    String text = "Hello";
    public static void main(String[] args){
        int localvariable =200;
        System.out.println(localvariable);
        System.out.println(num);
        //object decleor syntex:classname objectname=New Classname(parameter)
        Variables obj = new Variables();

        System.out.println(obj.text);
        
    }
}
