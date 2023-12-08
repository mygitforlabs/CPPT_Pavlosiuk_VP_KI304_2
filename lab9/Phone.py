from Call import Call
from Smart import Smart
from Media import Media

class Phone:
    def __init__(self, phoneNumber="+380-xx-xxx-xxxx", isInCall=False, callDuration=0, 
                 volume=10, screenBrightness=5, newWifiStatus=False, newBluetoothStatus=False):
        self.__call = Call(phoneNumber, isInCall, callDuration)
        self.__smart = Smart(volume, screenBrightness)
        self.__media = Media(newWifiStatus, newBluetoothStatus)
        self.__isEnabled = False

    def turnOn(self):
        self.__isEnabled = True
        print("Phone turned on")
        print()

    def turnOff(self):
        self.__isEnabled = False
        print("Phone turned off")
        print()

    def makeCall(self, phoneNumber):
        self.__call.makeCall(phoneNumber)
        print("You are calling to " + self.__call.getPhoneNumber() + ". Already in a call!")
        self.__call.endCall()
        print("The call ended, duration: " + str(self.__call.getCallDuration()))
        print()

    def openApp(self, appIndex):
        print(self.__smart.openApp(appIndex))
        print()

    def closeApp(self, appIndex):
        print(self.__smart.closeApp(appIndex))
        print()

    def connectWifi(self):
        self.__smart.connectWifi()
        print("WiFi is connected, now you can use apps!")
        print()

    def disconnectWifi(self):
        self.__smart.disconnectWifi()
        print("WiFi is disconnected!")
        print()

    def unlockScreen(self):
        self.__smart.unlockScreen()
        print("Phone is unlocked!")
        print()

    def lockScreen(self):
        self.__smart.lockScreen()
        print("Phone is locked!")
        print()

    def setScreenBrightness(self, brightness):
        self.__media.setScreenBrightness(brightness)
        print(f"Screen brightness is changed to: {self.__media.getScreenBrightness()}")
        print()

    def connectBluetooth(self):
        self.__smart.connectBluetooth()
        print("Bluetooth is connected!")
        if self.__smart.getBluetoothStatus():
            self.__media.connectHeadphones()
        else:
            self.__media.disconnectHeadphones()
            print("Headphones were automatically disconnected!")
        print("Headphones were automatically connected!")
        print()

    def disconnectBluetooth(self):
        self.__smart.disconnectBluetooth()
        print("Bluetooth is disconnected!")
        if self.__smart.getBluetoothStatus():
            self.__media.connectHeadphones()
        else:
            self.__media.disconnectHeadphones()
            print("Headphones were automatically disconnected!")
            print()

    def setVolume(self, volume):
        self.__media.setVolume(volume)
        print(f"Volume is changed to: {self.__media.getVolume()}")
        print()

    def getStatus(self):
        return self.__isEnabled

# Example usage:
# phoneInstance = Phone()
# phoneInstance.turnOn()
# phoneInstance.connectWifi()
# phoneInstance.makeCall("+123-456-7890")
# phoneInstance.setVolume(50)
# print(phoneInstance.getStatus())
