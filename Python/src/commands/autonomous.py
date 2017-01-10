"""

Autonomous program

"""


from wpilib.command.commandgroup import CommandGroup

from wpilib.command.waitcommand import WaitCommand

import subsystems
from commands.tankdrivetimed import TankDriveTimed

class Autonomous(CommandGroup):

    def __init__(self):
        super().__init__('Autonomous Program')
        pw = .25
        tm = 1
        # circle pattern
        self.addSequential(TankDriveTimed(pw, pw, tm))
        self.addSequential(TankDriveTimed(-pw, pw, tm))
        self.addSequential(TankDriveTimed(pw, pw, tm))
        self.addSequential(TankDriveTimed(-pw, pw, tm))
        self.addSequential(TankDriveTimed(pw, pw, tm))
        self.addSequential(TankDriveTimed(-pw, pw, tm))
        self.addSequential(TankDriveTimed(pw, pw, tm))
        self.addSequential(TankDriveTimed(-pw, pw, tm))
