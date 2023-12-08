# MobilePhone.py
import random
from Phone import Phone

class MobilePhone(Phone):
    def __init__(self, pN="+380 99 999 9999", callStatus=False, newNumber="+380 99 999 9999",
                 callDuration=0, wifiStatus=False, bluetoothStatus=False, volume=10, screenBrightness=5):
        super().__init__(phoneNumber=pN, isInCall=callStatus, callDuration=callDuration,
                         volume=volume, screenBrightness=screenBrightness,
                         newWifiStatus=wifiStatus, newBluetoothStatus=bluetoothStatus)
        self.camStatus = False
        self.micStatus = False

    def turnOn(self):
        super().turnOn()
        print("MobilePhone is ON!")
        print()

    def turnOff(self):
        super().turnOff()
        print("MobilePhone is OFF!")
        print()

    def getCamStatus(self):
        return self.camStatus

    def getMicStatus(self):
        return self.micStatus

    def videoCall(self, number):
        print("Video call to " + number + " _   _   _   _   _   _   _   _ Already in a call!")
        print("Camera: " + str(self.getCamStatus()))
        print("Microphone: " + str(self.getMicStatus()))
        print()

    def endVideoCall(self):
        duration = random.randint(0, 60)
        print("The video call ended!")
        print("Duration: " + str(duration))
        print()

    def muteMic(self):
        self.micStatus = False
        print("Microphone: " + str(self.getMicStatus()))
        print()

    def unmuteMic(self):
        self.micStatus = True
        print("Microphone: " + str(self.getMicStatus()))
        print()

    def turnOffCamera(self):
        self.camStatus = False
        print("Camera: " + str(self.getCamStatus()))
        print()

    def turnOnCamera(self):
        self.camStatus = True
        print("Camera: " + str(self.getCamStatus()))
        print()
