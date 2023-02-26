/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The sentenceNode interface of the lab4
 ******/

import java.util.List;

/**
 * The sentenceNode interface represents a node in a linked list of words.
 * Each node can contain one word and has methods to manipulate and query the linked list.
 */
public interface sentenceNode {
    /**
     * Returns the number of words in the sentence starting from this node.
     * @return The number of words in the sentence starting from this node.
     */
    public int getNumberOfWords();

    /**
     * Returns the longest word in the sentence starting from this node.
     * @return The longest word in the sentence starting from this node.
     */
    public String longestWord();

    /**
     * Creates and returns a new sentenceNode that is a copy of this node.
     * @return A new sentenceNode that is a copy of this node.
     */
    public sentenceNode clone();

    /**
     * Merges this node with another node and returns the result as a new node.
     * @param other The sentenceNode to be merged with this node.
     * @return The result of merging this node with the other node as a new node.
     */
    public sentenceNode merge(sentenceNode other);

    /**
     * Appends a new word to the end of the sentence node starting from this sentence node.
     * @param word The word to be appended.
     */
    public void append(String word);

    /**
     * Returns a list of all the words starting from this sentence node.
     * @return A list of all the words starting from this sentence node.
     */
    public List<String> toList();

    public ListNode reverse();
}
