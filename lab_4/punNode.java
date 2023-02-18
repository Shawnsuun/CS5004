public class punNode extends ListNode implements Sentence {

    public punNode(String p) {
        super(p);
    }

    public punNode(String p, Sentence node) {
        super(p, node);
    }

    @Override
    public int getNumberOfWords() {
        if (this.next == null) {
            return 0;
        }
        return this.next.getNumberOfWords();
    }

    @Override
    public String longestWord() {
        if (this.next == null) {
            return "";
        }
        return this.next.longestWord();
    }

    @Override
    public Sentence clone() {
        if (this.next == null) {
            return new punNode(this.word);
        }
        return new punNode(this.word, this.next.clone());
    }

    @Override
    public Sentence merge(Sentence other) {
        if (this.next == null) {
            this.next = other.clone();
            return this;
        }
        return new punNode(this.word, this.next.merge(other));
    }

}
