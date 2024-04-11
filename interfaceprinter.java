import java.io.*;
interface Printer{
	void printit(String text);
	void disconnect();
}
class HPprinter implements Printer{
	public void printit(String text){
		System.out.println("printer is printing----->"+text);
	}
	public void disconnect(){
		System.out.println("disconnected from hp printers");
	}
}
class Canonprinter implements Printer {
	public void printit(String text){
		System.out.println("printer is printing----->"+text);
	}
	public void disconnect(){
		System.out.println("disconnected from Canon printers");
	}
}
class OutputPrinter {
//****throws statement must be wrote in methods****
	public static void main(String args[])throws Exception{
		HPprinter h =new HPprinter();
		FileReader fr=new FileReader("printer.txt");
		
		//for reading line by line code
		LineNumberReader lnr=new LineNumberReader(fr);
		String printer =lnr.readLine();
		
		h.printit(printer);
		h.disconnect();
	}
}
