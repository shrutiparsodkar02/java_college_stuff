import java.util.*;
class Division{
	float division(int n,int d){
		try{
			return n/d;
		}
		catch(Exception e){
			Scanner sc= new Scanner(System.in);
			System.out.println("division by zero exception");
			System.out.println("reenter nonzero-denominator ");
			d=sc.nextInt();
			//division(n,d);
			if(d==0){
				int i=0;
				while(i<10){
					System.out.println("reenter nonzero-denominator ");
					d=sc.nextInt();
					division(n,d);
					i++;
					if(d!=0){
						return n/d;
					}
				}
			}
		}
	return -1;
	}
	public static void main(String args[]){
		Division d=new Division();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numerator");
		int num=sc.nextInt();
		System.out.println("enter denominator");
		int den=sc.nextInt();
		float res=d.division(num,den);
		System.out.println("division is--->"+res);
	}
}

