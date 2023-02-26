/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The Sentence class of the lab4
 ******/

import java.util.List;

/**
 * This class represents a sentence made up of a linked list of words. A sentence can be created by adding words
 * to it using the append method.
 *
 * The Sentence class delegates the implementation of the linked list to a sentenceNode object, which can be any
 * of the three classes that implement the sentenceNode interface: wordNode, punNode, and emptyNode.
 *
 * The Sentence class provides methods to query and manipulate the linked list, including counting the number of
 * words, finding the longest word, cloning the sentence, merging two sentences, and converting the sentence to a
 * string or a list of strings.
 */
public class Sentence {
    private sentenceNode node;

    /**
     *  Constructs an empty sentence with an emptyNode as the sentenceNode.
     */
    public Sentence() {
        this.node = new emptyNode();
    }

    /**
     *  Constructs a sentence with the given sentenceNode as the head of the linked list.
     *  @param node the head of the sentenceNode linked list.
     */
    public Sentence(sentenceNode node) {
        this.node = node.clone();
        this.node.append("");
    }

    /**
     *  Returns the number of words in the sentence.
     *  @return the number of words in the sentence.
     */
    public int getNumberOfWords() {
        return this.node.getNumberOfWords();
    }

    /**
     *  Returns the longest word in the sentence.
     *  @return the longest word in the sentence.
     */
    public String longestWord() {
        return this.node.longestWord();
    }

    /**
     *  Creates a copy of this sentence.
     *  @return a copy of this sentence.
     */
    public Sentence clone() {
        return new Sentence(this.node);
    }

    /**
     *  Merges this sentence with another sentence by concatenating the linked lists of sentenceNodes.
     *  @param other the other sentence to merge with this one.
     *  @return the merged sentence.
     */
    public Sentence merge(Sentence other) {
        return new Sentence(this.node.merge(other.node));
    }

    /**
     *  Returns a string representation of the sentence.
     *  @return a string representation of the sentence.
     */
    @Override
    public String toString() {
        return this.node.toString();
    }

    /**
     *  Appends a word to the end of the sentence.
     *  @param word the word to append to the sentence.
     */
    public void append(String word) {
        this.node.append(word);
    }

    /**
     *  Returns a list of strings representing the words in the sentence.
     *  @return a list of strings representing the words in the sentence.
     */
    public List<String> toList() {
        return this.node.toList();
    }

    public Sentence reverse() {
        return new Sentence((sentenceNode) this.node.reverse().next);
    }
}
