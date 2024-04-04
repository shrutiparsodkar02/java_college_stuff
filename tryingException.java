class TestingException{
	public static void main(String args[]) /*throws InterruptedException*/{
		
		/*finally{
			System.out.println("handling code");
		}*/
		try{Thread.sleep(1000);
		System.out.println(args[0]);
		Thread.sleep(1000);}
		
		catch (Exception e){
			System.out.println("inside exception block");
		}
		finally{
			System.out.println("handling code");
		}
		/*finally{
			System.out.println("handling code 2 --->");
		}*/
		/*catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("error in line 4!!!");
		}
		catch(InterruptedException irpt){
			System.out.println("error in line 3 and 5 !!");
		}
		catch (Exception e){
			System.out.println("inside exception block");
		}*/
	}

}
