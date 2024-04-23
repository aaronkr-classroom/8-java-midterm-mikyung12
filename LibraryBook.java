
public class LibraryBook implements Book {
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;
	
	public LibraryBook(Book book) {
		// 생성자		
}
	
	public LibraryBook(String isbn, String title, String author, int year) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.available = true;
		this.year = year;
	}
	
	public String getIsbn() { return isbn; }
	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	public int getYear() { return year; }
	public boolean isAvailable() { return available; }
	public void setAvailable(boolean available) { this.available = available; }
	

}
