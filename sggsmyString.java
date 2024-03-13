//in jshell we access method with helpof object when they are non.static
//if the method is static we directly access with using class name
class SGGS{
	public static void main(String args[]){
	
		SGGS s1=new SGGS();
		//System.out.println(s1.mytoString());
		System.out.println(s1);
		
		SGGS s2=new SGGS();
		System.out.println(s2);
		}
		
		/*public String mytoString(){
		return"my string"+getClass().getName()+"@"+Integer.toHexString(hashCode());
		}*/
		
		public String toString(){
			return "my string"+getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
}
/* we cannot have two toString method in same class
		public String toString(){
		return"my string";
		}*/
