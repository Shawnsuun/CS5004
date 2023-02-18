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
        if (this.next == null) {
            return this.word;
        }
        if (this.word.length() > this.next.longestWord().length()) {
            return this.word;
        }
        return this.next.longestWord();
    }

    @Override
    public Sentence clone() {
        if (this.next == null) {
            return new wordNode(this.word);
        }
        return new wordNode(this.word, this.next.clone());
    }

    @Override
    public Sentence merge(Sentence other) {
        if (this.next == null) {
            this.next = other.clone();
            return this;
        }
        return new wordNode(this.word, this.next.merge(other));
    }

}
