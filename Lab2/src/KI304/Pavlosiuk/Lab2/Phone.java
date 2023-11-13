package KI304.Pavlosiuk.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/** 
 * This class represents a Phone with integrated functionality for calls, smart features, and media controls.
 * It logs various actions to a file named "Log.txt".
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public class Phone {
    private Call call;
    private Smart smart;
    private Media media;

    public boolean isEnabled;
    private PrintWriter file;

    /**
     * Constructor
     * 
     * Initializes a Phone object with default Call, Smart, and Media instances.
     * Creates a PrintWriter to log actions to the "Log.txt" file.
     * 
     * @throws FileNotFoundException If the "Log.txt" file cannot be created.
     */
    public Phone() throws FileNotFoundException {
        call = new Call();
        smart = new Smart();
        media = new Media();

        isEnabled = false;

        file = new PrintWriter(new File("Log.txt"));
    }
    /**
     * Constructor with parameters for initializing the Phone object.
     * 
     * Initializes a Phone object with specified parameters.
     * Creates a PrintWriter to log actions to the "Log.txt" file.
     * 
     * @param pN                Phone number
     * @param wifiStatus        Initial WiFi status
     * @param volume            Initial volume level
     * @param screenBrightness  Initial screen brightness level
     */
    public Phone(String pN, boolean callStatus, int callDuration, boolean wifiStatus, boolean bluetoothStatus, int volume, int screenBrightness) throws FileNotFoundException {
        call = new Call(pN, callStatus, callDuration);
        smart = new Smart(wifiStatus, bluetoothStatus);
        media = new Media(volume, screenBrightness);

        isEnabled = false;

        file = new PrintWriter(new File("Log.txt"));
    }
    /**
     * Turns on the phone and logs the action.
     */
    public void turnOn() {
        isEnabled = true;
        file.println("Phone is ON!");

        file.println();
        file.flush();
    }

    /**
     * Turns off the phone and logs the action.
     */
    public void turnOff() {
        isEnabled = false;
        file.println("Phone is OFF!");

        file.println();
        file.flush();
    }

    /**
     * Initiates a call, logs the action, ends the call, and logs the call duration.
     * 
     * @param pN Phone number to call
     */
    public void makeCall(String pN) {
        call.makeCall("+380-95-850-5662");
        file.println("You are calling to " + call.getPhoneNumber() + " _   _   _   _   _   _   _   _ "
                + "Already in a call!");

        call.endCall();
        file.println("The call ended, duration: " + call.getCallDuration());

        file.println();
        file.flush();
    }

    /**
     * Opens an app on the Smart device and logs the action.
     * 
     * @param app Index of the app to open
     */
    public void openApp(int app) {
        file.println(smart.openApp(app));
        file.println();
        file.flush();
    }

    /**
     * Closes the currently opened app on the Smart device and logs the action.
     */
    public void closeApp(int app) {
        file.println(smart.closeApp(app));
        file.println();
        file.flush();
    }

    /**
     * Connects to WiFi and logs the action.
     */
    public void connectWifi() {
        smart.connectWifi();
        file.println("WiFi is connected, now u can use apps!");
        file.println();
        file.flush();
    }

    /**
     * Disconnects from WiFi and logs the action.
     */
    public void disconnectWifi() {
        smart.disconnectWifi();
        file.println("WiFi is disconnected!");
        file.println();
        file.flush();
    }

    /**
     * Unlocks the screen of the Smart device and logs the action.
     */
    public void unlockScreen() {
        smart.unlockScreen();
        file.println("Phone is unlocked!");
        file.println();
        file.flush();
    }

    /**
     * Locks the screen of the Smart device and logs the action.
     */
    public void lockScreen() {
        smart.lockScreen();
        file.println("Phone is locked!");
        file.println();
        file.flush();
    }

    /**
     * Sets the screen brightness using the Media controls and logs the action.
     * 
     * @param sB New screen brightness level
     */
    public void setScreenBrightness(int sB) {
        media.setScreenBrightness(sB);
        file.println("Screen brightness is changed to: " + media.getScreenBrightness());
        file.println();
        file.flush();
    }

    /**
     * Connects to Bluetooth, logs the action, and automatically manages headphone connection.
     */
    public void connectBluetooth() {
        smart.connectBluetooth();
        file.println("Bluetooth is connected!");
        if (smart.getBluetoothStatus()) {
            media.connectHeadphones();
        } else {
            media.disconnectHeadphones();
            file.println("Headphones were automatically disconnected!");
        }
        file.println("Headphones were automatically connected!");
        file.println();
        file.flush();
    }

    /**
     * Disconnects from Bluetooth, logs the action, and automatically manages headphone connection.
     */
    public void disconnectBluetooth() {
        smart.disconnectBluetooth();
        file.println("Bluetooth is disconnected!");
        if (smart.getBluetoothStatus()) {
            media.connectHeadphones();
        } else {
            media.disconnectHeadphones();
            file.println("Headphones were automatically disconnected!");
            file.println();
            file.flush();
        }
    }

    /**
     * Sets the volume using the Media controls and logs the action.
     * 
     * @param vol New volume level
     */
    public void setVolume(int vol) {
        media.setVolume(vol);
        file.println("Volume is changed to: " + media.getVolume());
        file.println();
        file.flush();
    }
}
