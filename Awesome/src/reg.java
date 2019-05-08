import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class reg {
	public static void register()  {
		String username,password;
		
		 
		@SuppressWarnings({ "resource" })
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Choose Your User Name: \n");
		 username=sc2.nextLine();
	      try {
	            File register = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Accounts\\"+username+".txt");
	            if(register.createNewFile())
	                System.out.println("Username is available !");
	            else
	                System.out.println("Error ! This username'"+username+"' already taken !");
	        }
	        catch(IOException io) {
	            io.printStackTrace();
	            
	}
	      System.out.println("Define a Password: \n");
	   		 password=sc2.nextLine();
	   		 
	   		FileWriter fw = null;
			try {
				fw = new FileWriter("C:\\Users\\mmezgin\\Desktop\\Java\\Accounts\\"+username+".txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.write( password);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 System.out.println("Password created succesfully !");
			 
			 log.login();
			 
	        }
}
