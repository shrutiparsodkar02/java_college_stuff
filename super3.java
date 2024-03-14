class Grandparent{
	int i=10;
	void low(int x){
	System.out.println("Inside Grandparent--->"+x);
	}
}
class Parent extends Grandparent{
	int i=20;
	void show(int x){
	//super.show(10);
	//System.out.println("Super variable x-->"+super.i);
	System.out.println("inside parent-->"+x);
	}
}
class Child{
	public static void main(String args[]){
		Parent p= new Parent();
		//Grandparent g= new Grandparent();
		//g.show(8);
		p.show(5);
		p.low(10);
		//System.out.println("value of x is--->"+p.i);
	}
}
