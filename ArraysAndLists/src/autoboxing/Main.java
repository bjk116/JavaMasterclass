/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing;
import java.util.ArrayList;

class IntClass{
    private int myValue;
    
    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Brian");
        
        //Can't do this because you can't craete array list of primitives
        //ArrayList<int> intArrayList = new ArrayList<int>();
        //What we can do
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(54));
        
        //Even better way is to use Autoboxing
        //Java supports primitive types by providing a wrapper
        Integer integer = new Integer(64);
        Double dblValue = new Double(12.4);
        
        ArrayList<Integer> intArrayListWorking = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            //gets i, converts it to Integer type class
            // this is autoboxing, taking primitive type and going to class
            intArrayListWorking.add(Integer.valueOf(i));
        }
        
        for(int i = 0; i< 10; i++){
            //unboxing, going from class back to primitive type
            System.out.println(i + " ===> " + intArrayListWorking.get(i).intValue());
        }
        
        //Easier way to autobox/unbox
        Integer myIntValue = 56;
        //Why does this work?  Because Java turns it into
        //Integer myIntValue = Integer.valueOf(56);
        
        //Why does this work?
        int myInt = myIntValue;
        //Java is automatilcally doing this -
        //int myInt = myIntValue.intValue();
        ArrayList<Double> myDoubles = new ArrayList<Double>();
        for(double dbl=0.0; dbl<10.0; dbl += .5){
            myDoubles.add(Double.valueOf(dbl));
        }
        
        for(int i = 0; i < myDoubles.size(); i++) {
            double value = myDoubles.get(i).doubleValue();
            System.out.println(i + " =====> " + value);
        }
        
    }
}
