class Question{
	static Question q1= new Question ();
	
	public static void main(String args[]){
		Question q1= new Question ();
	}
	static{
		System.out.println("inside static");
	}
	Question(){
		System.out.println("inside constructor");
	}
	{ 
		System.out.println("inside init");
	}
	
}

