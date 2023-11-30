package KI304.Pavlosiuk.Lab6;
/**
 * Class <code>Meaning</code> implements Object
 */
public class Meaning implements Object {
	   private String word;
	    private int index;

    /**
     * Constructor
     * 
     * @param color  Color
     * @param radius Radius
     * @param height Height
     */
    public Meaning(String word, int index) {
        this.word = word;
        this.index = index;
    }

    /**
     * @return String with word
     */
    public String getWord() {
        return word;
    }

    /**
     * Method set word of object
     * 
     * @param word Word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return int object index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Method set object index
     * 
     * @param index Index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Method set object length
     * 
     * @param length Length
     */

    /**
     * Method return object length
     * 
     * @return int object length
     */
    public int getLength() {
        return word.length();
    }

    /**
     * Method compare objects
     * 
     * @param obj Object
     * @return int (0, 1, -1)
     */
    @Override
    public int compareTo(Object obj) {
        int l = getLength();
        return Integer.compare(l, obj.getLength());
    }


    /**
     * Method print object data
     */
    public void printData() {
        System.out.println("Type: Meaning, Word: " + word + ", Index: " + index + ", Length: " + getLength() + ";");
    }
}