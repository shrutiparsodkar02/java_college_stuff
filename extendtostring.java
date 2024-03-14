//error code
class College{
	String College_name;
	/*College(){
	}*/
	College(String College_name){
		this.College_name=College_name;
	}
}
class University extends College{
	String uni_name;
	University(String uni_name){
		super();
		this.uni_name=uni_name;
	}
	public static void main(String args[]){
		University u1=new University("srtm");
		//College c1= new College("nagpur");
		System.out.println(u1);
		//System.out.println(c1);
		
	}
	
}
