//import java.util.function.Function;

public class Main
{
	public static void main(String [] args)
	{		
		
		//Call back from last class
		ListADT<Monster> monsterList = new ListADTImpl<Monster>();
		
		monsterList.addBack(new Zombie("Bob"));
		monsterList.addBack(new Werewolf("Pro. Lupin"));
		monsterList.addBack(new Goblin("Nott"));
		
		for(int x = 0; x<monsterList.getSize(); ++x)
		{
			System.out.println(monsterList.get(x));
		}
		
		
		//1. Review this code file. What's changed to match better design?
		
		//2. Map, filter, fold describe each 
		
		//3. Implement the filter method to get all zombies (ICE Submission)
		ListADT<Monster> zombieList = monsterList.filter(m -> m instanceof Zombie);
		System.out.println(zombieList);
		
		//4. Describe how the filter design is good design. (ICE Submission)
		/**
		 * Answer: it is flexible, Readable and reusable for selecting elements from a list based on a condition,
		 * allow choosing different types of obj from the list without writting a new method.
		 */
		 
		//5. Trace the map function doing whatever research is needed to figure out what it is doing.
		//6. Test your understanding by doing the following: 
		    //Convert the list to a list of 1's (ICE Submission)
		    ListADT<Integer> onesList = monsterList.map(m -> 1);
		    System.out.println(onesList);
	    	//Convert the list to a list of 1's and 0's where 1's are zombies and 0's are everything else (ICE Submission)
	    	ListADT<Integer> oneZeroList = monsterList.map(m -> m instanceof Zombie ? 1 : 0);
	    	System.out.println(oneZeroList);
		    //Convert the monsters to a list of strings (ICE Submission)
		    ListADT<String> strList = monsterList.map(m -> m.toString());
		    System.out.println(strList);
		    //Convert the monsters to a list of boolean variables based on if they are alive (ICE Submission)
		    ListADT<Boolean> boolList = monsterList.map(m -> m.isAlive());
		    System.out.println(boolList);	
		//7. There's already a specific fold. Where is it?
		//8. How would you make this work monsterList.getSize(z -> z instanceof Zombie);(ICE Submission)
		/**
		 *  Answer: the ListADT interface need to have a getSize(Predicate<T> predicate) method
		 */
		
		/*
		//Example from module in case it is useful
		ListADT<String> stringList = new ListADTImpl<String>();
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		String []words = sentence.split("\\s+");
		
		for (String w:words) 
		{
			stringList.addBack(w);
		}

		ListADT<Integer> wordLengths = stringList.map(s->s.length());
		
		System.out.println(stringList.getSize());
		
		for (int i=0;i<words.length;i++) 
		{
			System.out.println(wordLengths.get(i));
		}
		*/
		
	}
	
}