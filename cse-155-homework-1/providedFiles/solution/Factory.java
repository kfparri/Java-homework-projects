/**
 * Factory class defines a factory that churns out non-human objects.
 * Presently, the factory only produces orcs.
 * This factory can produce "dummy" orcs specified by any amount.  And, this
 * factory can also customized orcs based on user specification.
 * CSCE 155 Spring 2005
 * Assignment 1
 * @author Diane Nolan
 * @version 1.0
 */

// import statements
import java.io.*;

public class Factory  {

   /**
    * This main method creates an object of the Factory class and runs the
    * factory.  First, it asks the factory object to display a welcome message.
    * Then it asks the factory object to interact with the user. Finally, it
    * asks the factory object to display a good-bye message.
    */

   public static void main(String[] args)  {

      Factory myFactory = new Factory();
      myFactory.displayWelcome();
      myFactory.interactWithUser();
      myFactory.displayGoodbye();

   }  // end main
	
   // -------------------------------------------------------------------------
   // Data members to describe a factory. Not all implemented.
   // -------------------------------------------------------------------------
   
   private int productionMode;   // indicates how to generate orcs
   private int productionTotal;  // indicates how many orcs to mass produce
 	private double factoryArea;	// indicates the square footage of the building
	private String factoryLocation;	//indicates the address of the factory
	private int numberEmployees;	// indicates current employment of factory

	 /**
    * This method reads in a string and converts the string into an integer and
    * returns that integer to the caller of this method.
    */

   private int readInteger()  {

      String userInput = "";
      int temp = 0;

      BufferedReader stdin = 
         new BufferedReader(new InputStreamReader(System.in), 1);

      try {
         userInput = stdin.readLine();
         temp = Integer.parseInt(userInput);  // convert to integer
      }  catch (IOException ex) {
         System.out.println(ex);
         }
			catch (NumberFormatException inv){   //check for invalid characters, ADDED
			System.out.println("Invalid Entry. Please try again.");
			return readInteger();
		}
	     	return temp;

   }  // end readInteger
         
   /**
    * This method reads in a string and returns that string to the caller of 
    * this method.
    */

	private String readString()  {

      String userInput = "";

      BufferedReader stdin = 
         new BufferedReader(new InputStreamReader(System.in), 1);
      try {
         userInput = stdin.readLine();
      }  catch (IOException ex) {
         System.out.println(ex);
         }

      return userInput;

   }  // end readString

   /**
    * This method displays a welcome message to the user.
    */
   public void displayWelcome()  {
      // Welcome message, will need method to change factory number when more
		// factories come online 
		System.out.println("Welcome to Orc Factory # 1");	
		System.out.println("Manufacturers and Purveyors of Quality Orcs Since 2005");
		System.out.println("Individually Customized or Mass Produced");
		System.out.println("Place as Many Orders as You Like");  //Extra Credit
		System.out.println("");		 // spacing output
	}  // end displayWelcome

   /**
    * This method obtains the production mode from the user.  It calls
    * readInteger() to obtain the mode.  1 means "mass production", "2" means
    * "customized production".    This method does not return anything.
    */

	public void obtainProductionMode()  {

     // 1.  Prompt the user to enter a number.
		System.out.println("To mass produce Orcs, enter 1; to individually customize an Orc, enter 2");  
		    
     // 2.  Call "readInteger()" to get the number. 
	  	int choice =  readInteger();  // or could use: productionMode = readInteger();
		
	  // 3.  Set "productionMode" of the factory to that number
		productionMode = choice;
		
	}  // end obtainProductionMode

   /**
    * This method interacts with the user to obtain the number of orcs the
    * factory is to produce.  It stores the number in "productionTotal" and
    * returns a message about the order.  It does NOT create the orcs. After acquiring 
	 * the order, it call orderOption to see if the customer wants to place another.
    */

   public void specifyMassProduction()  {

      // 1.  Prompt the user for the number of orcs wanted.
		System.out.println("How many Orcs would you like us to provide?");
		
		// 2.  Call "readInteger()" to get the number.
		int choice = readInteger();
		
      // 3.  Then set "productionTotal" of the factory to that number
		productionTotal = choice;
		System.out.println("You have ordered " + productionTotal + " Orcs, they will be ready next Tuesday.");

		//Call orderOption to see if the order is complete.
		orderOption(); 
		
	}  // end specifyMassProduction
	
   /**
    * This method interacts with the user to determine if multiple orders are to be placed.
    */

	public void orderOption() {
		System.out.println("");		// spacing output
		System.out.println("Do you wish to place another order? Enter 1 for yes, 2 for no.");
		int option = readInteger();
			// option 1 calls interactWithUser to place another order
			if (option == 1) {
				interactWithUser();
			}
			// option 2 allows program to proceed to good-bye message
			else if (option == 2) {
			}
			 // if something other than 1 or 2 is entered, prints an error message and asks for correction.			
			else { 
			  	System.out.println("Invalid Option. Enter 1 or 2 only.");
				orderOption();
				return;
			}	
	}	// end orderOption				


   /**
    * This method tests the orc behavior.  It asks the orc to do all the things that an orc is
    * supposed to do.  
    * @argument It takes an Orc object as input.
    */

   public void testOrcBehavior(Orc newOrc)  {

      //  Find out what things an orc can do from Orc.java.
		//  Then "ask" the orc to do those things one at a time.
		newOrc.run(1);
		newOrc.run(2);
		newOrc.run(3);
		newOrc.run(4);
		newOrc.walk(1);
		newOrc.growl(1);
		newOrc.walk(2);
		newOrc.growl(2);
		newOrc.speak("test",1);
		newOrc.walk(3);
		newOrc.growl(3);
		newOrc.speak("test",2);
		newOrc.walk(4);
		newOrc.growl(4);
		newOrc.speak("test",3);
		newOrc.walk(5);
		newOrc.fight(1);
		newOrc.fight(2);
		newOrc.fight(3);
		newOrc.fight(4);
		newOrc.speak("test",4);
		newOrc.growl(5);
	}  // end testOrcBehavior

