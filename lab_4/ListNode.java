public abstract class ListNode {
    public String word;
    public Sentence next;

    public ListNode() {
    }

    public ListNode(String word) {
        this.word = word;
    }
    public ListNode(String word, Sentence node) {
        this.word = word;
        this.next = node;
    }

    public void append(String word) {
        if (this.next == null) {
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

    @Override
    public String toString() {
        if (this.next == null) {
            return this.word;
        }
        return this.word + this.next.toString();
    }
}
