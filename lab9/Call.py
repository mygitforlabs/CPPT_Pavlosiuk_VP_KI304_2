import random

class Call:
    def __init__(self, phoneNumber = "+380-xx-xxx-xxxx" , isInCall = False, callDuration = 0):
        self.__phoneNumber = phoneNumber
        self.__isInCall = isInCall
        self.__callDuration = callDuration

    def makeCall(self, phone_number):
        self.__phoneNumber = phone_number
        self.__isInCall = True

    def endCall(self):
        self.__isInCall = False
        self.__callDuration = random.randint(0, 60)

    def getPhoneNumber(self):
        return self.__phoneNumber

    def getCallStatus(self):
        return self.__isInCall

    def getCallDuration(self):
        return self.__callDuration

# Example usage of the class:
# callInstance = Call()
# callInstance.makeCall("+123-456-7890")
# print(callInstance.getPhoneNumber())
# print(callInstance.getCallStatus())
# callInstance.endCall()
# print(callInstance.getCallDuration())
