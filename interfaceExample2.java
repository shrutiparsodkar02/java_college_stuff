//by default what variable we declare in interface they are final and we cannot change the value of final or re initialized it  
interface sum{
	int a=10;
	int b=20;
	void Add(int a, int b);
}
class Addition implements sum{
	public void Add(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String args[]){
		System.out.println(a);
		 //a=30; --> it will give error cannot assign a value to final variable a
		Addition a1=new Addition();
		a1.Add(1,1);
	}

}
