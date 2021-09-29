package lib;
import java.util.*;
public class Librarian {

	protected String name;
	protected String password;
	protected int id;
	
	

		
		
	
		public Librarian() {
			name="Admin";
			id=1;
			password="admin";
		}
		
	

	
	Scanner in=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	
	
	
	
	public int getid() {return id;}
	public String getpw() {return password;}
	
	public void collect_book() {
		
	}
	
	
	public int add_book(String x,int book_c,Magazine mag[],Fyp fyp[],books book[]) {
		if(x=="Magazine")
		{
			
			
			mag[book_c].type=x;
		mag[book_c].bookid=book_c+1;
		mag[book_c].book_status=true;
		mag[book_c].issuedby=-1;
		
		System.out.println("Enter Magazine Name: ");
		mag[book_c].book_name=scan.nextLine();
		
		System.out.println("Enter Author: ");
		mag[book_c].author=scan.nextLine();
		
		System.out.println("Enter ISBN: ");
		mag[book_c].isbn=in.nextInt();
		
		System.out.println("Enter Price: ");
		mag[book_c].isbn=in.nextInt();
		
		System.out.println("Enter Published Date: ");
		mag[book_c].published=scan.nextLine();
		
		System.out.println("Enter Book Type: ");
		mag[book_c].type=scan.nextLine();
		
		System.out.println("Magazine Added Successfully ");
		
		
		}
		else if(x=="Fyp") {
			fyp[book_c].type=x;
			
			fyp[book_c].bookid=book_c+1;
			fyp[book_c].book_status=true;
			fyp[book_c].issuedby=-1;
			
			System.out.println("Enter FYP Name: ");
			fyp[book_c].book_name=scan.nextLine();
			
			System.out.println("Enter Author: ");
			fyp[book_c].author=scan.nextLine();
			
			System.out.println("Enter ISBN: ");
			fyp[book_c].isbn=in.nextInt();
			
			System.out.println("Enter Price: ");
			fyp[book_c].isbn=in.nextInt();
			
			System.out.println("Enter Published Date: ");
			fyp[book_c].published=scan.nextLine();
			
			System.out.println("Enter Book Type: ");
			fyp[book_c].type=scan.nextLine();
			
			System.out.println("Fyp Added Successfully ");
			
			
		
		}
		else if(x=="Book") {
			
			book[book_c].type=x;
			book[book_c].bookid=book_c+1;
			book[book_c].book_status=true;
			book[book_c].issuedby=-1;
			
			System.out.println("Enter Book Name: ");
			book[book_c].book_name=scan.nextLine();
			
			System.out.println("Enter Author: ");
			book[book_c].author=scan.nextLine();
			
			System.out.println("Enter ISBN: ");
			book[book_c].isbn=in.nextInt();
			
			System.out.println("Enter Price: ");
			book[book_c].isbn=in.nextInt();
			
			System.out.println("Enter Published Date: ");
			book[book_c].published=scan.nextLine();
			
			System.out.println("Enter Book Type: ");
			book[book_c].type=scan.nextLine();
			
			System.out.println("Book Added Successfully ");
			
			
			
		}
		
		return ++book_c;
	}
	
	public void remove_book(int id,int book_c,Magazine mag[],Fyp fyp[],books book[]) {
		for(int i=0;i<book_c;i++)
		{
			if(mag[i].bookid==id) {
				mag[i].bookid=-1;
				System.out.println("Magazine "+mag[i].book_name+" deleted");
				break;	
			}
			else if(book[i].bookid==id) {
				book[i].bookid=-1;
				System.out.println("Book "+book[i].book_name+" deleted");
				break;
			}
			
			else if(fyp[i].bookid==id)
			{
				fyp[i].bookid=-1;
				
				System.out.println("FYP "+fyp[i].book_name+" deleted");
				break;
			}
			
		}
		System.out.println("No Book id found");
		
	}
	
	public void search_user(int userid,User s_user[],User i_user[])
	{
		if(s_user[userid-1].getid()==userid)
		{
		
		}
		else if(i_user[userid-1].getid()==userid) {
		
		}
		else
			System.out.println("Wrong user id");
	}
	
	public void impose_fine(int userid,int fine,User s_user[],User i_user[]) {
		if(s_user[userid-1].getid()==userid)
		{
		s_user[userid-1].fine=fine;
		System.out.println("FIne of "+fine+" imposed on "+s_user[userid-1].getname());
		}
		else if(i_user[userid-1].getid()==userid) {
		i_user[userid-1].fine=fine;
		System.out.println("FIne of "+fine+" imposed on "+i_user[userid-1].getname());
		}
		else
			System.out.println("Wrong user id");
	}
	
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
	
	public void update_info() {
		int inputs;
		System.out.println("What do you want to update ?\n1-Name\n2-Id\n3-Password");
		inputs=in.nextInt();
		switch(inputs) {
		
		case 1:
			System.out.println("Enter new name: ");
			name=scan.nextLine();
			break;
		case 2:
			System.out.println("Enter new ID");
			id=in.nextInt();
			break;
		case 3:
			System.out.println("Enter new password");
			password=scan.nextLine();
		
		}
		
	}
}
