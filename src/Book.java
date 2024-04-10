/**
 * Represents a book in a library
 *
 * @author Ethan Dunlop
 * @version April 2024
 *
 */
public class Book {

    private String author;
    private String title;
    private String isbn;
    private boolean onLoan;

    /**
     * Constructor for Book class
     * @param anAuthor The author of the book
     * @param aTitle The title of the book
     * @param anIsbn The ISBN of the book
     */
    public Book(String anAuthor, String aTitle, String anIsbn) {

        this.author = anAuthor;
        this.title = aTitle;
        this.isbn = anIsbn;
        onLoan = false;
    }

    /**
     *
     * @return - Returns the author of the book
     */
    public String getAuthor() {

      return this.author;
    }

    public String getTitle(){

        return this.title;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public boolean isOnLoan(){

        return this.onLoan;
    }
    public void setOnLoan(boolean available) {

        this.onLoan = available;
    }

    public String toString(){

        String available;

        if (this.onLoan == true){

            available = " (on loan)";
        }
        else {

            available = " (available)";
        }

        return "Title:" + this.getTitle() + ", author: " + this.getAuthor() + "avaiable" + this.setOnLoan();
    }
}
