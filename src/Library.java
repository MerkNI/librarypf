import java.util.ArrayList;
public class Library {

    private ArrayList<Book> books;

    public Library(){

        this.books = new ArrayList<>();

    }

    /**
     * Adds a book to the library's collection of books
     * @param aBook the book to add to the library
     */
    public void addBook(Book aBook){

        this.books.add(aBook);

    }

    /**
     * Lists all the books in the library
     */
    public void listBooks(){

        for (Book b : this.books){

            System.out.println(b);
            
        }

    }

}
