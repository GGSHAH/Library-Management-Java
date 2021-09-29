package lib;

abstract public class Book {
	protected	int bookid;
	protected String book_name;
	protected String author;
	protected int isbn;
	protected double price;
	protected String published;
	protected boolean book_status;
	protected int issuedby;
	protected String type;
	
	
	public int getid() {return bookid;}
	public String getname() {return book_name;}
	public String getauthor() {return author;}
	public int getisbn() {return isbn;}
	public double getprice() {return price;}
	public String getpublished() {return published;}
	public boolean getbook_status() {return book_status;}
	public int getIssuedBy() {return issuedby;}
	public String gettype() {return type;}
	
	
	

}
