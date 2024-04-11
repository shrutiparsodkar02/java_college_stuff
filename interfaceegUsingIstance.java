interface MyIntern{
	void connect();
	void disconnect();
}
class OracleDB implements MyIntern{
	public void connect(){
		System.out.println("connecting to oracle db database ");
	}
	public void disconnect(){
		System.out.println("Disconnecting to oracle db database ");
	}

}
class MongoosDB implements MyIntern{
	public void connect(){
		System.out.println("connecting to Mongoos db database ");
	}
	public void disconnect(){
		System.out.println("Disconnecting to Mongoose db database ");
	}

}
class MainClass{
	public static void main(String args[]){
		/*Class c=Class.forName(args[0]);
		MyIntern mi=(MyIntern)c.newInstance();*/
		OracleDB o=new OracleDB();
		MongoosDB m=new MongoosDB();
		o.connect();
		o.disconnect();
		m.connect();
		m.disconnect();
	}
}
