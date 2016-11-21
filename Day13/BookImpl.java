public class BookImpl implements Book {
	
	String bookTitle;
	
    private String bookTitle = null;
    private String authorName = null;

    public BookImpl(String authorName, String bookTitle) {
        this.bookTitle = bookTitle;
		this.authorName = authorName;
    }

    public String getTitle() {
         return bookTitle;
    }

    public String getAuthorName() {
         return authorName;         
    }
}