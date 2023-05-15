class Book extends LibraryItem { //3. Create a class Book that extends LibraryItem and has the following additional attributes:
    private String author; // 3. attribute of author(String)
    private String ISBN; // 3. attribute of ISBN(String)

    public Book(String title, int releaseYear, String author, String ISBN) {  //constructor to lay out the parameters of creating an object
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() { //specifically defines function to be used when compiled/run for objects of Book
        return author;
    }

    public String getISBN() { //specifically defines function to be used when compiled/run for objects of Book
        return ISBN;
    }

    @Override //overrides method from the superclass of LibraryItem but uses the same words in polymorphism
    public String getItemType() {
        return "Book";
    }
    @Override  //overrides method from the superclass of LibraryItem but uses the same words in polymorphism
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + author + ", ISBN: " + ISBN;
    }
}