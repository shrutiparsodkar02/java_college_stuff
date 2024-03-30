class CountValidString{
	String getRandomString(){
		String str="";
			str=str+'2';
			str=str+'0';
			for(int i=2;i<4;i++){
				int num1=(int)System.nanoTime()%10;
				str=str+num1;
			}
			String branchcode[]={"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};
			int index=(int)(System.nanoTime()%8);
			str=str+branchcode[index];
					
			for(int i=8;i<=10;i++){
				int num2= (int)System.nanoTime()%10;
				str=str+num2;
			}
	return str;		
	}
	boolean validString(String s1) {
		boolean fun1 = last_3_digits(s1);
		boolean fun2 = branchCode(s1);
		boolean fun3 = first4Digits(s1);
	 	 if (s1.length() == 10 && fun1 == true && fun2 == true && fun3 ==true ) {
		    return true;
		} 
		else {
		    return false;
		}
  	}
       boolean  first4Digits(String s1) {
       		if(s1.length() == 10){
		        if(s1.charAt(0)=='2' && s1.charAt(1)=='0'){
			    	if((s1.charAt(2)<'2'&& s1.charAt(3)>='0')||( s1.charAt(2)=='2'&& s1.charAt(3)<'5')){
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
	     return false;
        }
	boolean branchCode(String s1) {
	       String d1 = s1.substring(4, 7);
	       String[] validStrings = {"bit", "BIT", "BCS", "bcs", "BME", "bme", "BCH", "bch"};

	       for (String str : validStrings) {
		    if (d1.equals(str)) {
		        return true;
		    }
		}
	       return false;
        }
        boolean last_3_digits(String s1) {
		if (s1.length() == 10) {
			if (s1.charAt(7) >='0'&&s1.charAt(7) <='9'){
				 if(s1.charAt(8)<='9'&&s1.charAt(8)>='0'){
						 if(s1.charAt(9) <='9'&&s1.charAt(9) >='0'){
							return true;
						  }
						  
						 else{
						 	return false;
						 }
				  }
			         else {
					return false;
			         }
			 }
		        else {
		      	 	return  false;
		        }
		}
		else{
			return  false;
		}
	 }
	 String[] store1kStringInStringArray(int sizeOfString){
	 	String[] str=new String[sizeOfString];
	 	for(int i=0;i<sizeOfString;i++){
	 		str[i]=getRandomString();
	 	}
	 	
	 return str;
	 }
	 void printAllStrings(String[] arr){
	 	for(int i=0;i<arr.length;i++){
	 		if(arr[i]==null){
	 			continue;
	 		}
	 		else{
	 			System.out.println(arr[i]);
	 		}
	 	}
	 }
	
	 String[] validStringsArray(String[] arr){
	 	String[] str1=new String[(arr.length)];
	 	int k=0;
	 	for(int i=0;i<arr.length;i++){
	 		if(validString(arr[i])==true){
	 			str1[k]=arr[i];
	 			k++;
	 		}	
	 	}
	 	return str1;
	 }
	  boolean last_3_digitslessthan50(String s1) {
	
			if (s1.charAt(7) =='0'){
				 if(s1.charAt(8)<='4'){
						 if(s1.charAt(9) <='9'&&s1.charAt(9) >='0'){
							return true;
						  }
						  
						 else{
						 	return false;
						 }
				  }
			         else {
					return false;
			         }
			 }
		        else {
		      	 	return  false;
		        }
	 }
	 long count_res_num_less_than_50(String[] arr){
	 	
	 	long count=0;
	 	for(int i=0;i<arr.length;i++){
		 	if(last_3_digitslessthan50(arr[i])==true){
		 		count++;
		 	}		
	 	}
	 	return count;
	 }
	public static void main(String args[]){
		CountValidString obj1=new CountValidString();
		int sizeOfStringArray=100;
		String[] w1=obj1.store1kStringInStringArray(50);
		//String[] w2=obj1.validStringsArray(w1);
		obj1.printAllStrings(w1);
		String[] w2=obj1.validStringsArray(w1);
		System.out.println("Seond Array");
		obj1.printAllStrings(w2);
		//obj1.count_res_num_less_than_50(w2);
	 	//obj1.last_3_digitslessthan50(w1);
		//long s1=obj1.approach1(w2);
		//String[] w3=obj1.approach1(w2);
		//obj1.printAllStrings(w3);
		//System.out.println(s1);
	}

}
