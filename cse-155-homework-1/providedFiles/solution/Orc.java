/**
 * Orc class defines an Orc's characteristics/features and behavior
 * CSCE 155 Spring 2005
 * Assignment 1
 * @author Diane Nolan
 * @version 1.0
 */

// import statements
import java.io.*;

// Declaration of the class Orc
public class Orc  {

   // --------------------------------------------------------------------------
   // Here are the public and private data members that are the characteristics of 
	// the orc.  
   // --------------------------------------------------------------------------
	
   // private data members -- variables
   private String name;
   private double height;      // in centimeters
   private double weight;      // in kilograms
   private String weaponUsed;  // "sword", "saber", "schmitar", "arrow",
                               // "club", etc.
   private String armorUsed;   // "leather", "iron", "magic", etc.
   private int ugliness;       // from 1 to 10, 10 being extremely ugly, and 
                               // 1 being okay.
	private String bloodColor;     // "blue", "yellow", "green" or "orange"
	private int strength;		 // from 1 to 10, 1 being easily defeated, 10 being invincible 
	private int smarts;		    // from 1 to 10, 1 being sub-Orc intellect, 10 sub-human intellect  
	 
   // private data members -- constants
   private final double DEFAULT_HEIGHT = 170.0;  
   private final double DEFAULT_WEIGHT = 100.0;  
   private final String DEFAULT_WEAPON_USED = "club"; 
   private final String DEFAULT_ARMOR_USED = "leather"; 
   private final int DEFAULT_UGLINESS = 5; 
	private final String DEFAULT_BLOODCOLOR = "orange";
	private final int DEFAULT_STRENGTH = 3;
	private final int DEFAULT_SMARTS = 3;
	
   // --------------------------------------------------------------------------
   // Here are the public and private methods that describe the things that the
   // orc will do.  An orc will provide information for you, will allow you to
   // change its settings, and several other things. 
   // --------------------------------------------------------------------------

   /** Constructor
    *  initializes all private data members to appropriate values
   */
   public Orc()  {

      name = "dummy";
      height = DEFAULT_HEIGHT;
      weight = DEFAULT_WEIGHT;
      weaponUsed = DEFAULT_WEAPON_USED;
      armorUsed = DEFAULT_ARMOR_USED;
      ugliness = DEFAULT_UGLINESS;
		strength = DEFAULT_STRENGTH;
		bloodColor = DEFAULT_BLOODCOLOR;
		smarts = DEFAULT_SMARTS;
		
}  // end constructor

   // --------------------------------------------------------------------------
   // The following "get" and "set" methods are placed in pairs to ensure both 
	// are set for each data member.  They do not need to appear in pairs.
	// --------------------------------------------------------------------------

   public String getName() {								//Accesses current Name
      return name;											//Makes it available
   } 	// end getName
   public void setName(String newName) {				//Assigns new name
      name = newName;
   }	// end setName

   public double getHeight() {							//Accesses current height and
      return height;											//Makes it available
   }	// end getHeight
   public void setHeight(double newHeight) {			//Assigns new height
			height = newHeight;
   }	// end setHeight
	
   public double getWeight() {							//Accesses current weight
      return weight;											//Makes it available
   }	// end getWeight 
   public void setWeight(double newWeight) {			//Assigns new weight
		weight = newWeight;
   }	// end setWeight 

   public String getWeaponUsed() {						//Accesses current weaponUsed
      return weaponUsed;									//Makes it available
   } 	// end getWeaponUsed
	public void setWeaponUsed(String newWeapon) {	//Assigns new weaponUsed
		weaponUsed = newWeapon;
   }	// end setWeaponUsed

   public String getArmorUsed() {						//Accesses current armorUsed
      return armorUsed;										//Makes it available
   }	// end getArmorUsed
   public void setArmorUsed(String newArmor) {		//Assigns new armorUsed
		armorUsed = newArmor;
   }	// end setArmorUsed

   public int getUgliness() {								//Accesses current ugliness
      return ugliness;										//Makes it available
	}	// end getUgliness
	public void setUgliness(int newUgliness) {		//Assigns new ugliness
		ugliness = newUgliness;
	}	// end setUgliness

   public int getStrength() {								//Accesses current strength and
	    return strength;										//Makes it available
	}	// end getStrength
	public void setStrength(int newStrength) {		//Assigns new strength
		strength = newStrength;
   }	// end setStrength

   public String getBloodColor() {							//Accesses current bloodColor and
		return bloodColor;									//Makes it available
	}	// end getBloodColor
	public void setBloodColor(String newBloodColor) {	//Assigns bloodColor
		bloodColor = newBloodColor;
   }	// end setBloodColor
	
