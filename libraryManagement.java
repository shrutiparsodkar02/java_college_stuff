import java.util.*;
class Person{
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
/*class Faculty extends Person{
	String dept_of_faculty;
	void getdept_of_faculty(String dept_of_faculty){
		this.dept_of_faculty=dept_of_faculty;	
	}
	void displayDetails_of_faculty(){
		System.out.println("Displaying faculty details---->")
		System.out.println("name entered is---->"+name);
		
		System.out.println("mobile num entered is---->"+mobile_num);
	}
	


}*/
class Librarian{
	void displayLibrarianDetails(String name,long mob_num){
		System.out.println("librarain is--->"+name);
		System.out.println("mobile num of librarian is--->"+mob_num);
	}
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
	
		String[] arr_new=new String[(arr.length)];
		/*for(int k=0;k<arr.length;k++){
			arr_new[k]=arr[k];
		}
		for(String book:arr_new ){
			System.out.println(book+" ");
			}
		System.out.println("Avaialble Books::");
		for(String book: arr){
			System.out.println(book+" ");
		}*/
		
		if(isAvailable(arr,name_bookname)==true){
			for(int i = 0; i < arr.length; i++){
		     	 	if(arr[i].equals(name_bookname)==true) {
			// shifting elements System.out.println("inside");
					for(int j = i; j < arr.length-1; j++){
						arr_new[j] = arr[j+1];
						System.out.print(arr_new[j]+" ");
					}
			//System.out.println("\n\n");
					arr_new[arr.length-1]="NA";
					break;
				}
			}
			//System.out.println("Before deletion :" + Arrays.toString(arr));
			//System.out.println("After deletion :" + Arrays.toString(arr_new));
			/*for(String book:arr_new ){
			System.out.println(book+" ");
			}
			*/
			System.out.println("book is issued");
			return arr_new;	
		}
		else{
			System.out.println("book not issued");
			return arr;
		}
	}
	String[] returnBook(String[] arr,String name_bookname){
		//int length=(arr.length)+1 ;
		//String[] after_book_returned=new String[length];
		//int index=arr.length-1;
		//now we will shift elements
		/*
		
		*/
		for(int i=0;i<arr.length;i++){
			if(arr[i]=="NA"){
				arr[i]=name_bookname;
			}
		
		}
		System.out.println("book is returned");
		//after_book_returned[length-1]=name_bookname;
		/*for(String book: arr ){
			System.out.println(book+" ");
		}*/
	return arr;
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

class Student extends Person{
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
	
	
}
class MainBody{
	
	public static void main(String args[]){
		Student s1= new Student();
		Person l1=new Person();
		Librarian l=new Librarian();
		Book b= new Book();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("<---WELCOME TO LIBRARY MANAGEMENT SYSTEM--->");
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
		
		//s1.displayDetails();
		
		
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
		
		/*b.displayBookDInfo();
		String[] books={"java","python","c++","c","maths fundamentals","data structure"};
		//b.displayArray(books);
		//l.isAvailable(books,bookname);
		//l.issueBook(books,bookname);
		String[] after_book_issue=l.issueBook(books,bookname);
		System.out.println("\n\n");
		//l.isAvailable(after_book_issue,bookname);
		
		System.out.println("enter the book which you want the return");
		String return_book=sc.nextLine();
		System.out.println("\n\n");
		l.returnBook(after_book_issue,return_book);*/
		//l.displayLibrarianDetails("R.Raman",784589541);
		String[] books={"java","python","c++","c","maths fundamentals","data structure"};
		 while (true) {
	 		System.out.println("\n\n");
		    System.out.println("1.show student details ");
		    System.out.println("2.Show book details");
		    System.out.println("3.check book is avilable");
		    System.out.println("4. Isuuse book ");
		    System.out.println("5. Return book");
		   /* System.out.println("6. ");
		    System.out.println("7. ");
		    System.out.println("8. ");*/
		    System.out.println("Enter your choice:");
		   int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Student details are--->");
                    s1.displayDetails();
                    System.out.println("\n\n");
                    break;
                case 2:
                    	System.out.println("all book related details are --->");
                    	b.displayBookDInfo();
                    	System.out.println("\n\n");
                    break;
                case 3:
                	System.out.println("librarian details are-->");
                	l.displayLibrarianDetails("R.Raman",784589541);
                   System.out.println("Status of book avilable or not-->" + l.isAvailable(books,bookname));
                   System.out.println("\n\n");
                    break;
                case 4:
                   	l.issueBook(books,bookname);
                   	//String[] after_book_issue=l.issueBook(books,bookname);
                   	System.out.println("\n\n");
                   	break;
                case 5:
                    	//l.issueBook(books,bookname);
		        System.out.println("enter the book which you want the return");
		   	Scanner sc1= new Scanner(System.in);
			String return_book=sc1.nextLine();
			System.out.println("\n\n");
	               	String[] after_book_issue1=l.issueBook(books,bookname);
			l.returnBook(after_book_issue1,return_book);
			System.out.println("\n\n");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
		
	}
	}


}
