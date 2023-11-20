package KI304.Pavlosiuk.Lab5;
/**
* Class <code>CalcException</code> more precises ArithmeticException
* @author Vitalii_Pavlosiuk
* @version 1.0
*/
public class CalcException extends ArithmeticException {
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}