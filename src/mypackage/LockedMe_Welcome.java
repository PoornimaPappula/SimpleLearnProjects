package mypackage;
import java.io.*;     
import java.util.*;
public class LockedMe_Welcome 
{
	/********************************* File Search Function *******************************/
	static boolean FileFound(String file, ArrayList<File> filesList) 
	{
	    for(File i: filesList) 
	    {
	        if (i.getName().equals(file)) 
	        {
	            return true;
	        }
	    }
	    return false;
	}
	/******************** Update the array list based on files change **********************/	
	static void UpdateArrayList(ArrayList<File> ArrayListofFiles, File[] ListofFiles, int NoofFiles) 
	{
  	   ArrayListofFiles.clear();	
	   for (int i = 0; i < NoofFiles; i++) 
       {
    	   ArrayListofFiles.add(i,ListofFiles[i]);
       }
	}
	/********************************** Main method ***************************************/	
	public static void main(String[] args) 
	{
	   final int INPUT_CHOICE_MAX = 4;
	   int option,option1,no_of_files;  
	   String filename = "null",path = System.getProperty("user.dir"); //To store the PWD to string variable so that path specific errors will be avoided
	   Scanner in = new Scanner(System.in); //Scanner class object creation for user inputs
	   File fo1 = new File(path); 
	   File[] list_of_files;	
	   ArrayList<File> array_list_of_files = new ArrayList<File>();
	/********** File Filter for only files and not to start files start with "." *********/
	   FileFilter filter = new FileFilter() 
	   {
		   @Override
		   public boolean accept(File file) 
		   {
			   if(file.isFile() && file.getName().startsWith(".") == false)
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
	   }; 
   /************************************ Welcome Screen ***********************************/
	   System.out.println("*************************************************************************");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t     Welcome to Virtual Key for Your Repositories    \t \t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*************************************************************************");
	   System.out.println("");
	   System.out.print("Application Name: LockedMe.com\t       ");
	   System.out.println("Developer Name  : Pappula Poornima");
	   System.out.println("PWD:" + path);
	   System.out.println("");
	   do
	   {
		   System.out.println("\t");
		   System.out.println("****************************** Main Menu ********************************");
		   System.out.println("Please select the appropriate actions from the below menu");
		   System.out.println("\t\t  1.To Retrive Current File Names");
		   System.out.println("\t\t  2.To perfom Business-level operations");
		   System.out.println("\t\t  3.To close the application");
		   System.out.print("Enter your choice:");
		   option = in.nextInt(); //User to input one among 3 options
		   switch(option)
		   {
			   case 1:		         
					list_of_files = fo1.listFiles(filter);  
				    no_of_files = list_of_files.length;
				    if(no_of_files != array_list_of_files.size())
				    {
				    	UpdateArrayList(array_list_of_files,list_of_files,no_of_files);
				    }
		            Collections.sort(array_list_of_files);
			        for (File i : array_list_of_files)
			        {
			            System.out.println(i.getName());
			        }	
				   break;
			   case 2:				   
				   do
				   {
					 //************************ Sub Menu ***************************//
					   System.out.println("");
					   System.out.println("****************************** Sub Menu ********************************");
					   System.out.println("Please select the action from the below sub-menu");
					   System.out.println("\t\t  1.To add file");
					   System.out.println("\t\t  2.To delete a file");
					   System.out.println("\t\t  3.To search a file");
					   System.out.println("\t\t  4.To return to main menu");
					   System.out.print("Enter your choice:");
					   option1 = in.nextInt();// User to input one among 4 options
					   if(option1 < INPUT_CHOICE_MAX) //To reduce code memory
					   {
			    		   System.out.print("Please enter the file name: ");  
			    		   filename = in.next();
			    		   while(filename.startsWith("."))
			    		   {
				    		  System.out.print("Please enter valid file name: ");  
				    		  filename = in.next();
			    		   }
					   }
		    		   File fo = new File(path + File.separator + filename);
					   switch(option1)
					   {
						   case 1:
							   try {
								   	if (fo.createNewFile()) {  
					                   System.out.println("File " + fo.getName() + " is created successfully.");  
					               } else {  
					                   System.out.println("File is already exist in the directory.");  
					               } 
						       } catch (IOException exception) {  
						           System.out.println("Unexpected error occurred!");  
						           exception.printStackTrace();  
						       } 
							   break;
						   case 2:
							   if (fo.delete()) 
							   {   
							        System.out.println("File " + fo.getName()+ " is deleted successfully.");  
							   } 
							   else 
							   {  
							        System.out.println("File doesn't exist in the current working directory");  
							   } 
							   break;
						   case 3:
							   if (FileFound(filename, array_list_of_files)) //Invoking FileFound method
							   {
								   System.out.println("File found");
							   } 
							   else 
							   {
							    	System.out.println("File not found in the current working directory");
						       }
							   break;
						   case 4:
							   System.out.println("Returned to main menu \n");
							   break;	
						   default:
							   System.out.println("Invaid choice, please select the valid option");
					   }
				   }while(option1 != INPUT_CHOICE_MAX);
				   break;
			   case 3:
				   System.out.println("Exiting from the application");
				   return; 
			   default:
					  System.out.println("Invaid choice, please select the valid option");	   
			}
	   }while(option != 3); //To run the main menu continuously until user selects option as exit
	   in.close();
	}
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
   
   
   
   
   
   
   
   
 
   
   
   
   
   
   
   
   
   
   
  