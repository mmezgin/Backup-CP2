import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Update_Student_Information  {
	
	 public static void updateStudent() throws IOException {
	    	Show_all.show();
	 		String z,t;
	 		
	 		
	 		File f1 = new File("StudentInformations.txt");
	 		File f2 = new File("temp");
	 		Scanner sc1 = new Scanner(f1);
	 		Scanner sc2 = new Scanner(System.in);
	 		Ezgin_mert_mehmet.Student st = new Ezgin_mert_mehmet.Student();
	 		
	 		System.out.println("Enter the Student Number to update !");
	 		t = sc2.next();
	 		
	 		while(sc1.hasNext()) {
	 			
	 			z = sc1.nextLine();
	 			
	 			
	 			if(z.contains(t)) {
	 				
	 				System.out.println("update : " + z);
	 				System.out.println();
	 				
	 				System.out.println("Name:");
	 				t = sc2.next();
	 				st.setName(t);
	 				
	 				System.out.println("Surname:");
	 				t = sc2.next();
	 				st.setSurname(t);
	 				
	 				System.out.println("StID:");
	 				t = sc2.next();
	 				st.setNumber(t);
	 				
	 				System.out.println("Grade-1:");
	 				t = sc2.next();
	 				st.setGrade1(Double.parseDouble(t));
	 				
	 				System.out.println("Grade-2:");
	 				t = sc2.next();
	 				st.setGrade2(Double.parseDouble(t));
	 				
	 				System.out.println("Grade-3:");
	 				t = sc2.next();
	 				st.setGrade3(Double.parseDouble(t));
	 				
	 				System.out.println("Grade-4:");
	 				t = sc2.next();
	 				st.setGrade4(Double.parseDouble(t));
	 				
	 				System.out.println("Grade-5:");
	 				t = sc2.next();
	 				st.setGrade5(Double.parseDouble(t));
	 				break;
	 			}
	 			
	 			System.out.println("Name: " + st.getName() + " Surname: " +
	 			st.getSurname() + " StID: " + st.getNumber() + " Grade-1: " + 
	 					st.getGrade1() + " Grade-2: " + st.getGrade2() + " Grade-3: " + 
	 			st.getGrade3() + " Grade-4: " + st.getGrade4() + " Grade-5: " + st.getGrade5());
	 	
	 		
	 		sc1.close();	
	 		}
	 		Show_all.show();
	 	}

	

	
	
	public static void update_menu() throws IOException {
		String x;
		File f1 = new File("StudentInformations.txt");
		System.out.println("Choose an item number: \n" + "1- Update a student..\n"+"2- Return back to main menu\n");
		Scanner sc1 = new Scanner(System.in);
		x=sc1.nextLine();
	
		if (x.equals("1") ) {
			updateStudent();
		}

		     
		   
	
		else if  (x.equals("2")) {
			Ezgin_mert_mehmet.main_menu();
		}
		else {
			System.out.println(" Error !!! Invalid choose. Please choose 1-2 integer selection !!! ");
			update_menu();
		}
}
}
