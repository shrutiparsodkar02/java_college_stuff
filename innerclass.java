//doubt mobile number cant be stored in long ????
class college {
	String collegename;
	college(String name){
		this.collegename=name;
	}
	class Department{
		String deptname;
		Department(String name){
		this.deptname=name;
		}
		String getDetails(){	
		 	return "collegename"+collegename;
		}
	}
	public static void main(String args[]){
	College c1 =new College("sggs");
	//c1.getDetails("shruti",9062);  ---> erroer
	//Department d1= new Department("IT");----> depat class is also instance member of college class we cant directly access it
	Department d1=c1 . new Department("IT");
	d1.getDetails();
	
	}
}
