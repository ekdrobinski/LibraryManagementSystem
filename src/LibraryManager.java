/*Implement the interface LibraryOperations<T> in a class LibraryManager<T extends LibraryItem> using generics
 with the following methods:
    void addItem(T item)
    void removeItem(T item)
    void displayItems() */

//to use the already made ArrayList and List functions
import java.util.ArrayList;
import java.util.List;
interface LibraryOperations<T extends LibraryItem> {
   void addItem(T item);
           void removeItem(T item);
           void displayItems();
           }//end interface

class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> { //implements interface in the class to complete 5
    private List<T> items;
    public LibraryManager() {
        items = new ArrayList<>();
    }
    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("The item added: " + item.getItemType() + ": " + item.getItemDetails());
    }
    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("The item removed: " + item.getItemType() + ": " + item.getItemDetails());
        } else {
            System.out.println("This item not found: " + item.getItemType() + ": " + item.getItemDetails());
        }
    }
    @Override
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The Library doesn't have anything in it.");
        } else {
            System.out.println("Items in the Library: ");
            for (T item : items) {
                System.out.println(item.getItemType() + ": " + item.getItemDetails());
            }
        }
    }
}

