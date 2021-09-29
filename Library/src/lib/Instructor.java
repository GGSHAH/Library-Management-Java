package lib;
import java.util.*;
public class Instructor extends User {
	
	String faculty;
	String position;
	protected int allbookid[]=new int[5];
	
	public Instructor()
	{
		for(int i=0;i<5;i++)
			allbookid[i]=-1;
	}
	
	
	 public int signup(int user_c) {
		 id=user_c+1;
		
		 booksissued=0;
		 allbookid_c=0;
         System.out.println("enter name\n");
         Scanner scan1= new Scanner(System.in);
         name = scan1.nextLine();
         
         System.out.println("enter faculty\n");
         Scanner scan2= new Scanner(System.in);
         faculty= scan2.nextLine();
         
         System.out.println("enter position\n");
         Scanner scan10= new Scanner(System.in);
         position = scan10.nextLine();
         
         
         System.out.println("enter age\n");
         Scanner scan3= new Scanner(System.in);
         age= scan3.nextInt();
         
         System.out.println("enter contact\n");
         Scanner scan4= new Scanner(System.in);
         contact = scan4.nextLong();
         
         System.out.println("enter address\n");
         Scanner scan6= new Scanner(System.in);
         address = scan6.nextLine();
         
         System.out.println("enter password\n");
         Scanner scan5= new Scanner(System.in);
         passowrd = scan5.nextLine();
         
         System.out.println("ID: "+getid());
         System.out.println("Instructor User added successfully");
         
         return ++user_c;
         }
         public void updateinfo() {
        	 System.out.println("ID: "+getid());
                 System.out.println("which info you want to update?\n");
                 System.out.println("1.name\n");
                 System.out.println("2.contact\n");
                 System.out.println("3.age\n");
                 System.out.println("4.address\n");
                 System.out.println("5.password\n");
                 System.out.println("6.faculty\n");
                 System.out.println("7.position\n");
                 int options;
                 Scanner scan7= new Scanner(System.in);
                 options= scan7.nextInt();
                 switch(options) {
                 case 1:
                         System.out.println("enter name\n");
                         Scanner scan1= new Scanner(System.in);
                         name = scan1.nextLine();
                         break;
                 case 2:
                         System.out.println("enter contact\n");
                         Scanner scan4= new Scanner(System.in);
                         contact = scan4.nextLong();
                         break;
                 case 3:
                         System.out.println("enter age\n");
                         Scanner scan2= new Scanner(System.in);
                         age= scan2.nextInt();
                         break;
                 case 4:
                         System.out.println("enter address\n");
                         Scanner scan6= new Scanner(System.in);
                         address = scan6.nextLine();
                         break;
                 case 5:
                         System.out.println("enter password\n");
                         Scanner scan5= new Scanner(System.in);
                         passowrd = scan5.nextLine();
                         break;
                 case 6:
                         System.out.println("enter faculty\n");
                         Scanner scan9= new Scanner(System.in);
                         faculty= scan9.nextLine();
                         break;
                 case 7:
                         System.out.println("enter positionn\n");
                         Scanner scan11= new Scanner(System.in);
                         position= scan11.nextLine();
                         break;
                         
                 }
         }

     	public void borrow(int id,Magazine mag[],Fyp fyp[],books book[]) {
     		System.out.println("ID: "+getid());
    		if (id==mag[id-1].getid())
    		{
    			if(mag[id-1].getbook_status())
    			{
    				if(booksissued<5)
    				{
    					mag[id-1].book_status=false;
    				mag[id-1].issuedby=super.id;
    				booksissued++;
    				for(int i=0;i<5;i++)
    				{
    					if(allbookid[i]==-1)
    					{
    					allbookid[i]=mag[id-1].getid();	
    					allbookid_c++;
    					break;
    					}
    					
    				}
    				
    				
    				System.out.println("Book issued");
    				}
    				else
    					System.out.println("Cannt Issue.Maximum limit reached");
    			}
    			
    			else
    				System.out.println("Book Already issued to other user");
    		}
    		
    		else if (id==fyp[id-1].getid())
    		{
    			if(fyp[id-1].getbook_status())
    			{
    				if(booksissued<5)
    				{
    					fyp[id-1].book_status=false;
    				fyp[id-1].issuedby=id;
    				booksissued++;
    				for(int i=0;i<5;i++)
    				{
    					if(allbookid[i]==-1)
    					{
    					allbookid[i]=fyp[id-1].getid();	
    					allbookid_c++;
    					break;
    					}
    					
    				}
    				
    				System.out.println("Fyp issued");
    				}
    				else
    					System.out.println("Cannt Issue.Maximum limit reached");
    			}
    			
    			else
    				System.out.println("Fyp Already issued to other user");
    		}
    		
    		else if (id==book[id-1].getid())
    		{
    			if(book[id-1].getbook_status())
    			{
    				if(booksissued<5)
    				{
    					book[id-1].book_status=false;
    					book[id-1].issuedby=id;
    				booksissued++;
    				for(int i=0;i<5;i++)
    				{
    					if(allbookid[i]==-1)
    					{
    					allbookid[i]=book[id-1].getid();
    					allbookid_c++;
    					break;
    					}
    					
    				}
    				
    				System.out.println("Book issued");
    				}
    				else
    					System.out.println("Cannt Issue.Maximum limit reached");
    			}
    			
    			else
    				System.out.println("Book Already issued to other user");
    		}
    		
    		
    		else
    			System.out.println("Incorrect Book iD");
    		
    		System.out.println("ID: "+getid());
    	}
         
