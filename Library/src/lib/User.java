package lib;

abstract public class User {
	
protected	int id;
protected	String name;
protected int age;
protected String address;
protected	long contact;
protected	boolean gender;
protected	String passowrd;
protected int booksissued;


protected int allbookid_c;
	protected int fine;
	
	
	public int getid() {return id;}
	public String getpw() {return passowrd;}
	public String getname() {return name;}
	
	public void payfine(int x) {
		fine=fine-x;
		if(fine<0)
			fine=0;
		System.out.println("Due now is: "+fine+" Fine");
	}

 abstract public void updateinfo() ;
	
abstract public int signup(int user_c);
	
	
	
	public void search_book(int id,int book_c,Magazine mag[],Fyp fyp[],books book[]) {
		int flag=0;
		for(int i=0;i<book_c;i++)
		{
			if(mag[i].bookid==id) {
				System.out.println(" Magazine Found");
				System.out.println("Name: "+mag[i].getname());
				System.out.println("Author: "+mag[i].getauthor());
				System.out.println("Price: "+mag[i].getprice());
				System.out.println("Published: "+mag[i].getpublished());
				System.out.println("Type: "+mag[i].gettype());
				System.out.println("Magazine Status: "+mag[i].getbook_status());
				flag=1;
				break;	
			}
			else if(book[i].bookid==id) {
				System.out.println("Book Found");
				System.out.println("Name: "+book[i].getname());
				System.out.println("Author: "+book[i].getauthor());
				System.out.println("Price: "+book[i].getprice());
				System.out.println("Published: "+book[i].getpublished());
				System.out.println("Type: "+book[i].gettype());
				System.out.println("Book Status: "+mag[i].getbook_status());
				
				flag=1;
				break;
			}
			
			else if(fyp[i].bookid==id)
			{
				System.out.println("Fyp Found");
				
				System.out.println("Name: "+fyp[i].getname());
				System.out.println("Author: "+fyp[i].getauthor());
				System.out.println("Price: "+fyp[i].getprice());
				System.out.println("Published: "+fyp[i].getpublished());
				System.out.println("Type: "+fyp[i].gettype());
				System.out.println("Fyp Status: "+mag[i].getbook_status());
				flag=1;
				break;
			}
			
		}
		
	if(flag==0)
		System.out.println("Not Found");
	}
	
	
 abstract public  void borrow(int a, Magazine b[],Fyp f[],books c[]);
	
 
 public void displayBorrowed(Magazine mag[],Fyp  fyp[],books book[]) {
	 
	 for(int i=0;i<=allbookid_c;i++) {
			
		 
	 }
 }
 
 public void returnBook(Magazine mag[],Fyp  fyp[],books book[],int book_c) {
	 
 }
}
