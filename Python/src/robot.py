#!/usr/bin/env python3


"""

Our robot! (in python)

To deploy, run 

python robot.py deploy

Or, to simulate:

python robot.py sim

If you are another team, delete .deploy_cfg

"""

import wpilib
from commandbased import CommandBasedRobot

import subsystems

from commands.tankdrive import TankDrive
from commands.autonomous import Autonomous


class Robot(CommandBasedRobot):

    def getModuleName(self):
        return "VexBot"

    def getVersion(self):
        return "0.0.0-py"

    def robotInit(self):
        subsystems.init()

        self.teleopCommand = TankDrive()
        self.autonomousCommand = Autonomous()


    def autonomousInit(self):
        self.autonomousCommand.cancel()
        self.autonomousCommand.start()

    def teleopInit(self):
        self.autonomousCommand.cancel()
        self.teleopCommand.start()


if __name__ == '__main__':
    wpilib.run(Robot)
