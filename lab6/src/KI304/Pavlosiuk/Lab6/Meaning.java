package KI304.Pavlosiuk.Lab6;

/**
 * The class <code>Meaning</code> implements the Object interface.
 */
public class Meaning implements Object {
    private String word;
    private int index;

    /**
     * Constructor.
     *
     * @param word  The word for the Meaning object.
     * @param index The index for the Meaning object.
     */
    public Meaning(String word, int index) {
        this.word = word;
        this.index = index;
    }

    /**
     * @return The word associated with the object.
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the word for the object.
     *
     * @param word The new word for the Meaning object.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return The index of the object.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the index for the object.
     *
     * @param index The new index for the Meaning object.
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return The length of the word associated with the object.
     */
    public int getLength() {
        return word.length();
    }

    /**
     * Compares objects based on their lengths.
     *
     * @param obj The object to compare.
     * @return An integer representing the result of the comparison (0, 1, -1).
     */
    @Override
    public int compareTo(Object obj) {
        int l = getLength();
        return Integer.compare(l, ((Object) obj).getLength());
    }

    /**
     * Prints the data of the object.
     */
    public void printData() {
        System.out.println("Type: Meaning, Word: " + word + ", Index: " + index + ", Length: " + getLength() + ";");
    }
}
