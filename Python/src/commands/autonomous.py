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
        pw = .45
        tm = 6
        # circle pattern
        self.addSequential(TankDriveTimed(-pw/2, pw, tm))
