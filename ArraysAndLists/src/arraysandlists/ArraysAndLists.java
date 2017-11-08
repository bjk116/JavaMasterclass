/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandlists;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class ArraysAndLists {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();
    
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print instructions");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - Quit the application");
    }
    
    public static void addItem(){
        System.out.print("Enter grocery item: ");
        myList.addGroceryItem(scanner.nextLine());
    }
    
    public static void modifyItem() {
        System.out.print("Item to  modify: ");
        String currentItem = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        scanner.nextLine();
        myList.modifyGroceryItem(currentItem, newItem);
    }
    
    public static void removeItem() {
        System.out.print("Item to  delete: ");
        String itemToDelete = scanner.nextLine();
        scanner.nextLine();
        myList.removeGroceryItem(itemToDelete);
    }
    
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(myList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " was not found.");
        }
    }
    
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(myList.getGroceryList());
        
        ArrayList<String> newArray2 = new ArrayList<String>(myList.getGroceryList());
    
        String[] myArray = new String[myList.getGroceryList().size()];
        myArray = myList.getGroceryList().toArray(myArray);
    }
    
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
}
