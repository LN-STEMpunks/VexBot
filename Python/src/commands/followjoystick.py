
from wpilib.command import Command

import subsystems

class FollowJoystick(Command):
    '''
    This command will read the joystick's y axis and use that value to control
    the speed of the SingleMotor subsystem.
    '''

    def __init__(self):
        super().__init__('Follow Joystick')

        self.requires(subsystems.motor)


    def execute(self):
        subsystems.motor.tank(subsystems.oi.joystick.getRawAxis(subsystems.oi.lstick), subsystems.oi.joystick.getRawAxis(subsystems.oi.rstick))
