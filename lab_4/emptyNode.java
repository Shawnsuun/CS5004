public class emptyNode extends ListNode implements Sentence {
    public String word;

    public emptyNode() {
        super();
        this.word = "";
    }

    @Override
    public int getNumberOfWords() {
        return 0;
    }

    @Override
    public String longestWord() {
        return "";
    }

    @Override
    public Sentence clone() {
        return new emptyNode();
    }

    @Override
    public Sentence merge(Sentence other) {
        return other;
    }

}
