/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandlists;

/**
 *
 * @author Brian
 */
public class ArraysAndLists {

    public static void main(String[] args) {
        GroceryList myList = new GroceryList();
        
        myList.addGroceryItem("Bread");
        myList.addGroceryItem("Milk");
        myList.addGroceryItem("Eggs");
        myList.addGroceryItem("Soda");
        
        myList.printGroceryList();
        
        myList.removeGroceryItem(2);
        myList.printGroceryList();
        myList.removeGroceryItem("Bread");
        myList.printGroceryList();
        myList.removeGroceryItem("Candy");
    }
    
}
