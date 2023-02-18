public interface Sentence {

    public int getNumberOfWords();

    public String longestWord();

    public Sentence clone();

    public Sentence merge(Sentence other);

    public void append(String word);
}
