import java.util.*;
class LibraryManagement{
	String name;
	int year;
	long mobile_num;
	String branch;
	void getName(String name){
		this.name=name;	
	}
	void getMobNum(long num){
		this.mobile_num=num;
	}
	void getBranch(String branch){
		this.branch=branch;
	}
	void getYear(int year){
		this.year=year;
	}
}
class Librarian{
	
	boolean isAvailable(String[] arr,String name_bookname){
		int i=0;
		for(i=0;i<arr.length;i++){
			String s=arr[i];
			//System.out.println("Check::"+arr[i]+" :: "+s);
			if(s.equals(name_bookname)==true){
				System.out.println("book is available");
				return true;
			}
		}
		System.out.println("book not avaliable");
		return false;
	}
	String[] issueBook(String[] arr,String name_bookname){
	
		String[] arr_new=new String[arr.length-1];
		
		System.out.println("Avaialble Books::");
		for(String book: arr){
			System.out.println(book+" ");
		}
		
		if(isAvailable(arr,name_bookname)==true){
			for(int i = 0; i < arr.length; i++){
		     	 	if(arr[i].equals(name_bookname)==true) {
			// shifting elements
				
				//System.out.println("inside");
					for(int j = i+1; j < arr.length - 1; j++){
						arr_new[j] = arr[j+1];
						System.out.print(arr_new[j]);
					}
					arr_new[arr.length-2]="NA";
					break;
			 	}
			 	
		    	}
			//System.out.println("Before deletion :" + Arrays.toString(arr));
			//System.out.println("After deletion :" + Arrays.toString(arr_new));
			/*for(String book:arr_new ){
			System.out.println(book+" ");
			}*/
			
			System.out.println("book is issued");
			return arr_new;	
		}
		else{
			System.out.println("book not issued");
			return arr;
		}
	}
	
		
}
class Book{
	String book_name;
	int book_edition;
	int book_price;
	String book_author;
	/*void displayArray(String[] books){
			for(int i=0;i<books.length;i++){
				System.out.println(books[i]);
			}//
		}
	}*/
	void getBookName(String bookname){
		this.book_name=bookname;
	}
	void getBookEdition(int edition){
		this.book_edition=edition;
	}
	void getBook_author(String bookauthor1){
		this.book_author=bookauthor1;
	}
	void getBookPrice(int bookprice1){
		this.book_price=bookprice1;
	}
	void displayBookDInfo(){
		System.out.println("book name entered is---->"+book_name);
		System.out.println("book edition entered is---->"+book_edition);
		System.out.println("book author entered is---->"+book_author);
		System.out.println("book price entered is---->"+book_price);
	}
}

class Student extends LibraryManagement{
	String regNum;
	void getRegistrationNum(String regnum){
		this.regNum=regnum;
	}
	
	void displayDetails(){
		System.out.println("name entered is---->"+name);
		System.out.println("Registration number entered is---->"+regNum);
		System.out.println("branch entered is---->"+branch);
		System.out.println("year entered is---->"+year);
		System.out.println("mobile num entered is---->"+mobile_num);
	}
	public static void main(String args[]){
		Student s1= new Student();
		LibraryManagement l1=new LibraryManagement();
		Librarian l=new Librarian();
		Book b= new Book();
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter name");
		String name1=sc.nextLine();
		s1.getName(name1);
		
		System.out.println("enter registration number");
		String regnum=sc.nextLine();
		s1.getRegistrationNum(regnum);
	
	
		System.out.println("enter branch");
		String branch=sc.nextLine();
		s1.getBranch(branch);


		System.out.println("enter year");
		int year=Integer.parseInt(sc.nextLine());
		s1.getYear(year);
	
		
		System.out.println("enter mobile num");
		long mobnum=Long.parseLong(sc.nextLine());
		s1.getMobNum(mobnum);
		//System.out.println("\n\n");
		
		s1.displayDetails();
		
		
		System.out.println("enter book name");
		String bookname=sc.nextLine();
		b.getBookName(bookname);
		
		System.out.println("enter book edition");
		int bookedition=Integer.parseInt(sc.nextLine());
		b.getBookEdition(bookedition);
		
		System.out.println("enter book author");
		String bookauthor=sc.nextLine();
		b.getBook_author(bookauthor);
		
		System.out.println("enter book price ");
		int price=Integer.parseInt(sc.nextLine());
		b.getBookPrice(price);

		System.out.println("\n\n");
		
		b.displayBookDInfo();
		String[] books={"java","python","c++","c","maths fundamentals","data structure"};
		//b.displayArray(books);
		//l.isAvailable(books,bookname);
		//l.issueBook(books,bookname);
		String[] after_book_issue=l.issueBook(books,bookname);
		System.out.println("\n\n");
		//l.isAvailable(after_book_issue,bookname);
		
	}
	
}

