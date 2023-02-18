public class emptyNode extends ListNode implements Sentence {
    public String word;

    public Sentence next;

    public emptyNode() {
        super();
    }

    @Override
    public int getNumberOfWords() {
        return 0;
    }

    @Override
    public String longestWord() {
        return null;
    }

    public Sentence clone() {
        return new emptyNode();
    }

    @Override
    public Sentence merge(Sentence other) {
        return other;
    }

    @Override
    public void append(String word) {
        return;
    }

    @Override
    public String toString() {
        return "";
    }
}
