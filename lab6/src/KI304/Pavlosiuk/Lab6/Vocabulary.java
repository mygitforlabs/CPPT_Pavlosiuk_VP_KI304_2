package KI304.Pavlosiuk.Lab6;
import java.util.ArrayList;

/**
 * Parameterized class <code>Shelf</code> implements shelf
 */

public class Vocabulary<T extends Object> {
    private ArrayList<T> arr;

    /**
     * Constructor
     */
    public Vocabulary() {
        arr = new ArrayList<T>();
    }

    /**
     * Method find object max length
     */
    public T findMax() {
        if (!arr.isEmpty()) {
            T max = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(max) > 0) {
                    max = arr.get(i);
                }
            }
            return max;
        }
        return null;
    }


    /**
     * Method add new object 
     * 
     * @param object value
     */

    public void AddObject(T object) {
        arr.add(object);
        System.out.print("Element added: ");
        object.printData();
    }

    /**
     * Method delete object from vocabulary
     * 
     * @param i The index of element
     */

    public void DeleteObject(int i) {
        arr.remove(i);
    }

}