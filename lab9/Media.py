class Media:
    def __init__(self, volume=10, screenBrightness=5):
        self.__volume = volume
        self.__screenBrightness = screenBrightness
        self.__headphonesStatus = False

    def setVolume(self, vol):
        self.__volume = vol

    def getVolume(self):
        return self.__volume

    def setScreenBrightness(self, sB):
        self.__screenBrightness = sB

    def getScreenBrightness(self):
        return self.__screenBrightness

    def getHeadphonesStatus(self):
        return self.__headphonesStatus

    def connectHeadphones(self):
        self.__headphonesStatus = True

    def disconnectHeadphones(self):
        self.__headphonesStatus = False

# Example usage of the class:
# mediaInstance = Media()
# print(mediaInstance.getVolume())
# print(mediaInstance.getScreenBrightness())
# print(mediaInstance.getHeadphonesStatus())
# mediaInstance.connectHeadphones()
# print(mediaInstance.getHeadphonesStatus())
# mediaInstance.disconnectHeadphones()
# print(mediaInstance.getHeadphonesStatus())
