public class Book {
    private String title;
    private String author;
    private String genre;
    private double price;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor with validation
    public Book(String title, String author, String genre, double price)
            throws InvalidPriceException {

        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative for book: " + title);
        }

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public double getPrice() { return price; }

    // Display method
    public void displayBook() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Genre: " + genre +
                           ", Price: " + price);
    }
}
