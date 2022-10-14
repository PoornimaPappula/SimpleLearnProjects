package mypackage;
//import java.io.*;     
import java.util.*;
public class LockedMe_Welcome 
{	  	
	public static void main(String[] args) 
	{
	   final int INPUT_CHOICE_MAX = 4;
	   int option,option1;
	   String File_Name = "null";
	   String path = System.getProperty("user.dir"); //To store the PWD to string variable so that path specific errors will be avoided
	   Scanner in = new Scanner(System.in); //Scanner class object creation for user inputs
			// Welcome Screen
	   System.out.println("*************************************************************************");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t\t\t Welcome to LockedMe.com \t\t\t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*\t\t\t\t\t\t\t\t\t*");
	   System.out.println("*************************************************************************");
	   System.out.println("");
	   System.out.print("Application Name: LockedMe\t       ");
	   System.out.println("Developer Name  : Pappula Poornima");
	   System.out.println("PWD:" + path);
	   System.out.println("");
	   System.out.println("****************************** Main Menu ********************************");
	   //************************ Main Menu ***************************//
	   do
	   {
		   System.out.println("\t");
		   System.out.println("Please select the appropriate actions from the below menu");
		   System.out.println("\t\t  1.To Retrive Current File Names");
		   System.out.println("\t\t  2.To perfom Business-level operations");
		   System.out.println("\t\t  3.To close the application");
		   System.out.print("Enter your choice:");
		   option = in.nextInt(); //User to input one among 3 options
		   switch(option)
		   {
			   case 1:
				   System.out.println("Files retrieval has to be implemented");
				   break;
			   case 2:				   
				   do
				   {
					 //************************ Sub Menu ***************************//
					   System.out.println("");
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
			    		   File_Name = in.next();
					   }
					   switch(option1)
					   {	   
						   case 1:
							   System.out.println(File_Name + " is created succesfully");
							   break;
						   case 2:
							   System.out.println(File_Name + " is deleted succesfully");
								break;
						   case 3:
							   System.out.println(File_Name + " is found");
							   break;
						   case 4:
							   System.out.println("Returned to main menu");
							   break;	
						   default:
							   System.out.println("Invaid choice, please select valid option");
					   }
				   }while(option1 != INPUT_CHOICE_MAX);
				   break;
			   case 3:
				   System.out.println("Exiting from the application");
				   return; //System.exit(0);
			   default:
					  System.out.println("Invaid choice, please select valid option");	   
			}
	   }while(option != 3); //To run the main menu continuously until user selects option as exit
	   in.close();
	}
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
   
   
   
   
   
   
   
   
 
   
   
   
   
   
   
   
   
   
   
  