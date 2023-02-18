public class punNode extends ListNode implements Sentence {

    public punNode(String p) {
        super(p);
    }

    public punNode(String p, Sentence node) {
        super(p, node);
    }

    @Override
    public int getNumberOfWords() {
        if (this == null) {
            return 0;
        }
        return this.next.getNumberOfWords();
    }

    @Override
    public String longestWord() {
        return null;
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
        }
        return new punNode(this.word, this.next.merge(other));
    }

    @Override
    public void append(String pun) {
        if (this.next == null) {
            this.next = new punNode(pun);
            return;
        }
        this.next.append(pun);
    }
}
