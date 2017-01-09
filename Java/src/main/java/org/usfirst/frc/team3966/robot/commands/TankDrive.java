package org.usfirst.frc.team3966.robot.commands;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3966.robot.Robot;

/**
 *
 */
public class TankDrive extends BaseCommand {

    public TankDrive() {
        super(Robot.drive);
    }

    protected void execute() {
        Robot.drive.drive(Robot.controller.getLeftStickY(), Robot.controller.getRightStickY());

        if (Robot.controller.getCircleButton()) {
            Robot.drive.enablePCM();
        } else if (Robot.controller.getXButton()) {
            Robot.drive.disablePCM();
        }
    }
}
