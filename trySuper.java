class One{
	One(int a, int b){
		int sum=a+b;
		System.out.println(sum);	
	}
}
class Two extends One{
	Two(int a, int b){
		super(4,4);
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String args[]){
		Two obj1= new Two(5,6);
		
	}



}
