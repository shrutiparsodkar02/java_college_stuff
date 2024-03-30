class AddString{
	String randomFirst4(){
		String num_4="";
		String num1="20";
		num_4=num1+(System.nanoTime()%10)+(System.nanoTime()%10);
		return num_4;
	}
	public static void main(String[] args){
		AddString A1=new AddString();
		System.out.println(A1.randomFirst4());
	
	}
}
