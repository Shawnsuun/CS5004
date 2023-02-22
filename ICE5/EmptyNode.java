/*
Linked list tail object for a list of monsters
6-11-2021

edited 2/25/22


Dr. G
*/

import java.util.function.Predicate;

public class EmptyNode implements MonsterNode
{
	
	//basic methods
	public int count1(){return 0;} 
	public int count2(int count){return count;} 
	public String toString(){return "";}
	public Monster getMonster(int position){return null;}
	public MonsterNode getAlive(){return new EmptyNode();}
	public MonsterNode getZombies(){return new EmptyNode();}
	public MonsterNode getMonsters(MonsterTest tester){return new EmptyNode();}
	
}