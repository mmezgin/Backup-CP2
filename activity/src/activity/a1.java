package activity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class a1 {
	
	public class User {
	String name;
	int age;
	
	public User (String name, int age) {
	this.name=name;
	this.age=age;
	}
	public void introduce (String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("My name is: "+name+" I'm "+age+" years old.");
	}	
	}
	
	public static void even_odd(int z) throws FileNotFoundException {

		
		if((z%2)==0) {
			 PrintWriter Even = new PrintWriter("C:\\Users\\mmezgin\\Desktop\\pr_even.txt");
        	 Even.println(z+" | ");
        	 Even.close();
        	 System.out.println("ok");
	            try{
	            
	            	
	            	
	                  File even = new File("C:\\Users\\mmezgin\\Desktop\\even.txt");
	                  FileWriter fw1 = new FileWriter(even,true);
	                  BufferedWriter bw1 = new BufferedWriter(fw1);
	                  System.out.println("ok");
	                  bw1.write(z+" | ");
	                  bw1.close();
	                  
	            }
	            catch (Exception e){
	                  e.printStackTrace();
	            }
	      }
		else {
			
			 PrintWriter oddd = new PrintWriter("C:\\Users\\mmezgin\\Desktop\\pr_odd.txt");
        	 oddd.println(z+" | ");
        	 oddd.close();
        	 System.out.println("ok");
			
			try{
                File odd = new File("C:\\Users\\mmezgin\\Desktop\\odd.txt");
                FileWriter fw1 = new FileWriter(odd,true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                System.out.println("ok");
                bw1.write(z+" | ");
                bw1.close();
                
          }
          catch (Exception e){
                e.printStackTrace();
          }
          
		}
			
	}
	
	
	
public static void addition (int x,int y) {
	int sum = x+y;
	System.out.println("Addition of "+x+" & "+y+" is: "+sum);	
}

public static void multiplication (int x,int y) {
	int mul = x*y;
	System.out.println("Multiplication of "+x+" & "+y+" is: "+mul);	
}
public static void multiplication_table (int x,int y) {
	
if(x>y) {
	System.out.println("Multiplication table from "+y+" to "+x);

		for (int i=y; i<=x;i++) {
			for (int j=y; j<=x;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	else {
		System.out.println("Multiplication table from "+x+" to "+y);
	for (int i=x; i<=y;i++) {
		for (int j=x; j<=y;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
	}
	}
}
	
public static void main (String [] args) throws IOException{
	System.out.println("Enter integers value for even or odd until negative integer.");
	Scanner s1 = new Scanner(System.in);
	int z=1;
	while(z>0) {
		z=s1.nextInt();
		even_odd(z);
	}
System.out.println("Enter two integers");
	
	int x = s1.nextInt();
	int y = s1.nextInt();
	
	
	addition(x,y);
	multiplication(x,y);
	multiplication_table(x,y);

	 //User u1 = new User("Mert",21);

}
}