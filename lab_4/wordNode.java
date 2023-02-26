/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The wordNode class of the lab4
 ******/

/**
 * This class represents a word node in a linked list of words. It extends the ListNode class
 * and implements the sentenceNode interface.
 * A word node contains a single word as its data.
 */
public class wordNode extends ListNode implements sentenceNode {
    /**
     * Constructs a word node with the given word.
     *
     * @param word The word contained in this word node.
     */
    public wordNode(String word) {
        super(word);
    }

    /**
     * Constructs a word node with the given word and sentence node.
     *
     * @param word The word contained in this word node.
     * @param node The next node in the sentence.
     */
    public wordNode(String word, sentenceNode node) {
        super(word, node);
    }

    /**
     * Returns the number of words in the sentence.
     *
     * @return The number of words in the sentence.
     */
    @Override
    public int getNumberOfWords() {
        if (this.next == null) {
            return 1;
        }
        return 1 + this.next.getNumberOfWords();
    }

    /**
     * Returns the longest word in the sentence.
     *
     * @return The longest word in the sentence.
     */
    @Override
    public String longestWord() {
        if (this.next == null) {
            return this.word;
        }
        if (this.word.length() > this.next.longestWord().length()) {
            return this.word;
        }
        return this.next.longestWord();
    }

    /**
     * Creates a copy of this word node and any nodes following it in the linked list.
     *
     * @return a copy of this word node and any nodes following it in the linked list.
     */
    @Override
    public sentenceNode clone() {
        if (this.next == null) {
            return new wordNode(this.word);
        }
        return new wordNode(this.word, this.next.clone());
    }

    /**
     * Merges this word node with another sentence node.
     *
     * @param other The other sentence node to merge with.
     * @return The merged sentence node.
     */
    @Override
    public sentenceNode merge(sentenceNode other) {
        if (this.next == null || this.next instanceof emptyNode) {
            this.next = other.clone();
            return this;
        }
        return new wordNode(this.word, this.next.merge(other));
    }
}