   public int getSmarts() {								//Accesses current smarts and
		return smarts;											//Makes it available
	}	 // end getSmarts
	public void setSmarts(int newSmarts) {				//Assigns smarts
		smarts = newSmarts;
   }	//setSmarts
  
   /**
    * This method prints out the characteristics of an orc object.
    * If you added new data members in the above, then you should also modify
    * this method.
    */
   public void printInfo()  {

      System.out.println("Information about Orc:");
      System.out.println("Name           : " + name);
      System.out.println("Height         : " + height + " cm");
      System.out.println("Weight         : " + weight + " kg");
      System.out.println("Weapon Used    : " + weaponUsed);
      System.out.println("Armor Used     : " + armorUsed);
      System.out.println("Ugliness       : " + ugliness);
		System.out.println("Strength       : " + strength);
		System.out.println("Blood Color    : " + bloodColor);	
		System.out.println("Smarts         : " + smarts);	
		System.out.println("End Information about Orc:");

   }  // end printInfo

   // --------------------------------------------------------------------------
   // In the following, we will just have some "simulated" methods since we do
   // do not have enough background to actually implement the following
   // behaviors.  Our simulation is simply to printout a statement "performing"
   // an action.  
	// --------------------------------------------------------------------------

   /**
    * This method carries out the "running" process of an Orc.
    * We will use it to simulate the Orc running using a series of
	 * print statements.  The count variable will allow us to choose 
	 * the order to run each statements.
    */
   public void run(int count)  {
		if (count == 1) {
      System.out.println("Running -- starting out clumsily");
		}
		else if (count == 2) {
      System.out.println("Running -- darting left and right, arms swinging");
		}
		else if (count == 3) {
      System.out.println("Running -- picking up speed, 5 km/hour");
		}
		else if (count == 4) {
      System.out.println("Running -- stopping after 5 minutes");
		}
   }	// end run method
	
   /**
    * This method carries out the "walking" process of an Orc.
    * We will use it to simulate the Orc walking using a series of
	 * print statements.  The count variable will allow us to choose 
	 * the order to run each statements.
    */
   public void walk(int count)  {
		if (count == 1){
			System.out.println("Walking -- begins strolling at 0.5 km/hour");
		}
		else if (count == 2) {
			System.out.println("Walking -- dragging feet");
		}
		else if (count == 3) {
		 	System.out.println("Walking -- picking up speed, 1 km/hour");
		}
		else if (count == 4) {
			System.out.println("Walking -- begins sneaky, heel-toe walking");
		}
		else if (count == 5) {
			System.out.println("Walking -- stops to fight");
		}
	}	//end walk
	
   /**
    * This method carries out the "growling" process of an Orc.
    * We will use it to simulate the Orc growling using a series of
	 * print statements.  The count variable will allow us to choose 
	 * the order to run each statements.
    */	
	public void growl(int count)  {
		if (count == 1) {
			System.out.println("Growling -- growls softly, deep in throat");
		}
		else if (count == 2) {
			System.out.println("Growling -- increases volume");	
		}
		else if (count == 3) {
		 	System.out.println("Growling -- opens mouth and briefly growls loudly");
		}
		else if (count == 4) {
    		System.out.println("Growling -- continues at a low, soft growl");
		}	 	
		else if (count == 5) {
			System.out.println("Growling -- opens mouth and growls loudly for 5 seconds");
		}
	}	// end growl
	
   /**
    * This method carries out the "speaking" process of an Orc.
    * We will use it to simulate the Orc speaking using a series of
	 * print statements.  The count variable will allow us to choose 
	 * the order to run each statements.
    */		
	public void speak(String whatToSay, int count)  {
		if (count == 1) {
			System.out.println("Speaking -- Where is that elf?");
		}
		else if (count == 2) {
			System.out.println("Speaking -- I know he is around here.");
		}
		else if (count == 3) {
		 	System.out.println("Speaking -- There he is!");
		}
		else if (count == 4) {
		   System.out.println("Speaking -- Ugh, ear wax!");
		}
	}	// end speak
	
   /**
    * This method carries out the "fighting" process of an Orc.
    * We will use it to simulate the Orc fighting using a series of
	 * print statements.  The count variable will allow us to choose 
	 * the order to run each statements.
    */
   public void fight(int count)  {	
		if (count == 1) {
    		System.out.println("Fighting -- left jab");
		}
		else if (count == 2) {
	 		System.out.println("Fighting -- right cross");
		}
		else if (count == 3) {
    		System.out.println("Fighting -- head butt");
		}
		else if (count == 4){
    		System.out.println("Fighting -- biting ear off and spitting it out");
   	}
	}	// end fight
	
}  // end Class Orc
