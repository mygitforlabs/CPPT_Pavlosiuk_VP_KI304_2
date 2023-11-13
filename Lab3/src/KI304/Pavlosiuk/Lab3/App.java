package KI304.Pavlosiuk.Lab3;

import java.io.FileNotFoundException;

/**
 * Implementation of Lab2
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */
public class App 
{
	  /**
     * Entry point of the application
     * @param args Not used
     */
	public static void main(String[] args) throws FileNotFoundException
	{
    	MobilePhone phone = new MobilePhone();
    	phone.turnOn();
    	phone.unlockScreen();
    	phone.setScreenBrightness(3);
    	phone.setVolume(5);
    	phone.makeCall("+380-XX-XXX-XXXX");
    	phone.connectWifi();
    	phone.openApp(2);
    	phone.closeApp(2);
    	phone.connectBluetooth();
    	phone.setVolume(10);
    	phone.openApp(3); 
    	phone.closeApp(3);
    	phone.openApp(0);
    	phone.disconnectBluetooth();
    	phone.disconnectWifi();
    	phone.lockScreen();   
    	phone.unlockScreen();
    	phone.connectWifi();
    	phone.videoCall("+380-XX-XXX-XXXX");
    	phone.turnOnCamera();
    	phone.unmuteMic();
    	phone.endVideoCall();
    	
    }
}