import java.util.ArrayList;

public class ArrayListOfBooks {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        try {
            books.add(new Book("Java Basics", "James Gosling", "Education", 450));
            books.add(new Book("The Alchemist", "Paulo Coelho", "Fiction", 300));
            books.add(new Book("Data Structures", "Mark Allen", "Education", 500));
            books.add(new Book("Harry Potter", "J.K. Rowling", "Fiction", 650));

            // This will throw exception
            books.add(new Book("Invalid Book", "Unknown", "Fiction", -100));

        } catch (InvalidPriceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n📚 All Books:");
        double total = 0;

        for (Book b : books) {
            b.displayBook();
            total += b.getPrice();
        }

        if (!books.isEmpty()) {
            double avg = total / books.size();
            System.out.println("\nAverage Price: " + avg);
        }

        System.out.println("\n📖 Fiction Books:");
        books.forEach(book -> {
            if (book.getGenre().equalsIgnoreCase("Fiction")) {
                book.displayBook();
            }
        });
    }
}
