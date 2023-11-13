package KI304.Pavlosiuk.Lab2;

import java.util.Random;

/**	
 * This class represents a call and provides methods to make, end, and retrieve
 * information about the call.
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public class Call {
    private String phoneNumber;
    private boolean isInCall;
    private int callDuration;

    /**
     * Constructor
     * 
     * Initializes a Call object with default values.
     */
    public Call() {
        phoneNumber = "+380-xx-xxx-xxxx";
        isInCall = false;
        callDuration = 0;
    }

    /**
     * Constructor
     * 
     * @param pN  Phone number
     * @param iNC Is in call
     * @param d   Call duration
     * 
     *           Initializes a Call object with specified values.
     */
    public Call(String pN, boolean iNC, int d) {
        phoneNumber = pN;
        isInCall = iNC;
        callDuration = d;
    }

    /**
     * Initiates a call with the specified phone number.
     * 
     * @param pN Phone number
     */
    public void makeCall(String pN) {
        phoneNumber = pN;
        isInCall = true;
    }

    /**
     * Ends the ongoing call, generating a random call duration between 0 and 60
     * seconds.
     */
    public void endCall() {
        isInCall = false;
        Random random = new Random();
        callDuration = random.nextInt(60);
    }

    /**
     * Returns the phone number associated with the call.
     * 
     * @return Phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the status of the call (in call or not).
     * 
     * @return True if in call, false otherwise
     */
    public boolean getCallStatus() {
        return isInCall;
    }

    /**
     * Returns the duration of the call.
     * 
     * @return Call duration in seconds
     */
    public int getCallDuration() {
        return callDuration;
    }
}
