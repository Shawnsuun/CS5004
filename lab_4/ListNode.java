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

    @Override
    public String toString() {
        if (this.next == null) {
            return this.word;
        }
        return this.word + this.next.toString();
    }
}
