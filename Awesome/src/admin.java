import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//String example = "/abc/def/ghfj.doc";
//System.out.println(example.substring(example.lastIndexOf("/") + 1));
public class admin {
	
	public static void adminLog() {
		String adminPassword;
		
		 
		@SuppressWarnings({ "resource" })
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter admin password \n");
		 adminPassword=sc2.nextLine();
		 if (adminPassword.equals("admin")) {
			 System.out.println("Admin Login Succesful.");
			 admin.adminPage();
		 }
		 else {
			 adminLog();
		 }
		 
	}
	
	@SuppressWarnings("unchecked")
	public static void adminPage() {
		int x,y;
		String q;
		
		@SuppressWarnings({ "resource" })
		Scanner sc1 = new Scanner(System.in);
		 System.out.println("Choose one:\n 1-Enter Product \n 2-Delete Product \n 3-List Products \n 4-List Registered Users\n 5-Logout");
		 x=sc1.nextInt();
		 /////////////////////////
		 if(x==1) {//add
			 System.out.println("Choose a category:\n 1-Books\n 2-Electronics");
			 y=sc1.nextInt();
			 if(y==1) { //Book 
			/*	 System.out.println("Enter a book name:");
				 Scanner sc2 = new Scanner(System.in);
				 p_name=sc2.nextLine();
				 
				 try {
			            File register = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+p_name+".txt");
			            if(register.createNewFile()) {
			                System.out.println("Book Added Succesfully !");
			            }
			            else {
			                System.out.println("Error ! This book '"+p_name+"' already added!");
			                adminPage();
			        }
				 }
			        catch(IOException io) {
			            io.printStackTrace();
			            
			          ///*//*/  
			        }
				 Scanner sc3 = new Scanner(System.in);
			            System.out.println("How many quantity of: "+p_name);
				   		 q=sc3.nextLine();
				   		
				   		 
				   		FileWriter fw = null;
						try {
							fw = new FileWriter("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+p_name+".txt");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							fw.write(q);
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
 
						 System.out.println("Product quantity has updated !");
			*/
						 
						    String q1,q2,q3,q4;
						    Scanner sc4 = new Scanner(System.in);
				            System.out.println("Book Name: ");
					   		q1=sc4.nextLine();	
					   		System.out.println("ID: ");
					   		q2=sc4.nextLine();
					   		System.out.println("Quantity: ");
					   		q3=sc4.nextLine();
					   		System.out.println("Price: $ ");
					   		q4=sc4.nextLine();
						 
						 String fileName = "C:\\\\Users\\\\mmezgin\\\\Desktop\\\\Java\\\\Products\\\\Books\\"+q1+".txt"; 
					        try { 
					            BufferedWriter out = new BufferedWriter( 
					                          new FileWriter(fileName)); 
					            out.write("ID: "+q2+"	"); ///////////////////////////
					            out.close(); 
					        } 
					        catch (IOException e) { 
					            System.out.println("Exception Occurred" + e); 
					        } 
					  
					        // Let us append given str1 to above 
					        // created file. 
					        String str = "Quantity: "+q3+"		"+"Price: $"+q4; ////////////////////////////
					        function.appendStrToFile(fileName, str); 
					  
					        // Let us print modified file 
					        try { 
					            BufferedReader in = new BufferedReader( 
					                        new FileReader("C:\\\\Users\\\\mmezgin\\\\Desktop\\\\Java\\\\Products\\\\AllProducts\\"+q1+".txt")); 
					  
					            String mystring; 
					            while ((mystring = in.readLine()) != null) { 
					                System.out.println(mystring); 
					            } 
					        } 
					        catch (IOException e) { 
					            System.out.println("Exception Occurred" + e); 
					        } 	 
						 adminPage();
				 }
 
			 else if(y==2) { //elektornik
				    String q1,q2,q3,q4;
				    Scanner sc4 = new Scanner(System.in);
		            System.out.println("Electronic Name: ");
			   		q1=sc4.nextLine();	
			   		System.out.println("ID: ");
			   		q2=sc4.nextLine();
			   		System.out.println("Quantity: ");
			   		q3=sc4.nextLine();
			   		System.out.println("Price: $");
			   		q4=sc4.nextLine();
				 
				 String fileName = "C:\\\\Users\\\\mmezgin\\\\Desktop\\\\Java\\\\Products\\Electronics\\"+q1+".txt"; 
			        try { 
			            BufferedWriter out = new BufferedWriter( 
			                          new FileWriter(fileName)); 
			            out.write("ID: "+q2+"	"); ///////////////////////////
			            out.close(); 
			        } 
			        catch (IOException e) { 
			            System.out.println("Exception Occurred" + e); 
			        } 
			  
			        // Let us append given str to above 
			        // created file. 
			        String str = "Quantity: "+q3+"		"+"Price: $"+q4; ////////////////////////////
			        function.appendStrToFile(fileName, str); 
			  
			        // Let us print modified file 
			        try { 
			            BufferedReader in = new BufferedReader( 
			                        new FileReader("C:\\\\Users\\\\mmezgin\\\\Desktop\\\\Java\\\\Products\\Electronics\\"+q1+".txt")); 
			  
			            String mystring; 
			            while ((mystring = in.readLine()) != null) { 
			                System.out.println(mystring); 
			            } 
			        } 
			        catch (IOException e) { 
			            System.out.println("Exception Occurred" + e); 
			        } 
				 
				 
				 
				 adminPage();

				 
				 
				 
				 
				 
				/* System.out.println("Enter an electronic name:");
				 Scanner sc2 = new Scanner(System.in);
				 p_name=sc2.nextLine();
				 
				 try {
			            File register = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics\\"+p_name+".txt");
			            if(register.createNewFile()) {
			                System.out.println("Electronic Added Succesfully !");
			            }
			            else {
			                System.out.println("Error ! This electronic '"+p_name+"' already added!");
			                adminPage();
			        }
				 }
			        catch(IOException io) {
			            io.printStackTrace();
			            
			          ///*//*/  
			        }
			
				Scanner sc3 = new Scanner(System.in);
			            System.out.println("How many quantity of: "+p_name);
				   		 q=sc3.nextLine();
				   		
				   		 
				   		FileWriter fw = null;
						try {
							fw = new FileWriter("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics\\"+p_name+".txt");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							fw.write(q);
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
						 System.out.println("Product quantity has updated !"); */
				 
						 adminPage();
				 
				 
			 }
			 else {
				 System.out.println("Incorrect selection. Please type 1 or 2");
				 adminPage();
			 }

		 }

		if (x==2) {//delete
			
			System.out.println("Choose a category to view:\n 1-Books\n 2-Electronics");
			 y=sc1.nextInt();
			 if(y==1) {
		
           File folder = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books");
           if(folder.isDirectory())
           {
               File[] fileList = folder.listFiles();

               Arrays.sort(fileList);

               System.out.println("\nTotal number of items present in the directory: " + fileList.length );


               // Lists only files since we have applied file filter
               for(File file:fileList)
               {
                   System.out.println(file.getName());
               }

               // Creating a filter to return only files.
               FileFilter fileFilter = new FileFilter()
               {
                   @Override
                   public boolean accept(File file) {
                       return !file.isDirectory();
                   }
               };

               fileList = folder.listFiles(fileFilter);

               // Sort files by name
               Arrays.sort(fileList, new Comparator()
               {
                   @Override
                   public int compare(Object f1, Object f2) {
                       return ((File) f1).getName().compareTo(((File) f2).getName());
                   }
               });
               
               
               String delete;
               Scanner sc5= new Scanner( System.in );
        	   System.out.println("Enter the name of product for delete(without taking '.txt') :" );
        	   delete=sc5.nextLine(); 
               
               try{ 
            	 
            	            	   
   	    		File file = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+delete+".txt");
   	        	
   	    		if(file.delete()){
   	    			System.out.println(file.getName() + " is deleted!");
   	    		}else{
   	    			System.out.println("Delete operation is failed.");
   	    		}
   	    	   
   	    	}catch(Exception e){
   	    		
   	    		e.printStackTrace();
   	    		
   	    	}
         
               adminPage();            
           }
           
           
           
           }
           else if (y==2) {
           	
           //	Scanner scanner = new Scanner( System.in );
 	          /*  System.out.println("Enter the file path: ");
 	            String dirPath = scanner.nextLine(); // Takes the directory path as the user input */

 	            File folder1 = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics");
 	            if(folder1.isDirectory())
 	            {
 	                File[] fileList = folder1.listFiles();

 	                Arrays.sort(fileList);

 	                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


 	                // Lists only files since we have applied file filter
 	                for(File file:fileList)
 	                {
 	                    System.out.println(file.getName());
 	                }

 	                // Creating a filter to return only files.
 	                FileFilter fileFilter = new FileFilter()
 	                {
 	                    @Override
 	                    public boolean accept(File file) {
 	                        return !file.isDirectory();
 	                    }
 	                };

 	                fileList = folder1.listFiles(fileFilter);

 	                // Sort files by name
 	                Arrays.sort(fileList, new Comparator()
 	                {
 	                    @Override
 	                    public int compare(Object f1, Object f2) {
 	                        return ((File) f1).getName().compareTo(((File) f2).getName());
 	                    }
 	                });
 	           
 	                
 	               
 	               String delete;
 	               Scanner sc5= new Scanner( System.in );
 	        	   System.out.println("Enter the name of product for delete(without taking '.txt') :" );
 	        	   delete=sc5.nextLine(); 
 	               
 	               try{ 
 	            	 
 	            	            	   
 	   	    		File file = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics\\"+delete+".txt");
 	   	        	
 	   	    		if(file.delete()){
 	   	    			System.out.println(file.getName() + " is deleted!");
 	   	    		}else{
 	   	    			System.out.println("Delete operation is failed.");
 	   	    		}
 	   	    	   
 	   	    	}catch(Exception e){
 	   	    		
 	   	    		e.printStackTrace();
 	   	    		
 	   	    	}
           
           }
               //Prints the files in file name ascending order
              /* for(File file:fileList)
               {
                   System.out.println(file.getName());
               }
		*/
		
	}
adminPage();
		}
		if(x==3) {//list
			
				 System.out.println("Choose a category to list:\n 1-Books\n 2-Electronics");
				 y=sc1.nextInt();
				 if(y==1) {
			 Scanner scanner = new Scanner( System.in );
	          /*  System.out.println("Enter the file path: ");
	            String dirPath = scanner.nextLine(); // Takes the directory path as the user input */

	            File folder = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books");
	            if(folder.isDirectory())
	            {
	                File[] fileList = folder.listFiles();

	                Arrays.sort(fileList);

	                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


	                // Lists only files since we have applied file filter
	                for(File file:fileList)
	                {
	                    System.out.println(file.getName());
	                }

	                // Creating a filter to return only files.
	                FileFilter fileFilter = new FileFilter()
	                {
	                    @Override
	                    public boolean accept(File file) {
	                        return !file.isDirectory();
	                    }
	                };

	                fileList = folder.listFiles(fileFilter);

	                // Sort files by name
	                Arrays.sort(fileList, new Comparator()
	                {
	                    @Override
	                    public int compare(Object f1, Object f2) {
	                        return ((File) f1).getName().compareTo(((File) f2).getName());
	                    }
	                });
	                adminPage();
	            }
	            }
	            else if (y==2) {
	            	
	            //	Scanner scanner = new Scanner( System.in );
	  	          /*  System.out.println("Enter the file path: ");
	  	            String dirPath = scanner.nextLine(); // Takes the directory path as the user input */

	  	            File folder1 = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics");
	  	            if(folder1.isDirectory())
	  	            {
	  	                File[] fileList = folder1.listFiles();

	  	                Arrays.sort(fileList);

	  	                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


	  	                // Lists only files since we have applied file filter
	  	                for(File file:fileList)
	  	                {
	  	                    System.out.println(file.getName());
	  	                }

	  	                // Creating a filter to return only files.
	  	                FileFilter fileFilter = new FileFilter()
	  	                {
	  	                    @Override
	  	                    public boolean accept(File file) {
	  	                        return !file.isDirectory();
	  	                    }
	  	                };

	  	                fileList = folder1.listFiles(fileFilter);

	  	                // Sort files by name
	  	                Arrays.sort(fileList, new Comparator()
	  	                {
	  	                    @Override
	  	                    public int compare(Object f1, Object f2) {
	  	                        return ((File) f1).getName().compareTo(((File) f2).getName());
	  	                    }
	  	                });
	  	              adminPage();
	            
	  	            }
	            }
	                //Prints the files in file name ascending order
	               /* for(File file:fileList)
	                {
	                    System.out.println(file.getName());
	                }
			*/
			
		}
				 if(x==4) {//list?acc
					
		          /*  System.out.println("Enter the file path: ");
		            String dirPath = scanner.nextLine(); // Takes the directory path as the user input */

		            File folder = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Accounts");
		            if(folder.isDirectory())
		            {
		                File[] fileList = folder.listFiles();

		                Arrays.sort(fileList);

		                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


		                // Lists only files since we have applied file filter
		                for(File file:fileList)
		                {
		                    System.out.println(file.getName());
		                }

		                // Creating a filter to return only files.
		                FileFilter fileFilter = new FileFilter()
		                {
		                    @Override
		                    public boolean accept(File file) {
		                        return !file.isDirectory();
		                    }
		                };

		                fileList = folder.listFiles(fileFilter);

		                // Sort files by name
		                Arrays.sort(fileList, new Comparator()
		                {
		                    @Override
		                    public int compare(Object f1, Object f2) {
		                        return ((File) f1).getName().compareTo(((File) f2).getName());
		                    }
		                });
		             
		            }
		            adminPage();
				 }
		 if(x==5) {//logout
			 System.out.println("Logged out from admin page. Directed to main menu.");
			 start.Run();
		 }
		
	}
}
