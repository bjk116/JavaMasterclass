//Author: Brian Karabinchak
//github.com/bjk116

package arraysandlists;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position-1, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    
    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    
    public String findItem(String itemName) {
        int position = groceryList.indexOf(itemName);
        return (position >= 0) ? groceryList.get(position) : "Item not Found";
    }
}
