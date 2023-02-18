public class wordNode extends ListNode implements Sentence {
    public String longestWord;

    public wordNode(String word) {
        super(word);
    }

    public wordNode(String word, Sentence node) {
        super(word, node);
    }

    @Override
    public int getNumberOfWords() {
        if (this.next == null) {
            return 1;
        }
        return 1 + this.next.getNumberOfWords();
    }

    @Override
    public String longestWord() {
        return null;
    }

    @Override
    public Sentence clone() {
        return new wordNode(this.word, this.next.clone());
    }

    @Override
    public Sentence merge(Sentence other) {
        if (this.next == null) {
            this.next = other.clone();
        }
        return new wordNode(this.word, this.next.merge(other));
    }

    @Override
    public void append(String word) {
        if (this.next == null) {
            this.next = new wordNode(word);
            return;
        }
        this.next.append(word);
    }


}
