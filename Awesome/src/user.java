import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.nio.file.Path;

public class user<dateFormat> {
	static int k=0,l;
	public static void add2card() {
		
		
		
		 String sCurrentLine1=null;
		int z;
		 Scanner z1 =new Scanner(System.in);
        String p_name;
		 System.out.println("Enter a product name (without .txt )to add your card !");
		 Scanner sc2 = new Scanner(System.in);
		 p_name=sc2.nextLine();
		 
		 try {
	            File register = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Card\\"+p_name+".txt");
	            if(register.createNewFile()) {
	                System.out.println("Item Added to Card Succesfully");
	            }
	            else {
	                System.out.println("Error ! This electronic '"+p_name+"' already added!");
	                add2card();
	        }
		 }
	        catch(IOException io) {
	            io.printStackTrace();
	            
	     
	        }
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+p_name+".txt"))) {

				

				while ((sCurrentLine1 = br.readLine()) != null) {
					
					 sCurrentLine1.substring(sCurrentLine1.indexOf("$") + 1);
	                
					 System.out.println( l = Integer.parseInt( sCurrentLine1));
	            
	            
					
				}

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("There is no item name with like that !");
				
			}
		 
		 
		 String sCurrentLine2=null;
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\total.txt"))) {

				

				while ((sCurrentLine2 = br.readLine()) != null) {
					
					 sCurrentLine2.substring(sCurrentLine2.indexOf("") + 1);
	{
					 k = Integer.parseInt( sCurrentLine2);
					 System.out.println( k = Integer.parseInt( sCurrentLine2));
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("There is no item name with like that !");
			
			}
		 
		
		 k=k+l;
		 
		 
		 String fileName = "C:\\Users\\\\mmezgin\\\\Desktop\\\\Java\\\\total.txt"; 
	        try { 
	            BufferedWriter out = new BufferedWriter( 
	                          new FileWriter(fileName)); 
	            out.write(k); ///////////////////////////
	            out.close(); 
	            System.out.println(k);
	        } 
	        catch (IOException e) { 
	            System.out.println("Exception Occurred" + e); 
	        } 
			
		}
		}

		public static void buy() {
			String c1;
			 System.out.println("Type name of product AGAIN (without .txt)");
			 
			 Scanner sc10= new Scanner(System.in);
			 c1=sc10.nextLine();
			 String sCurrentLine=null;
			 
			 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+c1+".txt"))) {

					

					while ((sCurrentLine = br.readLine()) != null) {
						
						 sCurrentLine.substring(sCurrentLine.indexOf("$") + 1);
	{
						
					
						}
					}

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("There is no item name with like that !");
					add2card();
				}
			 
		 
		 
		 
		 
		 
		
		
				Scanner z1 = new Scanner();	
	 System.out.println("Type (1) to add more item(s),Type (2) to return back to main menu,Type (3) to add more item(s)");
	 z=z1.nextInt(System.in);
	 if(z==1) {
		add2card();
	 }
	 else if(z==2){
		 userPage();
	 }

	}
	
	public static void listall() {
		
		System.out.println("Books\n");
        File folder = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books");
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

           


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
		 
            System.out.println("Electronics\n");
            
            File folder1 = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics");
	            if(folder1.isDirectory())
	            {
	                File[] fileList1 = folder1.listFiles();

	                Arrays.sort(fileList1);

	              


	                // Lists only files since we have applied file filter
	                for(File file:fileList1)
	                {
	                    System.out.println(file.getName());
	                }

	                // Creating a filter to return only files.
	                FileFilter fileFilter1 = new FileFilter()
	                {
	                    @Override
	                    public boolean accept(File file) {
	                        return !file.isDirectory();
	                    }
	                };

	                fileList1 = folder1.listFiles(fileFilter);

	                // Sort files by name
	                Arrays.sort(fileList, new Comparator()
	                {
	                    @Override
	                    public int compare(Object f1, Object f2) {
	                        return ((File) f1).getName().compareTo(((File) f2).getName());
	                    }
	                });
	            }
        }
		
	}
	
	