     	public void returnBook(Magazine mag[],Fyp fyp[],books book[],int book_c)
     	{
     		System.out.println("Already Borrowed Books: ");
     		for (int i=0;i<5;i++)
     		{
     			
     			for(int j=0;j<book_c;j++)
     			{
     			if(allbookid[i]==mag[j].getid())
     			{
     			
     			
     				System.out.println("Name: "+mag[i].getname());
    				System.out.println("Author: "+mag[i].getauthor());
    				System.out.println("Price: "+mag[i].getprice());
    				System.out.println("Published: "+mag[i].getpublished());
    				System.out.println("Type: "+mag[i].gettype());
    				break;
     			}
     			
     			else if(allbookid[i]==fyp[j].getid())
     			{
     				
     				System.out.println("Name: "+fyp[i].getname());
    				System.out.println("Author: "+fyp[i].getauthor());
    				System.out.println("Price: "+fyp[i].getprice());
    				System.out.println("Published: "+fyp[i].getpublished());
    				System.out.println("Type: "+fyp[i].gettype());
    				System.out.println("Fyp Status: "+mag[i].getbook_status());
    				break;
     			}
     			else if(allbookid[i]==book[j].getid())
     			{
     				System.out.println("Name: "+book[i].getname());
    				System.out.println("Author: "+book[i].getauthor());
    				System.out.println("Price: "+book[i].getprice());
    				System.out.println("Published: "+book[i].getpublished());
    				System.out.println("Type: "+book[i].gettype());
    				System.out.println("Book Status: "+mag[i].getbook_status());
    				break;
     				
     			}
     		}	
     		}
     		
     		System.out.println("Enter Book id to return: ");
     		Scanner scan8=new Scanner(System.in);
     		int gg=scan8.nextInt();
     		System.out.println("Book Type: \n1-MAgazine\n2-Fyp\n3-Book");
     		int gg2=scan8.nextInt();
     		
     		switch(gg2)
     		{
     		case 1:
     			if(mag[gg-1].getid()==gg && mag[gg-1].issuedby==id) {
     				
     				for(int i=0;i<5;i++) {
     					if(allbookid[i]==mag[gg-1].getid())
     					{
     						allbookid[i]=-1;
     						break;
     					}
     						
     				}
     			
     				mag[gg-1].issuedby=-1;
     				mag[gg-1].book_status=true;
     				allbookid_c--;
     				booksissued--;
     				System.out.println("Magazine Returned");
     			}
     			break;
     			
     		case 2:
     			if(fyp[gg-1].getid()==gg & fyp[gg-1].issuedby==id) {
     				
    				for(int i=0;i<5;i++) {
     					if(allbookid[i]==fyp[gg-1].getid())
     					{
     						allbookid[i]=-1;
     						break;
     					}
    				}
     				fyp[gg-1].issuedby=-1;
     				fyp[gg-1].book_status=true;
     				allbookid_c--;
     				booksissued--;
     				System.out.println("Fyp Returned");
     			}
     			break;
     			
     		case 3:
     			if(book[gg-1].getid()==gg & book[gg-1].issuedby==id) {
     				
    				for(int i=0;i<5;i++) {
     					if(allbookid[i]==book[gg-1].getid())
     					{
     						allbookid[i]=-1;
     						break;
     					}
    				}
     				book[gg-1].issuedby=-1;
     				book[gg-1].book_status=true;
     				allbookid_c--;
     				booksissued--;
     				System.out.println("Book Returned");
     			}
     			break;
     		
     		}
     	}
         
}
