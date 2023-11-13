package KI304.Pavlosiuk.Lab3;


/** 
 * This class represents a Smart device with features such as app management, screen lock,
 * WiFi, and Bluetooth connectivity.
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public class Smart {
    
    /**
     * Enum representing different apps on the Smart device.
     */
    enum Apps {
        MAIN_PAGE, YOUTUBE, TIKTOK, SPOTIFY
    };

    private Apps app;
    private boolean isLocked;
    private boolean wifiStatus;
    private boolean bluetoothStatus;

    /**
     * Default constructor
     * 
     * Initializes a Smart object with default values.
     */
    public Smart() {
        app = Apps.MAIN_PAGE;
        isLocked = false;
        wifiStatus = false;
        bluetoothStatus = false;
    }
    /**
     * Constructor for the Smart class.
     * Initializes a Smart object with the specified WiFi and Bluetooth statuses.
     *
     * @param newWifiStatus       The initial WiFi status of the Smart device.
     *                            True if WiFi is connected, false otherwise.
     * @param newBluetoothStatus  The initial Bluetooth status of the Smart device.
     *                            True if Bluetooth is connected, false otherwise.
     */
    public Smart(boolean newWifiStatus, boolean newBluetoothStatus) {
        app = Apps.MAIN_PAGE;
        isLocked = false;
        wifiStatus = newWifiStatus;
        bluetoothStatus = newBluetoothStatus;
    }
    /**
     * Get the currently opened app.
     * 
     * @return The currently opened app
     */
    public Apps getOpenedApp() {
        return app;
    }

    /**
     * Check if the screen is locked.
     * 
     * @return True if the screen is locked, false otherwise
     */
    public boolean getIsLocked() {
        return isLocked;
    }

    /**
     * Check the Bluetooth connectivity status.
     * 
     * @return True if Bluetooth is connected, false otherwise
     */
    public boolean getBluetoothStatus() {
        return bluetoothStatus;
    }

    /**
     * Open an app by index.
     * 
     * @param appIndex Index of the app to open
     * @return A message indicating whether the app was opened successfully or not
     */
    public String openApp(int appIndex) {
        if (wifiStatus) {
            if (appIndex < 0) {
                appIndex = 0;
            } else if (appIndex > 3) {
                appIndex = 3;
            }
            app = Apps.values()[appIndex];
            return app + " opened successfully";
        }
        return app + " not opened";
    }

    /**
     * Close the currently opened app.
     * 
     * @return A message indicating that the app was closed successfully
     */
    public String closeApp(int appIndex) {
        app = Apps.values()[appIndex];
        return app + " closed successfully";
    }

    /**
     * Lock the device screen.
     */
    public void lockScreen() {
        isLocked = true;
    }

    /**
     * Unlock the device screen.
     */
    public void unlockScreen() {
        isLocked = false;
    }

    /**
     * Connect to WiFi.
     */
    public void connectWifi() {
        wifiStatus = true;
    }

    /**
     * Disconnect from WiFi.
     */
    public void disconnectWifi() {
        wifiStatus = false;
    }

    /**
     * Connect to Bluetooth.
     */
    public void connectBluetooth() {
        bluetoothStatus = true;
    }

    /**
     * Disconnect from Bluetooth.
     */
    public void disconnectBluetooth() {
        bluetoothStatus = false;
    }
}
