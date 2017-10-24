/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandlists;
import java.util.Scanner;

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
        System.out.print("Item number to  modify: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        scanner.nextLine();
        myList.modifyGroceryItem(position-1, newItem);
    }
    
    public static void removeItem() {
        System.out.print("Item number to  modify: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        myList.removeGroceryItem(position-1);
    }
    
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(myList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " was not found.");
        }
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
                    quit = true;
                    break;
            }
        }
    }
}
