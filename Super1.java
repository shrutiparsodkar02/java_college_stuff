class Grandparent{
	int i=10;
	void show(int x){
	System.out.println("Inside Grandparent--->"+x);
	}
}
class Parent extends Grandparent{
	int i=20;
	void show(int x){
	System.out.println("inside parent-->"+x);
	}
}
class Child{
	public static void main(String args[]){
		Parent p= new Parent();
		Grandparent g= new Grandparent();
		g.show(8);
		p.show(5);
		System.out.println("value of x is--->"+p.i);
	}
}
