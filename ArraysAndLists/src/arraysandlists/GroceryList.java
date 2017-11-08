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
    
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    
    
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    
    public void removeGroceryItem(String removeItem) {
        int position = findItem(removeItem);
        if(position >= 0) {
            removeGroceryItem(position);
        }   
    }
    
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        
        return false;
    }
    
    private int findItem(String searchName) {
        return groceryList.indexOf(searchName);
    }
    
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
