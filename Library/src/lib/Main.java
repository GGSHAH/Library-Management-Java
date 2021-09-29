package lib;
import java.util.*;
public class Main {

public static void  main(String args[]) {
	
	
	int  book_c=0;
	int user_c=0;
	//int  books_c=0;
	//int fyp_c=0;
	
		
	 Librarian lib=new Librarian();	

	 
		Magazine[] mag=new Magazine[10];{
			for(int i=0;i<10;i++)
			mag[i]=new Magazine();
			
			}
			
			
			Fyp[] fyp=new Fyp[10];{
				for(int i=0;i<10;i++)
					fyp[i]=new Fyp();
			}
			
			
			books[] book=new books[10];{
				for(int i=0;i<10;i++)
					book[i]=new books();
				
			}
	 
	 
		
User[] s_user=new Student[10];{
	for(int i=0;i<10;i++)
		s_user[i]=new Student();
			
}


User[] i_user=new Instructor[10];{
	for(int i=0;i<10;i++) 
		i_user[i]=new Instructor();	
}


		int x=0;
		int y=0;

		String s="";
		
		
		int flag1 = 0;
		
		while(true) {
		System.out.println("*****Welcome to Library *******\n");
		System.out.println("1-Librarian\n2-User\n");
		Scanner in=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		x=in.nextInt();
		
	
		if(x==1) //librarian
		{
			
			while(true) {
		//System.out.flush();
			System.out.println("*******Librarian Sign in*******\n")	;	
			System.out.println("Enter ID: ");
		y=scan1.nextInt();
		System.out.println("\nEnter Password:");
		s=scan.nextLine();
		
		if(y==lib.getid() && s.equals(lib.getpw()))
		{
		break;
			
		}
		
			}

	System.out.println("\n******Librarian*****\n1-Add Book\2-Remove Book\n3-Impose Fine\n4-Search User\n5-Search Book\n6-Update Information\n");
	
	int gg;
	int inputs;
	
	gg=in.nextInt();
	switch(gg) {
	case 1:
	System.out.println("\n1-Magazine\2-Books\n3-Fyp");
	gg=in.nextInt();
	if(gg==1)
	book_c=lib.add_book("Magazine",book_c,mag,fyp,book);
	else if(gg==2)
		book_c=lib.add_book("Book",book_c,mag,fyp,book);
	else if (gg==3)
		book_c=lib.add_book("Fyp",book_c,mag,fyp,book);
	break;
	
	case 2:
		System.out.println("\nEnter Book ID: ");
		gg=in.nextInt();
		lib.remove_book(gg,book_c,mag,fyp,book);
		
		break;
		
		
	case 3:
		int tmp;
		System.out.println("Enter Amount to impose: ");
		gg=in.nextInt();
		System.out.println("Enter User ID: ");
		tmp=in.nextInt();
		lib.impose_fine(tmp,gg,s_user,i_user);
		break;
		
	case 4:
		System.out.println("Enter USer ID: ");
		gg=in.nextInt();
		lib.search_user(gg,i_user,s_user);
		break;
	
	
	case 5:
		System.out.println("Enter book id: ");
		inputs=in.nextInt();
		lib.search_book(inputs,book_c,mag,fyp,book);
	break;
	
	case 6:
		lib.update_info();
		break;
		default:
			System.out.println("Select Correct option");
	
	}
	
	
		
	}
	// User
		else if(x==2) {
			int temp;
			int uid;
			int flag3=0;
			String pw;
			System.out.println("\n******User******\n1-Sign in\n2-Signup");
			temp=in.nextInt();
			switch(temp) {
			
			case 1:
				System.out.println("\n*****\n1-Instructor\n2-Student");
				temp=in.nextInt();
				if(temp==1) {
					
					while(true) {
						
					
					System.out.println("Enter ID: ");
					uid=in.nextInt();
					System.out.println("\nEnter Password: ");
					pw=scan.nextLine();
				
						if(uid==i_user[uid-1].getid() && i_user[uid-1].getpw().equals(pw))
						break;
					
					}
					System.out.println("*******"+i_user[uid-1].getname()+" *******\n1-Search Book\n2-Borrow Book\n3-Return Book\n4-Pay Fine\n5-Update Information");
					temp=in.nextInt();
					switch(temp) {
					case 1:
						System.out.println("Enter Book id you want to search: ");
						temp=in.nextInt();
						i_user[uid-1].search_book(temp,book_c,mag,fyp,book);
						break;
						
					case 2:
						System.out.println("Enetr Book ID: ");
						temp=in.nextInt();
						i_user[uid-1].borrow(temp,mag,fyp,book);
						break;
						
					case 3:
						i_user[uid-1].returnBook(mag,fyp,book,book_c);
						break;
						
					case 4:
						System.out.println("Enter Amount you want to pay: ");
						temp=in.nextInt();
						i_user[uid-1].payfine(temp);
						break;
						
					case 5:
						i_user[uid-1].updateinfo();
						break;
						
					
					
					}
				}
				else if(temp==2) {
					
					while(true) {
						
						
						System.out.println("Enter ID: ");
						uid=in.nextInt();
						System.out.println("\nEnter Password: ");
						pw=scan.nextLine();
					
							if(uid==s_user[uid-1].getid() && s_user[uid-1].getpw().equals(pw))
							break;
						
						}
						System.out.println("*******"+s_user[uid-1].getname()+" *******\n1-Search Book\n2-Borrow Book\n3-Return Book\n4-Pay Fine\n5-Update Information");
						temp=in.nextInt();
						switch(temp) {
						case 1:
							System.out.println("Enter Book id you want to search: ");
							temp=in.nextInt();
							s_user[uid-1].search_book(temp,book_c,mag,fyp,book);
							break;
							
						case 2:
							System.out.println("Enetr Book ID: ");
							temp=in.nextInt();
							s_user[uid-1].borrow(temp,mag,fyp,book);
							break;
							
						case 3:
							s_user[uid-1].returnBook(mag,fyp,book,book_c);
							break;
							
						case 4:
							System.out.println("Enter Amount you want to pay: ");
							temp=in.nextInt();
							s_user[uid-1].payfine(temp);
							break;
							
						case 5:
							s_user[uid-1].updateinfo();
							break;
							
						
						
						}
					
					
				}
				
				
				break;
			case 2:
				System.out.println("1-Instructor\n2-Student");
				temp=in.nextInt();
				if(temp==1)
					user_c=i_user[user_c].signup(user_c);
				else if(temp==2)
			user_c=s_user[user_c].signup(user_c);
			break;
			}
			
			
			
			
		}
	
	
	
	
		}
		
	}
}	
		
		
		
		
	

