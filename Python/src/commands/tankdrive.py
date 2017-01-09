"""

Tank drive, using controllers

"""


from wpilib.command import Command

import subsystems
from values import ps4buttons

class TankDrive(Command):

    def __init__(self):
        super().__init__('TankDrive')

        self.requires(subsystems.drive)


    def execute(self):
        subsystems.drive.tank(subsystems.oi.joystick.getAxis(ps4buttons.STICK_LEFT_Y_AXIS), subsystems.oi.joystick.getAxis(ps4buttons.STICK_RIGHT_Y_AXIS))
