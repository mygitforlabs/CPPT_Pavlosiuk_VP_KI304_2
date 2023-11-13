package KI304.Pavlosiuk.Lab2;

/**
 * This class represents the media controls for a device, including volume control,
 * screen brightness, and headphones status.
 * 
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public class Media {
    private int volume;
    private int screenBrightness;
    private boolean headphonesStatus;

    /**
     * Default constructor
     * 
     * Initializes a Media object with default volume, screen brightness, and headphones status.
     */
    public Media() {
        volume = 10;
        screenBrightness = 5;
        headphonesStatus = false;
    }

    /**
     * Constructor with specified volume and screen brightness
     * 
     * Initializes a Media object with specified volume and screen brightness.
     * Headphones status is set to false by default.
     * 
     * @param newVolume           Initial volume
     * @param newScreenBrightness Initial screen brightness
     */
    public Media(int newVolume, int newScreenBrightness) {
        volume = newVolume;
        screenBrightness = newScreenBrightness;
        headphonesStatus = false;
    }

    /**
     * Set the volume level.
     * 
     * @param vol New volume level
     */
    public void setVolume(int vol) {
        volume = vol;
    }

    /**
     * Get the current volume level.
     * 
     * @return Current volume level
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Set the screen brightness level.
     * 
     * @param sB New screen brightness level
     */
    public void setScreenBrightness(int sB) {
        screenBrightness = sB;
    }

    /**
     * Get the current screen brightness level.
     * 
     * @return Current screen brightness level
     */
    public int getScreenBrightness() {
        return screenBrightness;
    }

    /**
     * Get the status of the headphones (connected or disconnected).
     * 
     * @return True if headphones are connected, false otherwise
     */
    public boolean getHeadphonesStatus() {
        return headphonesStatus;
    }

    /**
     * Connect headphones.
     * 
     * Sets the headphones status to true, indicating that headphones are connected.
     */
    public void connectHeadphones() {
        headphonesStatus = true;
    }

    /**
     * Disconnect headphones.
     * 
     * Sets the headphones status to false, indicating that headphones are disconnected.
     */
    public void disconnectHeadphones() {
        headphonesStatus = false;
    }
}
