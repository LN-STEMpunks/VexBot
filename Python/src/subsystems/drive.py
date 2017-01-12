
import wpilib
from wpilib.command.subsystem import Subsystem
from wpilib.compressor import Compressor
#from wpilib.solenoid import Solenoid
from wpilib.doublesolenoid import DoubleSolenoid
from commands.tankdrive import TankDrive

from hardware import motor
from values import ids

class Drive(Subsystem):

    def __init__(self):
        super().__init__('Drive')

        # TODO: Change these to another data type which handles any number of motors

        self.LEFT_TRACK = [motor.Motor(ids.LB_motor), motor.Motor(ids.LF_motor)]
        self.RIGHT_TRACK = [motor.Motor(ids.RB_motor), motor.Motor(ids.RF_motor)]

        for MOTOR in self.RIGHT_TRACK:
            MOTOR.setInverted(True)

        #self.pcm0 = Solenoid(ids.PCM_pin0)  
        #self.pcm1 = Solenoid(ids.PCM_pin1)

        #self.pcm = DoubleSolenoid(ids.PCM_pin0, ids.PCM_pin1)
        #self.pcm = None
        #self.pcm.set(False)

    def tank(self, ls, rs):
        for LM in self.LEFT_TRACK:
            LM.set(ls)

        for RM in self.RIGHT_TRACK:
            RM.set(rs)

    def enablePCM(self):
        self.pcm.set(2)
        #self.pcm0.set(True)
        #self.pcm1.set(False)

    def disablePCM(self):
        self.pcm.set(1)


