/*
Interface object for creating a list of monsters
This allows for node and emptyNode to be of the same type. 

6-11-2021

edited 2/25/22

Dr. G
*/

import java.util.function.Predicate;

public interface MonsterNode
{
	int count1();
	int count2(int count);
	MonsterNode getAlive();
	Monster getMonster(int position);
	
	public MonsterNode getMonsters(MonsterTest tester);
	public MonsterNode getZombies();

}