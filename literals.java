class Literals{
	public static void main(String args[]){
	int decval=26;
	int octval=026;
	int hexval=0x26;
	//doubt;
	//after e which value we give it will shift decimal
	double dub=1.234e4;
	int num=0b0001;
	//type casting
	short num1=(short)0b1101;
	System.out.println("value of binary number is"+num);
	System.out.println("short conversionmbinary number is"+num1);
	System.out.println("decimal value is --"+decval);
	System.out.println("octal value is --"+octval);
	System.out.println("hexadecimal value is --"+hexval);
	System.out.println("double value is------"+dub);
	}

}
class Binary{
	public static void main(String args[]){
	int num=0b1111;
	int num2=12_34;
	System.out.printf("\n Decimal is =%d",num);
	System.out.printf("\n octal is =%o",num);
	System.out.printf("\n hexadecimal is =%x",num);
	System.out.printf("\n binary is =%s",Integer.toBinaryString(num));
	System.out.println("\n"+num2);
	
	}
}
