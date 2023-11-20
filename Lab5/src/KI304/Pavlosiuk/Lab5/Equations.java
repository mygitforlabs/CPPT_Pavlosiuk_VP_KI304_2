package KI304.Pavlosiuk.Lab5;


/**
 * Class <code>Equations</code> implements method for  y=sin(x)/ctg(8x)
 * expression
 * calculation
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 */

public class Equations {

    /**
     * Method calculates the  y=sin(x)/ctg(8x) expression
     * 
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculate(double x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
        	y = Math.sin(rad) / (1.0 / Math.tan(8 * rad));
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 22.5 
            		|| x == 45 || x == -22.5 || x == -45 || x == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if ( x == 22.5 || x == 45 || x == -22.5 || x == -45)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }

}