/*

Modified Class file from PolymorphicMonsters.
Includes classes: LinkedListDriver, Monster, Werewolf, Zombie, and Goblin
6-11-2021
updated 2/25/22

Dr. G

This code is a combination of the polymorphic monster code and the linked list code from the class. 
I've adapted the code from the module, but I've changed the names and the format based on how I see it. 
*/

import java.security.SecureRandom;

public class Main
{
	public static void main(String [] args)
	{
		MonsterList mList = new MonsterList();  
		
		mList.addMonster(new Zombie("Jack the jawless"));
		mList.addMonster(new Werewolf("Jane the hairy"));
		mList.addMonster(new Zombie("Alex the armless"));
		mList.addMonster(new Goblin("Nott the brave"));
		mList.addMonster(new Goblin("Blix the coward")); 
		
		System.out.println("Count 1 : " + mList.count1());
		System.out.println("Count 2 : " + mList.count2());
		
		//Testing 
		System.out.println("Get Monster Testing");
		System.out.println(mList.getMonster(1));

		
		//testing the extract only method
		//this  only demonstrates predicate abstraction which is a next topic...
		System.out.println("Extract Only Zombies : ");
		MonsterList zombiesOnly = mList.getMonsters(new ZombieTest());
		System.out.println(zombiesOnly);
		
		System.out.println("The entire list : ");
		System.out.println(mList);	
	}
}


//Abstract monster parent class
abstract class Monster
{
	protected String name;
	protected int hitPoints;
	protected boolean alive;
	
	public abstract void speak(); 
	
	public void takeDamage(int damage)
	{
		hitPoints-=damage;
		if (hitPoints <= 0)
		{
			hitPoints = 0;
			alive = false;
		}
	}
	
	public Monster()
	{
		name = null;
		hitPoints = 1; 
		alive = true;
	}
	
	public String toString()
	{
		return "Name : " + name + "\nHit Points : " + hitPoints + "\n" ;
	}
	
	public boolean isAlive()
	{
		return alive;
	}
	
}

//Zombie class
class Zombie extends Monster
{
	public Zombie(){super();}
	public Zombie(String name){this.name=name;}
	
	public void speak()
	{
		System.out.println("Brains!");
	}
		
	public void goodBye()
	{
		System.out.println("Bye Brains!");
	}
	
}

//Werewolf class object
class Werewolf extends Monster
{
	
	public Werewolf(){super();}
	public Werewolf(String name){this.name=name;}
	
	public void speak()
	{
		System.out.println("Howl!");
	}
}


//Goblin class object
class Goblin extends Monster
{
	public Goblin(){super();}
	public Goblin(String name){this.name=name;}
	
	public void speak()
	{
		System.out.println("I like to blow things up!");
	}
}
