package Oppcl3;

import java.util.ArrayList;

public class ArrayListExm {
    public static void main(String[] args){
        //array decl
        int[] numbers ={1,2,3,4,5};
        //Arraylist<DataTypes> name = new arraylist<dt>()
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        System.out.println(names.size());
        names.add("jitu");
        names.add("Masu");
        names.add("Mitu");
        names.add("sasu");
        System.out.println(names.size());
        System.out.println(names);
        names.remove(names.get(0));
        //names.remove(2);
        System.out.println(names);
        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }
        names.clear();
        System.out.println(names.size());

    }
}
