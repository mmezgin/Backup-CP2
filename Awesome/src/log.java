import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class log {
	public static void login() {
		String username,password;
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Your User Name: \n");
		username=sc1.nextLine();
		
		 
		 System.out.println("Enter Your Password: \n");
		 password=sc1.nextLine();
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Accounts\\"+username+".txt"))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					if (password.equals(sCurrentLine))

 {
						System.out.println("correct password");
						user.userPage();
					}
					else {
						System.out.println("incorrect password");
						login();
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		 
	}
}
