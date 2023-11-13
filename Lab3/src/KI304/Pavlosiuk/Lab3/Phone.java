package KI304.Pavlosiuk.Lab3;

import java.io.PrintWriter;

/** 
 * This class represents a Phone with integrated functionality for calls, smart features, and media controls.
 * It logs various actions to a file named "Log.txt".
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public abstract class Phone {
	protected Call call;
	protected Smart smart;
	protected Media media;

	protected boolean isEnabled;
	protected PrintWriter file;
	
	abstract public void turnOn();
    abstract public void turnOff();

  
    /**
     * Initiates a call, logs the action, ends the call, and logs the call duration.
     * 
     * @param pN Phone number to call
     */
    public void makeCall(String pN) {
        call.makeCall(pN);
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