   /**
    * This method interacts with the user to obtain specific information about
    * a customized orc that he/she wants the factory to make.
    * Unlike the mass production, this method actually takes the specification
    * and builds an orc.
    */

   public void specifyCustomizedProduction()  {

      // 1.  Prompt the user for the specification of an orc that they want to build.
		System.out.println("Create your Orc, please choose his characteristics:");
		
      //     a.  Instantiate an orc object first
		Orc myOrc = new Orc();  // this creates one orc with default settings. 

		/*  Interact with the customer using println and readString or readInteger
		`	to set the data elements for this customized Orc.
		*/
		
		System.out.println("Name? "); 		//  b.  Prompt the user for name of orc
		String newName = readString();		//  c.  Call "readString()" to get the name of the orc.
		myOrc.setName(newName);     			//  d.  Set the name of our orc object to the new name.

   /* -------------------------------------------------------------------------
		For each data member, we repeat the process above.  For those data members requiring a
		numeric response, we use readInteger instead of readString.
		-------------------------------------------------------------------------*/

		System.out.println("Height in whole centimeters?");
		int newHeight = readInteger();
		myOrc.setHeight(newHeight);
		
		System.out.println("Weight in whole kilograms? ");
		int newWeight = readInteger();
		myOrc.setWeight(newWeight);
		
		System.out.println("Weapon used? Choose from fists, sword, saber, schmitar, bow and arrow, or club.");
		String newWeaponUsed = readString();
		myOrc.setWeaponUsed(newWeaponUsed);
		
		System.out.println("Armor used? Choose from none,leather,iron,chain-mail,magic.");
		String newArmorUsed = readString();
		myOrc.setArmorUsed(newArmorUsed);

		System.out.println("How ugly? Enter an integer from 1 to 10, with 10 being extremely ugly, and being okay.");
		int newUgliness = readInteger(1,10);
		myOrc.setUgliness(newUgliness);

		System.out.println("Color of blood? blue, yellow, green, or orange.");
		String newBloodColor = readString();
		myOrc.setBloodColor(newBloodColor);

		System.out.println("How strong? Enter integer from 1 to 10, 1 being easily defeated, 10 being invincible.");
		int newStrength = readInteger(1,10);
		myOrc.setStrength(newStrength);

		System.out.println("How intelligent? Enter integer from 1 to 10, 1 being sub-Orc intelligence, 10 sub-human intelligence");
		int newSmarts = readInteger(1,10);
		myOrc.setSmarts(newSmarts);
		
		System.out.println("You have ordered a customized Orc, you may pick him up next Tuesday, after your check clears the bank.");
		System.out.println("");		// spacing output
		
		System.out.println("Creating your orc . . . check to see if you like him. "); 
		System.out.println("");		// spacing output
		
      // 3.  Then, ask the orc object to printout the information about
      //     itself -- think about the method that you should use. Check out
      //     the Orc.java file!  Get this done correctly.
		myOrc.printInfo();
		System.out.println("");		// spacing output
		System.out.println("Does he meet your requirements?  Enter 1 if he is okay, 2 if you want to change choices.");
			int test;
			test = 0;
			while (test != 1 && test != 2) {
			test = readInteger();
			if (test == 1){
			}
			else if(test == 2) {
				specifyCustomizedProduction();
				return;
			}
			else {
				System.out.println("Invalid Entry. Please try again.");
			}
		}
		System.out.println("");		// spacing output
			
      // 4.  Finally, the factory needs to "quality control" the just produced
      //     orc.  It does this by calling "testOrcBehavior()".
		System.out.println("Let's see how he will work...");
		testOrcBehavior(myOrc);
		
		System.out.println("");		// spacing output
		
		orderOption();  //Call orderOption to see if the order is complete				


  } // end specifyCustomizedProduction
// new method:  limit to 1 to 10
	public int readInteger(int min, int max) {
 		int number = readInteger()	;
		if (number < min || number > max) {
		System.out.println("Invalid Entry. Number must be between " + min + " and " + max + ".");
		number = readInteger(min, max);
		}
		return number;
	}  // end readInteger
	
   /**
    * This method interacts with the user to obtain specifications.
    * There are two modes: "mass production" or "customized production"
    * To obtain the production mode, this method calls another method
    * "obtainProductionMode".
    * If the production mode is 1, then this method calls
    * "specifyMassProduction()".  If the production mode is 2, then this method
    * calls "specifyCustomizedProduction()".  Otherwise, it prints out an error
    * message.  
    * Assumption: Here we assume that production mode = 1 means "mass
    * production", and 2 means "customized production".
    */

   public void interactWithUser()  {

      // 1.  Call "obtainProductionMode()" to obtain the mode.
		obtainProductionMode();
      	if (productionMode == 1)  {  // mass produce
         //  1. Call "specifyMassProduction()
				specifyMassProduction();
      }
			else if (productionMode == 2)  {  // customize
         //  1. Call "specifyCustomizedProduction()
				specifyCustomizedProduction();
      }
			else {
         	System.out.println("Invalid input. Enter 1 or 2 only.");
			   interactWithUser();
      }
   }  // end interactWithUser


   /**
    * This method displays a goodbye message to the user.
    */
   public void displayGoodbye()  {

      /* Display a brief goodbye message from the factory */
		System.out.println("Thank you for your order, see you on Tuesday!");

   }  // end displayGoodbye
}  // end class Factory
