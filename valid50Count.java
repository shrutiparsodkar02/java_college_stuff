class ValidString{
	boolean first_4_digits(String s){
		if((s.charAt(0)=='2')){
			if(s.charAt(1)=='0'){
				if(((s.charAt(2)>='0')&&(s.charAt(2)=='2')&&((s.charAt(3)>='0')&&( s.charAt(3)<='4')))|| ((s.charAt(2)<='0')&&((s.charAt(3)>='0')&&( s.charAt(3)<='9')))){
					if((s.charAt(3)>='0')&&( s.charAt(3)<='9')){
						return true;
					}
					else{
						return false;
					}	
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else{
			return false ;
	}
		//return false;
	}
	boolean validString_Second2(String s){
		String str = s.substring(4,7);
		String[] s1={"BIT","BME","BCH","BCS","bcs","bit","bme","bch"};
		for (String i :s1){
			if(str.equals(i)){
				return true;
			}
		}
		return false;
	}
	boolean validString_Last3(String s2){
		if(((s2.charAt(7)>='0')&&(s2.charAt(7)<='9')) && ((s2.charAt(8)>='0')&&(s2.charAt(8)<='9')) && ((s2.charAt(9)>='0')&&(s2.charAt(9)<='9'))){
			return true;
		}
		return false;
	}
	boolean isVAlid(String s){
		if(first_4_digits(s)==true&&(validString_Second2(s
		  )==true)&&(validString_Last3(s)==true)){
			return true;
		}
		
		return false;
	}
	String randomDigit_1_digit(){
		long num=System.nanoTime()%10;
		return String.valueOf(num);
	}
	String randomFirst4(){
		String num_4="";
		String num1="20";
		String s1=String.valueOf(System.nanoTime()%100);
		//String s2=String.valueOf(System.nanoTime()%10);
		//num_4=num1+()+(System.nanoTime()%10);
		num_4=num1+(s1);
		/*for(int i=1;i<4;i++){
			num_4=num1+randomDigit_1_digit();
		}*/
		return num_4;
	}
	/*String randomString(){
		long num1=System.nanoTime()%66;
		char s=(char)num1;
		long num2=System.nanoTime()%66;
		char s1=(char)num2;
		long num3=System.nanoTime()%66;
		char s2=(char)num3;
		String s3=String.valueOf(s)+String.valueOf(s1)+String.valueOf(s2);
		return s3;
	}*/
	char randomString_integer_between_65_to_90(){
		//long  num1=(System.nanoTime()%126);
		//System.out.println((num1));
		for(int i=0;i<10000;i++){
			long  num1=(System.nanoTime()%126);
			num1=155-num1;
		//	System.out.println(num1);
			if((num1>64)&&(num1<91)){
				return (char)num1;
			}
			else{
				continue;
			}
		}
			//System.out.println(num);
			return '@';
			
	}
	String randomStringof3(){
		String res="B";
		String str="";
		char m=randomString_integer_between_65_to_90();
		char m2=randomString_integer_between_65_to_90();
		//String str=("B"+String.valueOf(randomString())+String.valueOf(randomString()));
		str=res+m+m2;
		return str;
	}
	String randomlast3digit(){
		long num1=System.nanoTime()%10;
		num1=num1*100+System.nanoTime()%10+System.nanoTime()%10;
		//System.out.println(num1);
		return String.valueOf(num1);
	}
	String randomRegnum(){
		String str=(randomFirst4()+randomStringof3()+randomlast3digit());
		return str;
	}
	String[] arrayOfRandomRegnum(){
		int totalResNumbers=9000;
		String []str=new String[totalResNumbers];
		for(int i=0;i<totalResNumbers;i++){
			str[i]=randomRegnum();
		}
		return str;	
	}
	
	String[] validStringArray(String[] str){
			//String []str=arrayOfRandomRegnum();
			String []str2=new String[1000];
			int k=0;
			int count=0;
			for(int i=0;i<str.length;i++){
				
				if(isVAlid(str[i])){
					str2[k]=str[i];	
					k++;
					count++;
				}
			}
			
			//System.out.println("valid registration number count---->"+count);
		return str2;
	}
	void printArrayOfRegNum(String[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){
				continue;
			}
			else{
				System.out.print("   "+arr[i]);
				
			}
		}
	}
	String[]  lessThen50(String[] str){
		int count=0;
		String []str1=new String[5];
		int k=0;
		/*for(int l=0;l<str.length;l++){
			System.out.println(str[l]);
		}*/
		System.out.println("start of fun");
		
			/*for(int i=0;i<str.length;i++){
				//System.out.println(str[i].charAt(7));
				if((str[i].charAt(7)=='1')||(str[i].charAt(7)=='2')){
					str1[k]=str[i];
					k++;
					count++;	
				}
			}*/
			int i=0;
			while(i<str.length){
				System.out.println(str[i].charAt(7));
				String s1=str[i].substring(7,8);
				if(s1=="1" || s1=="5"){
					str1[k]=str[i];
				}
				i++;
			}
		System.out.println("\n\n\n");
		
		for(int d=0;d<str1.length;d++){
			System.out.println(str1[d]);
		}
		System.out.println("end");
		return str1;
		
	}
	public static void main(String args[]){
		ValidString v1= new ValidString();
		String[] str1=v1.arrayOfRandomRegnum();
		//System.out.println("Randomly generated array---->>");
		//v1.printArrayOfRegNum(str1);
		String[] str2=v1.validStringArray(str1);
		System.out.println("Valid Registration Numbers Generated array-->");
	        v1.printArrayOfRegNum(str2);
	        System.out.println("\n\n\n");
		String []str3=v1.lessThen50(str2);
		System.out.println("Valid Registration Numbers less then 50 Generated array-->");
	        v1.printArrayOfRegNum(str3);
	        //System.out.println(str1.substring(4,7));
		//System.out.println(v1.first_4_digits(str1));
		//System.out.println(v1.validString_Second2(str1));
		//System.out.println(v1.validString_Last3(str1));
		//System.out.println(v1.isVAlid(str1));
		//System.out.println(str1.charAt(1));
		//boolean res=v1.first_4_digits("2022bit049");
		//System.out.println(v1.first_4_digits(str1));
		//System.out.println(v1.randomFirst4());
		//System.out.println(v1.randomlast3digit());
		//System.out.println(v1.randomString());
		//System.out.println(v1.randomString());
		//System.out.println(v1.randomStringof3());
		//System.out.println(v1.randomRegnum());
		//v1.printArrayOfRegNum();
		//v1.validStringArray();
	        //v1.printArrayOfRegNum(str2);
	        //v1.printArrayOfRegNum(str);
	        //int count=v1.lessThen50(str);
	        //System.out.println(count);
		
	}
}


