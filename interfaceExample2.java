//by default what variable we declare in interface they are final and we cannot change the value of final or re initialized it  
//Interface Variables: Yes, variables declared in interfaces are implicitly public, static, and final. 
interface sum{
	int a=10;
	int b=20;
	void Add(int a, int b ,int[] arr);
}
class Addition implements sum{ 
//while writing asscess specifier to interface methods we cannot use protected and private because it will throw error -->attempting to assign weaker access privileges; was public  	
			public void Add(int a,int b ,int[] arr){
				try{
					System.out.println(a+b+arr[4]);
				}
				catch(Exception ex){
		   			System.out.println("error!!!...");
		   		}
		  	 }
	public static void main(String args[]){
		System.out.println(a);
		 //a=30; --> it will give error cannot assign a value to final variable a
		Addition a1=new Addition();
		int[] arr={10,20};
		a1.Add(1,1,arr);
	}

}
