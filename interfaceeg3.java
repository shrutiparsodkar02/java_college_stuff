interface college{
	void regNum(String regnum);
	void identyCard();
}
class MGM_College implements college{
	public void regNum(String regnum){
		System.out.println("mgm reg num is-->"+regnum);
	}
	public void identyCard(){
		System.out.println("yes student has identy card");
	}
}
class SGGS_College implements college{
	public void regNum(String regnum){
		System.out.println("mgm reg num is-->"+regnum);
	}
	public void identyCard(){
		System.out.println("identy card is not presnt ");
	}
}
class OutputClass{
	public static void main(String args[]){
		OutputClass o=new OutputClass();
		MGM_College m=new MGM_College();
		SGGS_College s=new SGGS_College();
		m.regNum("2023bit507");
		s.regNum("2023bit049");
		m.identyCard();
		s.identyCard();
	}
}
