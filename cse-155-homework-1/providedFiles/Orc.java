/**
 * Orc class defines an Orc's characteristics/features and behavior
 * CSCE 155 Spring 2005
 * Assignment 1
 * @author
 * @version
 */

// import statements
import java.io.*;

public class Orc  {


   // -------------------------------------------------------------------------
   // You may add more data members to the following to describe an orc.
   // -------------------------------------------------------------------------

   // private data members -- variables

   private String name;
   private double height;      // in centimeters
   private double weight;      // in kilograms
   private String weaponUsed;  // "sword", "saber", "schmitar", "arrow",
                               // "club", etc.
   private String armorUsed;   // "leather", "iron", "magic", etc.
   private int ugliness;       // from 1 to 10, 10 being extremely ugly, and 
                               // 1 being okay.
   
   // private data members -- constants
   private final double DEFAULT_HEIGHT = 170.0;  
   private final double DEFAULT_WEIGHT = 100.0;  
   private final String DEFAULT_WEAPON_USED = "club"; 
   private final String DEFAULT_ARMOR_USED = "leather"; 
   private final int DEFAULT_UGLINESS = 5; 

   // --------------------------------------------------------------------------
   // Here are the public and private methods that describe the things that the
   // orc will do.  First of all, an orc will provide information for you, will
   // allow you to change its settings, and will also do quite a bit of other
   // things.  You may add new methods.
   // --------------------------------------------------------------------------

   /** Constructor
    *  initialize all private data members to appropriate values
    *  If you add more data members, you will have to initialize them here
    *  too.
    */
   public Orc()  {

      name = "dummy";
      height = DEFAULT_HEIGHT;
      weight = DEFAULT_WEIGHT;
      weaponUsed = DEFAULT_WEAPON_USED;
      armorUsed = DEFAULT_ARMOR_USED;
      ugliness = DEFAULT_UGLINESS;

   }  // end constructor

   // --------------------------------------------------------------------------
   // For each of the following "get" and "set" methods, you must provide 
   // comments and complete the implementation.  
   // --------------------------------------------------------------------------

   public String getName()  {

      return name;

   }

   public void setName(String newName)  {

      name = newName;

   }

   public double getHeight()  {

      return height;
   }

   public void setHeight(double newHeight)  {

   }

   public double getWeight()  {

      return weight;
   }

   public void setWeight(double newWeight)  {

   }

   public String getWeaponUsed()  {

      return weaponUsed;
   }

   public void setWeaponUsed(String newWeapon)  {

   }

   public String getArmorUsed()  {

      return armorUsed;
   }

   public void setArmorUsed(String newArmor)  {

   }

   public int getUgliness()  {

      return ugliness;

   }

   public void setUgliness(double newUgliness)  {

   }

   /**
    * This method prints out the characteristics of an orc object.
    * If you added new data members in the above, then you should also modify
    * this method.
    */
   public void printInfo()  {

      System.out.println("Information of Orc:");
      System.out.println("Name           : " + name);
      System.out.println("Height         : " + height);
      System.out.println("Weight         : " + weight);
      System.out.println("Weapon Used    : " + weaponUsed);
      System.out.println("Armor Used     : " + armorUsed);
      System.out.println("Ugliness       : " + ugliness);
      System.out.println("End Information of Orc:");

   }  // end printInfo

   // --------------------------------------------------------------------------
   // In the following, we will just have some "simulated" methods since you do
   // do not have enough background to actually implement the following
   // behavior.  Our simulation is simply to printout a statement "performing"
   // an action.  The method "run()" has already been completed for you.  You
   // must complete the others.  Use your imagination!
   // --------------------------------------------------------------------------

   /**
    * This method carries out the "running" process of an Orc.
    * Presently, we simulate the running using a series of print statements.
    */

   public void run()  {

      System.out.println("Running -- starting out clumsily");
      System.out.println("Running -- darting left and right, arms swinging");
      System.out.println("Running -- picking up speed, 5 km/hour");
      System.out.println("Running -- stopping after 5 minutes");

   }

   public void fight()  {

   }

   public void walk()  {

   }

   public void growl()  {

   }

   public void speak(String whatToSay)  {


   }

}  // end Class Orc
