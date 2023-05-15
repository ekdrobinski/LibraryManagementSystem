class DVD extends LibraryItem { //4. (done) Create a class DVD that extends LibraryItem
    private String director;  //director(String) attribute
    private int duration;  //director(String) attribute
    public DVD(String title, int releaseYear, String director, int duration) { //constructor to make DVD objects
        super(title, releaseYear); //to hold the title and releaseYea
        this.director = director; //to hold/take in the director
        this.duration = duration; //to hold/take in the director
    }

    public String getDirector() { //to get the director //to get the duration-this doesn't apply to all libraryItems so it wouldn't be in the abstract class
        return director;
    }
    public int getDuration() { //to get the duration-this doesn't apply to all libraryItems so it wouldn't be in the abstract class
        return duration;
    }

    @Override
    public String getItemType() { //overrides method from the superclass of LibraryItem but uses the same words in polymorphism
        return "DVD";
    }
    @Override
    public String getItemDetails() { //overrides method from the superclass of LibraryItem but uses the same words in polymorphism
        return "Title: " + getTitle() + ", Director: " + director + ", Duration: " + duration + " minutes";
    }
}
