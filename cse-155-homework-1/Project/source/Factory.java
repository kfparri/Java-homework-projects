/**
 * Factory class defines a factory that churns out non-human objects.
 * Presently, the factory only produces orcs.
 * This factory can produce "dummy" orcs specified by any amount.  And, this
 * factory can also customized orcs based on user specification.
 * CSCE 155 Spring 2005
 * Assignment 1
 * @author     Kyle Parrish
 * @version    1.0
 */

// import statements
import java.io.*;

public class Factory  
{
   // -------------------------------------------------------------------------
   // You may add data members to the following to describe a factory.  Right
   // now, the factory has only two data members.
   // -------------------------------------------------------------------------
   
   private int productionMode;   // indicates how to generate orcs
   private int productionTotal;  // indicates how many orcs to mass produce
  
   /**
    * This method reads in a string and converts the string into an integer and
    * returns that integer to the caller of this method.
    */

   private int readInteger()  
   {
      String userInput = "";
      int temp = 0;

      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);

      try 
      {
         userInput = stdin.readLine();
         temp = Integer.parseInt(userInput);  // convert to integer
      }  
      catch (IOException ex) 
      {
         System.out.println(ex);
      }

      return temp;
   }
         
   /**
    * This method reads in a string and returns that string to the caller of 
    * this method.
    */

   private String readString()  
   {
      String userInput = "";

      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
      try 
      {
         userInput = stdin.readLine();
      }  
      catch (IOException ex) 
      {
         System.out.println(ex);
      }

      return userInput;
   }

   /**
    * This method displays a welcome message to the user.
    */
   public void displayWelcome()  
   {
      System.out.println("Welcome to the Orc produciton factory!");
      System.out.println("This factory will create specific orc or mass produce orcs!");
   }

   /**
    * This method obtains the production mode from the user.  It calls
    * readInteger() to obtain the mode.  1 means "mass production", "2" means
    * "customized production".    Note that this method does not return
    * anything.
    * Yet to be implemented.
    */

   public void obtainProductionMode()  
   {
      int temp;
      
      while(true) 
      {
         temp = 0;
         
         System.out.print("Please select production mode 1 for mass production and 2 for customized production: ");
         temp = readInteger();
         if(temp == 1 || temp == 2)
         {
            break;
         }
         else
         {
            System.out.println("You must choose either 1 or 2");
         }
      }
      
      productionMode = temp;
      // 1.  Prompt the user to enter a number.
      // 2.  Call "readInteger()" to get the number.
      // 3.  Then set "productionMode" of the factory to that number
      //
   }

   /**
    * This method interacts with the user to obtain the number of orcs that
    * he/she wants the factory to churn out.  It then stores the number in
    * "productionTotal".
    * It simply specifies, and does not actually create the orcs. 
    * Yet to be implemented.
    */

   public void specifyMassProduction()  
   {
      // 1.  Prompt the user for the number of orcs that they want to have.
      // 2.  Call "readInteger()" to get the number.
      // 3.  Then set "productionTotal" of the factory to that number
   }

   /**
    * This method tests the orc behavior.  It asks the orc to do all the 
    * things that an orc is supposed to do.  
    * @argument It takes an Orc object as input.
    * Yet to be implemented.
    */

   public void testOrcBehavior(Orc newOrc)  
   {
      //  Find out what things an orc can do from Orc.java.
      //  Then here, "ask" the orc to do those things one at a time.
   }

   /**
    * This method interacts with the user to obtain specific information about
    * a customized orc that he/she wants the factory to make.
    * Unlike the mass production, this method actually takes the specification
    * and builds an orc.
    * Yet to be implemented.
    */

   public void specifyCustomizedProduction()  
   {
      // 1.  Prompt the user for the specification of an orc that they want to
      //     build.  Must do this for each data member that an orc has.
      //     For example:
      //     a.  Instantiate an orc object first
      //     b.  Prompt the user for name of orc
      //     c.  Call "readString()" to get the name of the orc.
      //     d.  Set the name of our orc object to the new name.
      // 2.  Repeat the above steps b, c, d for each data member.  You may 
      //     have to use "readInteger()" for some data members.
      // 3.  Then, ask the orc object to printout the information about
      //     itself -- think about the method that you should use. Check out
      //     the Orc.java file!  Get this done correctly.
      // 4.  Finally, the factory needs to "quality control" the just produced
      //     orc.  It does this by calling "testOrcBehavior()".
    
      System.out.println("Customizing an orc ...");

      Orc customizedOrc = new Orc();  // this creates one orc but with 
                                      // default settings.    
      //
      // here you need to implement the interaction to obtain the specification
      //
      // here you need to printout the information about the orc
      
      testOrcBehavior(customizedOrc); // call to test whether the orc is alive!
   }

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
    * Not completely implemented.
    */

   public void interactWithUser()  
   {
      // 1.  Call "obtainProductionMode()" to obtain the mode.
      //
      obtainProductionMode();
      
      if (productionMode == 1)  
      {  
         // mass produce
         //  1. Call "specifyMassProduction()
        specifyMassProduction();
      } 
      else if (productionMode == 2)  
      {  
         // customize
         //  1. Call "specifyCustomizedProduction()
        specifyCustomizedProduction();
      } 
      else 
      {
         System.out.println("Wrong input.  Program terminates.");
      }
   }


   /**
    * This method displays a goodbye message to the user.
    */
   public void displayGoodbye()  
   {
      /* Display a brief goodbye message from the factory */
   }

   /**
    * This main method creates an object of the Factory class and runs the
    * factory. First, it asks the factory object to display a welcome message.
    * Then it asks the factory object to interact with the user. Finally, it
    * asks the factory object to display a good bye message.
    */

   public static void main(String[] args)  
   {
      Factory myFactory = new Factory();
      myFactory.displayWelcome();
      myFactory.interactWithUser();
      myFactory.displayGoodbye();
   }
}
