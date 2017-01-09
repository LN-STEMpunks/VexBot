
from wpilib.command.subsystem import Subsystem
from wpilib.joystick import Joystick
from wpilib.buttons.joystickbutton import JoystickButton

class OI(Subsystem):
    '''Handles joystick (operator input) interaction with the commands.'''

    def __init__(self):
        '''
        Assign commands to button actions, and publish your joysticks so you
        can read values from them later.
        '''

        super().__init__('OI')

        self.joystick = Joystick(0)

        self.lstick = 1
        self.rstick = 5
