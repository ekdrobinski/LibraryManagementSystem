public class LibraryAppMain { //Write a main class LibraryApp to demonstrate the functionality of the library management system
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        //instantiate objects of Book class
        Book book1 = new Book("Chocolate Island", 1997, "Catherine Higss", "978-07-46014585");
        Book book2 = new Book("Not About me", 2020, "No Soy Yo", "123-45-3413414");
        Book book3 = new Book("All About me", 2019, "Soy Yo", "123-45-3223414");


        //instantiate objects of DVD class
        DVD dvd1 = new DVD("Harry Potter", 2011, "Not Me-Chris Columbus", 152);
        DVD dvd2 = new DVD("Another Movie Name", 2022, "Not Me", 114);
        DVD dvd3 = new DVD("A Movie Name", 2021, "Me", 120);


        //add and remove items from the library - uses ArrayList and .addItem method
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(book3);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);
        libraryManager.addItem(dvd3);

        //Display the list of items in the library
        book2.getItemDetails();

        System.out.println();//adds a space between lines
        libraryManager.displayItems();
        System.out.println();
        libraryManager.removeItem(book3);
        libraryManager.removeItem(dvd3);
        System.out.println();
        libraryManager.displayItems();
    }
}






