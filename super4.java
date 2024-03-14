//by default super class default costructor is called by child class 
class One{
	One(){
		System.out.println("default constructor of one");
	}
}
class Two extends One{
	Two(){
		System.out.println("default constructor of Two");
	}
}
class Three{
	public static void main(String args[]){
	Two t = new Two();
	}
}
