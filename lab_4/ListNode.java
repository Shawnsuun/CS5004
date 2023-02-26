/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The ListNode abstract class of the lab4
 ******/

import java.util.ArrayList;
import java.util.List;

/**
 * The ListNode class represents a node in a linked list of words.
 * Each node can contain one word and has methods to manipulate and query the linked list.
 */
public abstract class ListNode {
    /** The word stored in this node. */
    public String word;
    /** The next node in the linked list. */
    public sentenceNode next;

    /** Constructs an empty node with an empty word. */
    public ListNode() {
        this.word = "";
    }

    /**
     * Constructs a node with the given word and null next node.
     * @param word The word to be stored in this node.
     */
    public ListNode(String word) {
        this.word = word;
    }

    /**
     * Constructs a node with the given word and next node.
     * @param word The word to be stored in this node.
     * @param node The next node in the linked list.
     */
    public ListNode(String word, sentenceNode node) {
        this.word = word;
        this.next = node;
    }

    /**
     * Appends a new word to the end of the linked list starting from this node.
     * If the next node is null or an empty node, creates a new node with the given word
     * and sets it as the next node. Otherwise, calls the append method on the next node.
     * @param word The word to be appended.
     */
    public void append(String word) {
        if (this.next == null || this.next instanceof emptyNode) {
            if (word.matches("[a-zA-Z]+")) {
                this.next = new wordNode(word);
            } else if (word.matches("[\\p{Punct}]+")) {
                this.next = new punNode(word);
            } else if (word.equals("")) {
                this.next = new emptyNode();
            }
            return;
        }
        this.next.append(word);
    }

    /**
     * Returns a string representation of the linked list starting from this node.
     * @return A string representation of the linked list starting from this node.
     */
    @Override
    public String toString() {
        if (this.next == null || this.next instanceof emptyNode) {
            return this.word;
        }
        if (this.next instanceof wordNode) {
            return this.word + " " + this.next.toString();
        }
        return this.word + this.next.toString();
    }

    /**
     * Returns a list of all the words in the linked list starting from this node.
     * @return A list of all the words in the linked list starting from this node.
     */
    public List<String> toList() {
        List<String> list = new ArrayList<>();
        if (this == null) {
            return list;
        }
        ListNode node = this;
        while (node != null && !(node instanceof emptyNode)) {
            list.add(node.word);
            node = (ListNode) node.next;
        }
        return list;
    }
    public ListNode reverse() {
        ListNode prev = null;
        ListNode cur = this;
        while (cur != null) {
            sentenceNode next = cur.next;
            cur.next = (sentenceNode) prev;
            prev = cur;
            cur = (ListNode) next;
        }
        return prev;
    }
}
