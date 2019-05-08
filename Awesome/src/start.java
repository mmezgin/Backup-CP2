import java.util.Scanner;

public class start {
public static void Run() {
		
		String x;
		@SuppressWarnings({ "resource" })
		Scanner sc1 = new Scanner(System.in);
		 System.out.println("For register type (R),For login type(L),For Admin login type(A) \n");
		 x=sc1.nextLine();
		 if(x.equals("R") || x.equals("r")) {
		reg.register ();
		 }
		 else if (x.equals("L") || x.equals("l")) {
			log.login();
		 }
		 else if(x.equals("A") || x.equals("a")) {
			 admin.adminLog();
			 
		 }
		 else {
			 System.out.println("Incorrect selection please enter R/r,L/l or A/a");
			 Run();
		 }
		
	}
}
