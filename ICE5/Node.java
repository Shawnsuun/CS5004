/*
Basic node for containing a monster
6-11-2021
edited 2/25/22

Dr. G
*/

import java.util.function.Predicate;

//Why does the node need to implement MonsterNode?
public class Node implements MonsterNode
{
	//Allow the node to hold a Monster
	//Create a variable that will "point" to the next node
	//The next node could be a node or an empty node
	//I know the modules say rest, but let's just use "nextNode"
	
	private Monster m;
	private MonsterNode nextNode;
	
	//public int count(){return 0;}//this node + all the rest of the nodes
	//public String toString(){return null;}//return this nodes data as a string + the next node's data
	
	//basic constructor
	//this node has a monster and "points" to another monster node or an empty node
	public Node(Monster m, MonsterNode nextNode) 
	{
		this.m = m;
		this.nextNode = nextNode;
	}
	
	public int count1()
	{
		return 1 + nextNode.count1();
	}
	
	public int count2(int count)
	{
		return nextNode.count2(++count);
	}
	
	public String toString()
	{
		return m.toString() + nextNode.toString();
	}
	
	//if the monster in this node is still alive return it as a new node
	//otherwise exlclude it from the new list by moving on to the next node
	public MonsterNode getAlive()
	{
		
		if(m.isAlive())
		{
			return new Node(m, nextNode.getAlive());
		}
		else
		{
			return nextNode.getAlive();
		}
	}
	
	//return a specific monster based on its position in the list
	public Monster getMonster(int position)
	{
		if (position == 0) 
		{
			
			return m;
		}
		
		return nextNode.getMonster(--position);
	}
	  
	  public MonsterNode getZombies()
	  {
		  if (m instanceof Zombie)
			  return new Node(m, nextNode.getZombies());
		  else
			  return nextNode.getZombies();
	  }
	  

	public MonsterNode getMonsters(MonsterTest tester)
	{
	  if (tester.test(m))
	  {
		  return new Node(m, nextNode.getMonsters(tester));
	  }
	  else 
	  {
		  return nextNode.getMonsters(tester);
	  }
  }
  
}