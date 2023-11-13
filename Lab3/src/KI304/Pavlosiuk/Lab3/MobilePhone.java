package KI304.Pavlosiuk.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class MobilePhone extends Phone implements VideoCall {

    private String number;
    private boolean camStatus;
    private boolean micStatus;

    /**
     * Constructor
     * 
     * Initializes a MobilePhone object with default Call, Smart, and Media instances.
     * Creates a PrintWriter to log actions to the "Log.txt" file.
     * 
     * @throws FileNotFoundException If the "Log.txt" file cannot be created.
     */
    public MobilePhone() throws FileNotFoundException {
        call = new Call();
        smart = new Smart();
        media = new Media();
        number = "+380 99 999 9999";
        camStatus = false;
        micStatus = false;
        isEnabled = false;

        file = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor with parameters for initializing the MobilePhone object.
     * 
     * Initializes a MobilePhone object with specified parameters.
     * Creates a PrintWriter to log actions to the "Log.txt" file.
     * 
     * @param pN                Phone number
     * @param callStatus        Initial call status
     * @param newNumber         New phone number
     * @param callDuration      Call duration
     * @param wifiStatus        Initial WiFi status
     * @param bluetoothStatus   Initial Bluetooth status
     * @param volume            Initial volume level
     * @param screenBrightness  Initial screen brightness level
     * @throws FileNotFoundException If the "Log.txt" file cannot be created.
     */
    public MobilePhone(String pN, boolean callStatus, String newNumber, int callDuration,
            boolean wifiStatus, boolean bluetoothStatus, int volume, int screenBrightness)
            throws FileNotFoundException {
        call = new Call(pN, callStatus, callDuration);
        smart = new Smart(wifiStatus, bluetoothStatus);
        media = new Media(volume, screenBrightness);
        camStatus = false;
        micStatus = false;
        isEnabled = false;
        number = newNumber;
        file = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Turns on the phone and logs the action.
     */
    @Override
    public void turnOn() {
        isEnabled = true;
        file.println("MobilePhone is ON!");
        file.println();
        file.flush();
    }

    /**
     * Turns off the phone and logs the action.
     */
    
    public void turnOff() {
        isEnabled = false;
        file.println("MobilePhone is OFF!");
        file.println();
        file.flush();
    }

    /**
     * Get the phone number associated with this device.
     * 
     * @return The phone number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Get the camera status.
     * 
     * @return True if the camera is on, false otherwise
     */
    public boolean getCamStatus() {
        return camStatus;
    }

    /**
     * Get the microphone status.
     * 
     * @return True if the microphone is on, false otherwise
     */
    public boolean getMicStatus() {
        return micStatus;
    }

    /**
     * Initiate a video call to the specified number and log the call details.
     * 
     * @param number The phone number to call
     */
    public void videoCall(String number) {
        file.println("Video call to " + number + "  _   _   _   _   _   _   _   _ Already in a call!");
        file.println("Camera:" + getCamStatus());
        file.println("Microphone:" + getMicStatus());
        file.println();
        file.flush();
    }

    /**
     * End the ongoing video call, log the call duration, and indicate that the call has ended.
     */
    public void endVideoCall() {
        Random random = new Random();
        int duration = random.nextInt(60);
        file.println("The video call ended!");
        file.println("Duration:" + duration);
        file.println();
        file.flush();
    }

    /**
     * Mute the microphone and log the microphone status.
     */
    public void muteMic() {
        micStatus = false;
        file.println("Microphone:" + getMicStatus());
        file.println();
        file.flush();
    }

    /**
     * Unmute the microphone and log the microphone status.
     */
    public void unmuteMic() {
        micStatus = true;
        file.println("Microphone:" + getMicStatus());
        file.println();
        file.flush();
    }

    /**
     * Turn off the camera and log the camera status.
     */
    public void turnOffCamera() {
        camStatus = false;
        file.println("Camera:" + getCamStatus());
        file.println();
        file.flush();
    }

    /**
     * Turn on the camera and log the camera status.
     */
    public void turnOnCamera() {
        camStatus = true;
        file.println("Camera:" + getCamStatus());
        file.println();
        file.flush();
    }

}
