//by default access specifire of interface is public so  down we cannot use weakeer access specifier
//the class which implements any interface then it is complusory to write that interface method
//what parameters we give in interface must be same in while writing method body
//If the superclass method does not declare an exception, then the overriding subclass method cannot declare a checked exception, but it can declare an unchecked exception.
//If the superclass method declares an exception, then the overriding subclass method can declare the same exception

interface voter{
	void castvote();
}
interface EC {
	void checkValidVoter(int minage );
}
class ECIndia implements voter,EC {
	int age;
	ECIndia(int age){
		this.age=age;
	}
	public void castvote(){
		int arr[]={10,20,30};
		try{
			System.out.println(arr[4]);
		}
		catch(Exception ex){
			System.out.println(ex);
			for(StackTraceElement element:ex.getStackTrace()){
				System.out.println(element);
				System.out.println(element.getClassName()+"."+element.getMethodName()+"("+element.getFileName()+":"+element.getLineNumber()+")");
			}
		}
	}
//override method can throw only unchecked exception
/*In Java, Exception is a class that is typically used for handling exceptions, but it doesn't have a constructor that directly accepts a String parameter. If you want to throw an exception with a specific message, you need to create an instance of a subclass of Exception, such as RuntimeException, IllegalArgumentException, or create your own custom exception class that extends Exception.*/
//here i am creating my own exception
	/*public void checkValidVoter(int minage) throws InvalidVoter {
		
			if(age>minage){
				throw new InvalidVoter("");
			}
		
	}*/
	public void checkValidVoter(int minage) throws InvalidVoter {
		
			if(age>minage){
				InvalidVoter iv =new InvalidVoter("invalid voter"+minage);
				throw iv;
		
			}
		}
		
}
class ECBrazil implements voter, EC{
	int age_inBrazil;
	ECBrazil(int age ){
		this.age_inBrazil=age;
	}
	public void checkValidVoter(int minage) throws InvalidVoter2{
		if(age_inBrazil>minage){
			throw new InvalidVoter2(" ");
		}
	}
	public void castvote(){
	System.out.println("");
	}
}
//If you intended to declare that your class ElectionCommision2024 throws an exception, you should do so in the constructor or methods of the class, not in the class declaration itself
class ElectionCommision2024  {
	public static void main(String args[]) throws Exception{
	ECIndia eci =new ECIndia(18);
	ECBrazil ecb =new ECBrazil(16);
	//eci.checkValidVoter(5);
	eci.castvote();
	//ecb.checkValidVoter(5);
	}
}
//creating my own own custom exception class that extends Exception so that i can pass string as arugment it it
class InvalidVoter extends RuntimeException {
	InvalidVoter(String msg){
		super("invalid voter in india");
	}
} 
class InvalidVoter2 extends RuntimeException {
	InvalidVoter2(String msg){
		super("invalid voter in brazil");
	}
} 
