/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The Main class of the lab3
 ******/

import java.util.Random;
import java.lang.Math;

/*
Driver file for Automated House Factory Assignment

This file will not work until assignment has been completely implmented. 

6/21/2022
-Dr. G
*/


/**
 * Main class for Automated House Factory Assignment.
 *
 * This class runs an infinite loop that generates a random resource,
 * then send it to a StoneBlockFactory or WoodBlockFactory to produce blocks,
 * then blocks are taken by the HouseFactory and a house is built
 */

public class Main
{
	public static void main(String[] args) throws InterruptedException {
		// Declare a resource object for passing to the factories
		Resource resource;

		// Creating instances of three different factories
		Factory stoneBlockProducer = new StoneBlockFactory();
		Factory woodBlockProducer = new WoodBlockFactory();
		Factory houseBlockProducer = new HouseFactory();

		// Declare a houseBlock object to be produced
		Block h1;
		
		//Infinite simulation loop CTRL + C to terminate simulation
		while(true)
		{
			// Mine a resource
		    resource = mineResource();

			// Send the resource to the right factory based on type
		    switch(resource.getType())
		    {
		        case STONE: stoneBlockProducer.takeResource(resource); break;
		        case WOOD: woodBlockProducer.takeResource(resource); break;
		    }

			// House factory take resources from stone and wood factories
    		houseBlockProducer.takeResource(stoneBlockProducer.produce());
    		houseBlockProducer.takeResource(woodBlockProducer.produce());

			// House factory Try to produce a house object
    		h1 = houseBlockProducer.produce();

			// If a house is produced, print a message
    		if (h1 != null) System.out.println("House Built");

			// Reset the house object to null
    		h1 = null;

			// Display the inventory of each factory
    		System.out.println("Stone Producer");
    		stoneBlockProducer.displayInventory();
    		System.out.println("Wood Producer");
    		woodBlockProducer.displayInventory();
    		System.out.println("House Producer");
    		houseBlockProducer.displayInventory();

			// Print an empty line
    		System.out.println();
    		
    		//pauses simulation for 2 seconds so it is visable
    		Thread.sleep(2000);
		}
	}
	
	//generate a random Resource with a random weight
	public static Resource mineResource()
	{
	    Random r = new Random();
	  
	    ResourceType type = ResourceType.STONE;
	    double weight = Math.round((Math.abs(r.nextDouble()))*100.0)/10.0 ;
	    int select = r.nextInt(2);
	    
	    switch(select)
	        {
				// Select the resource type based on a random number
	            case 0: type = ResourceType.STONE; break;
	            case 1: type = ResourceType.WOOD; break;
	        }
	        
	   return new Resource(weight, type);
	}
}


