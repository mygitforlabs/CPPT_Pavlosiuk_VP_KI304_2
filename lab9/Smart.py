from enum import Enum

class Smart:
    class Apps(Enum):
        MAIN_PAGE = 0
        YOUTUBE = 1
        TIKTOK = 2
        SPOTIFY = 3

    def __init__(self, newWifiStatus=False, newBluetoothStatus=False):
        self.__app = self.Apps.MAIN_PAGE
        self.__isLocked = False
        self.__wifiStatus = newWifiStatus
        self.__bluetoothStatus = newBluetoothStatus

    def getOpenedApp(self):
        return self.__app

    def getIsLocked(self):
        return self.__isLocked

    def getBluetoothStatus(self):
        return self.__bluetoothStatus
    def getWifiStatus(self):
        return self.__wifiStatus

    def openApp(self, appIndex):
        if self.__wifiStatus:
            if appIndex < 0:
                appIndex = 0
            elif appIndex > 3:
                appIndex = 3
            self.__app = self.Apps(appIndex)
            return "App " + self.__app.name + " opened successfully"
        return "App " + self.__app.name + " not opened"

    def closeApp(self, appIndex):
        self.__app = self.Apps(appIndex)
        return "App " + self.__app.name + " closed successfully"

    def lockScreen(self):
        self.__isLocked = True

    def unlockScreen(self):
        self.__isLocked = False

    def connectWifi(self):
        self.__wifiStatus = True

    def disconnectWifi(self):
        self.__wifiStatus = False

    def connectBluetooth(self):
        self.__bluetoothStatus = True

    def disconnectBluetooth(self):
        self.__bluetoothStatus = False

# Example usage of the class:
# smartInstance = Smart()
# print(smartInstance.getOpenedApp())
# print(smartInstance.getIsLocked())
# smartInstance.connectWifi()
# print(smartInstance.getBluetoothStatus())
# smartInstance.openApp(Smart.Apps.YOUTUBE)
# print(smartInstance.getOpenedApp())
# smartInstance.lockScreen()
# print(smartInstance.getIsLocked())
# smartInstance.unlockScreen()
# print(smartInstance.getIsLocked())
