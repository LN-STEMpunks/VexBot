import wpilib
from wpilib.joystick import Joystick
from wpilib.buttons.joystickbutton import JoystickButton

class Controller(Joystick):

    def getAxis(self, id):
        return self.getRawAxis(id)
