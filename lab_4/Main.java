/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The driver Main class of the lab4
 ******/

import java.util.List;

/**
 * This class is a driver for the Sentence class. It demonstrates the various methods of the Sentence class
 * and how they can be used to manipulate a sentence made up of a linked list of words.
 */
public class Main {
    public static void main(String[] args) {
        // create an empty sentence
        Sentence sentence1 = new Sentence();
        // prints "Sentence 1: "
        System.out.println("Sentence 1: " + sentence1);
        // prints "Number of words in sentence 1: 0"
        System.out.println("Number of words in sentence 1: " + sentence1.getNumberOfWords());

        // create a sentence with words
        Sentence sentence2 = new Sentence(new wordNode("This"));
        sentence2.append("is");
        sentence2.append("a");
        sentence2.append("driver");
        // prints "Sentence 2: This is a driver"
        System.out.println("Sentence 2: " + sentence2);

        // count words in sentence2, prints "Number of words in sentence 2: 4"
        System.out.println("Number of words in sentence 2: " + sentence2.getNumberOfWords());

        // find the longest word in sentence2, prints "Longest word in sentence 2: driver"
        System.out.println("Longest word in sentence 2: " + sentence2.longestWord());

        // clone sentence2
        Sentence sentence3 = sentence2.clone();
        // prints "Sentence 3: This is a driver"
        System.out.println("Sentence 3: " + sentence2);
        // append a word to the clone
        sentence3.append("!");
        // prints "Number of words in sentence 3: 4"
        System.out.println("Number of words in sentence 3 after append '!': " + sentence2.getNumberOfWords());
        // prints "Sentence 3: This is a driver!"
        System.out.println("Sentence 3: " + sentence3);



        // merge sentence2 and sentence3
        sentence2.append(",");
        Sentence sentence4 = sentence2.merge(sentence3);
        // prints "Merged sentence: This is a driver, This is a driver!"
        System.out.println("Merged sentence4: " + sentence4);

        // convert sentence4 to a list of words
        List<String> words = sentence4.toList();
        // prints "List of words in merged sentence: [This, is, a, sentence, This, is, a, sentence, !]"
        System.out.println("List of words in merged sentence: " + words);

        // reverse sentence4
        Sentence sentence4rev = sentence4.reverse();
        //prints "Sentence4 reversed: ! driver a is This, driver a is This"
        System.out.println("Sentence4 reversed: " + sentence4rev);
    }
}
