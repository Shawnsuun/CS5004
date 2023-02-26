/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The punNode class of the lab4
 ******/

/**
 * This class represents a Punctuation node in a linked list of words. It extends the ListNode class
 * and implements the sentenceNode interface.
 * A Punctuation node contains a single Punctuation as its data.
 */
public class punNode extends ListNode implements sentenceNode {
    /**
     * Constructs a Punctuation node with the given Punctuation.
     *
     * @param p punctuation contained in this punctuation node.
     */
    public punNode(String p) {
        super(p);
    }


    /**
     * Constructs a Punctuation node with the given Punctuation and a reference to the next sentenceNode.
     *
     * @param p punctuation contained in this punctuation node.
     * @param node reference to the next sentenceNode in the list.
     */
    public punNode(String p, sentenceNode node) {
        super(p, node);
    }

    /**
     * Returns the number of words in the linked list.
     *
     * @return the number of words in the linked list.
     */
    @Override
    public int getNumberOfWords() {
        if (this.next == null) {
            return 0;
        }
        return this.next.getNumberOfWords();
    }

    /**
     * Returns the longest word in the linked list.
     *
     * @return the longest word in the linked list.
     */
    @Override
    public String longestWord() {
        if (this.next == null) {
            return "";
        }
        return this.next.longestWord();
    }

    /**
     * Creates a copy of this Punctuation node and any nodes following it in the linked list.
     *
     * @return a copy of this Punctuation node and any nodes following it in the linked list.
     */
    @Override
    public sentenceNode clone() {
        if (this.next == null) {
            return new punNode(this.word);
        }
        return new punNode(this.word, this.next.clone());
    }

    /**
     * Merges this Punctuation node with another sentenceNode by adding the other node as the next node after this one.
     *
     * @param other the other sentenceNode to merge with this one.
     * @return the updated sentenceNode after merging.
     */
    @Override
    public sentenceNode merge(sentenceNode other) {
        if (this.next == null || this.next instanceof emptyNode) {
            this.next = other.clone();
            return this;
        }
        return new punNode(this.word, this.next.merge(other));
    }
}
