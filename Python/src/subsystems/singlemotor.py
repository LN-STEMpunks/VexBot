
import wpilib
from wpilib.command.subsystem import Subsystem

from commands.followjoystick import FollowJoystick

class SingleMotor(Subsystem):
    '''
    This example subsystem controls a single CAN Talon SRX in PercentVBus mode.
    '''

    def __init__(self):
        '''Instantiates the motor object.'''

        super().__init__('SingleMotor')


        self.LB = wpilib.Talon(3)
        self.LF = wpilib.Talon(0)

        self.RB = wpilib.Talon(2)
        self.RF = wpilib.Talon(1)


    def tank(self, ls, rs):
        self.LB.set(ls)
        self.LF.set(ls)

        self.RB.set(-rs)
        self.RF.set(-rs)


    def initDefaultCommand(self):
        self.setDefaultCommand(FollowJoystick())
