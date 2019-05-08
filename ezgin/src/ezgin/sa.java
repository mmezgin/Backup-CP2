package ezgin;

import java.util.Scanner;

public class sa {
	
	
	String username= "admin", password="123";
	 

	public void logscreen() {
		Scanner sc = new Scanner(System.in);
		
		 String username= "admin", password="123";
		 System.out.println("Enter your Username \n");
		 username = sc.next();
		 System.out.println("Enter your Password \n");
		  password= sc.next();
		 if ( username=="admin" && password=="123" ) {
			 System.out.println("helal");
		 }
		 else {
			 System.out.println("hahahaah");
		 }

}
