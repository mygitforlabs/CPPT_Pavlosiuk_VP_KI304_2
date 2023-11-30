package KI304.Pavlosiuk.Lab6;
/**
 * Class App realize example program for lab 6
 * 
 * @author Anton Panurin
 * @version 1.1
 * @since version 1.0
 */

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Vocabulary<? super Object> vocabulary = new Vocabulary<Object>();

        vocabulary.AddObject(new Key("House", 1));
        vocabulary.AddObject(new Meaning("Будинок", 1));
        vocabulary.AddObject(new Key("University", 2));
        vocabulary.AddObject(new Meaning("Університет", 2));
        vocabulary.AddObject(new Key("Cat", 3));
        vocabulary.AddObject(new Meaning("Кіт", 3));
        vocabulary.AddObject(new Key("Keyboard", 4));
        vocabulary.AddObject(new Meaning("Клавіатура", 4));
   
        Object res = vocabulary.findMax();
        System.out.print("Word with the most letters in vocabulary: \n");
        res.printData();
    }
}