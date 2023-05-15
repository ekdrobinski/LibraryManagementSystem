abstract class LibraryItem {
    private String title; //1.(done) attribute of title(String)
    private int releaseYear; //1.(done) attribute of releaseYear(int)

    public LibraryItem(String title, int releaseYear) { //constructor. Abstract class can hold it but not make objects
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public abstract String getItemType(); //2. lays out the function to be used/overridden by classes that extend this abstract class

    public abstract String getItemDetails(); // 2. lays out the function to be used/overridden by classes that extend this abstract class

    public String getTitle() { //1. lays out the function to be used in extending classes which need to use the same parameters when defining objects
        return title;
    }

    public int getReleaseYear() { //1. lays out the function to be used in extending classes which need to use the same parameters when defining objects
        return releaseYear;
    }
}