public static void userPage() {
		
	int x,y;
	String q;
	String p_name;
	@SuppressWarnings({ "resource" })
	Scanner sc1 = new Scanner(System.in);
	 System.out.println("Choose one:\n 1-List All Products \n 2-List Products by type \n 3-Get Description for a product \n 4-Add To My Cart\n 5-Cancel an item \n 6-Buy items \n 7-Show my history\n 8- Log out");
	 x=sc1.nextInt();
	 if(x==1) {		 
		 listall();		
		 userPage();
	}
	 if(x==2) {
		 
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
            userPage();
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
	              
	                userPage();
	            }
        }
		 
		 
		 
	 }
}
	 if(x==3) {//
listall();
		 String p_namee;
		 Scanner sc3 = new Scanner(System.in);
		 System.out.println("Choose a category:\n 1-Books\n 2-Electronics");
		 y=sc3.nextInt();
		 if(y==1) {
			 Scanner sc23 = new Scanner(System.in);
         System.out.println("Type the name of product for description ");
	   		 p_namee=sc23.nextLine();
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+p_namee+".txt"))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					
					System.out.println(sCurrentLine);
{
					
					}
				}

			} catch (IOException e21) {
				e21.printStackTrace();
			}
		
		 
		 
		 }
		 if(y==2) {
			 Scanner sc233 = new Scanner(System.in);
			 System.out.println("Type the name of product for description ");
	   		 p_namee=sc233.nextLine();
		 
		 try (BufferedReader b1r = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Electronics\\"+p_namee+".txt"))) {

				String sCurrentLine;

				while ((sCurrentLine = b1r.readLine()) != null) {
					
					System.out.println(sCurrentLine);
{
					
				
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		 
		 
		 
		 }
		 
	 }
}
	 if(x==4) {
		
		 listall();
		
		 add2card();
		 
		 userPage();
			 
		 
	 }
	 
	 if(x==5) {//cancel item
		 System.out.println("Choose a category to view:\n 1-Books\n 2-Electronics");
		 y=sc1.nextInt();
		 if(y==1) {
	
       File folder = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Card");
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
        	      	            	   
	    		File file = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Card\\"+delete+".txt");
	        	
	    		if(file.delete()){
	    			System.out.println(file.getName() + " is deleted!");
	    		}else{
	    			System.out.println("Delete operation is failed.");
	    		}
	    	   
	    	}catch(Exception e){
	    		
	    		e.printStackTrace();
	    		
	    	}
           
                   
       }
       
       }
		    
         
         }
   
	 if (x==6)//Buy Item
	 {

			System.out.println("Books\n");
	        File folder1 = new File("C:\\Users\\mmezgin\\Desktop\\Java\\Card");
	        if(folder.isDirectory())
	        {
	            File[] fileList = folder.listFiles();

	            Arrays.sort(fileList);

	           


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
		 
		 
		 
		 String c1;
		 System.out.println("Type name of product AGAIN (without .txt)");
		 
		 Scanner sc10= new Scanner(System.in);
		 c1=sc10.nextLine();
		 String sCurrentLine=null;
		 
		 try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mmezgin\\Desktop\\Java\\Products\\Books\\"+c1+".txt"))) {

				

				while ((sCurrentLine = br.readLine()) != null) {
					
					 sCurrentLine.substring(sCurrentLine.indexOf("$") + 1);
{
					
				
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("There is no item name with like that !");
				add2card();
			}
		 
		
		
	}
	 }
	 if(x==7) {
		 System.out.println("Buy History of"+username);
		 dateFormat df = (dateFormat) new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 Date d = new Date(0);
		 File history = new File("C:\\Users\\mmezgin\\Desktop\\Java\\history.txt");
		 PrintWriter pw2;
		 try {
			 pw2= new PrintWriter(new FileWriter(history,true));
			 System.out.println("Item bought at"+df);
		 }
		 
		 catch(IOException e1){
			 e.printStackTrace();
		 }
	 }
	 if(x==8) {
		 System.out.println("Logged out from your account. Directed to main menu.");
		 start.Run();
	 }
}
}
	 



