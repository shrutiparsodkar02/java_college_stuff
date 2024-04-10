class A{
	final double pi=3.14;
	
}
class B extends A{
	double pi=2.45;
	public static void main(String args[]){
	A a= new A();
	B b =new B();
	System.out.println(b.pi);
	System.out.println(a.pi);
	}
}
