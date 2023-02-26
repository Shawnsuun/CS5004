/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The emptyNode class of the lab4
 ******/

/**
 * This class represents an empty node in a linked list of words. It extends the ListNode class and implements the
 * sentenceNode interface. An empty node is used to indicate the end of a sentence or the end of a linked list.
 */
public class emptyNode extends ListNode implements sentenceNode {
    /**
     * Constructs an empty node.
     */
    public emptyNode() {
        super();
    }

    /**
     * Returns the number of words in the linked list, which is always 0 for an empty node.
     *
     * @return the number of words in the linked list.
     */
    @Override
    public int getNumberOfWords() {
        return 0;
    }

    /**
     * Returns an empty string, as there are no words in an empty node.
     *
     * @return an empty string.
     */
    @Override
    public String longestWord() {
        return "";
    }

    /**
     * Creates a copy of this empty node.
     *
     * @return a copy of this empty node.
     */
    @Override
    public sentenceNode clone() {
        return new emptyNode();
    }

    /**
     * Merges this empty node with another sentenceNode by returning the other node。
     *
     * @param other the other sentenceNode to merge with this one.
     * @return the other sentenceNode.
     */
    @Override
    public sentenceNode merge(sentenceNode other) {
        return other;
    }

}