import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Delete_Menu {
	
		
		public static void delete_m() {
		
	Scanner sc1 = new Scanner(System.in);
	String x;
	System.out.println("Choose an item number: \n" + "1- Delete student.\n2- Go back to main menu.\n");
	Scanner sc2 = new Scanner(System.in);
	x=sc2.nextLine();
	if(x.equals("1")) {  
		try {
			delStudent();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	if(x.equals("2")) { 
		try {
			Ezgin_mert_mehmet.main_menu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	

public static void delStudent() throws FileNotFoundException {
		
		String x,y;
		
		PrintWriter tmp = new PrintWriter("temp.txt");
		File tmpr= new File("temp.txt");
		File f1 = new File("StudentInformations.txt");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(f1);
		Scanner sc3 = new Scanner(tmpr);
		
		try {
			Show_all.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Enter a student number to delete !!!");
		y = sc1.next();
		

		while(sc2.hasNext()){
			
			
			x = sc2.nextLine();
			
			if(x.contains(y)){
				
				continue;
			}
			
			tmp.println(x);
			
		}
		tmp.close();
		System.out.println();		
				
		while(sc3.hasNext()) {
			
			x = sc3.nextLine();
			System.out.println(x);
		}
		try {
			Show_all.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		delete_m();
	
	
}
	

}

