/*
    2017 L&N STEMpunks

    lnstempunks.org

Authors:
    Cade Brown <cade@cade.site>
    Ben Klein <robobenklein@gmail.com>

Website:
    programming.lnstempunks.org (or ln-stempunks.github.io)

 */
package org.usfirst.frc.team3966.robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

import org.usfirst.frc.team3966.robot.subsystems.Drive;
import org.usfirst.frc.team3966.robot.commands.TankDrive;
import org.usfirst.frc.team3966.robot.commands.StopDrive;
import org.usfirst.frc.team3966.robot.values.IDs;
import org.usfirst.frc.team3966.robot.hardware.PS4Controller;

/**
 * Do not rename this file. It is auto generated, and used to run the robot.
 *
 * The class declaration should look like this:
 *
 * public class Robot extends IterativeRobot {
 *
 */
public class Robot extends IterativeModule {
    
    public static Logger logger;


    public static final Drive drive = new Drive();
    public static final PS4Controller controller = new PS4Controller(IDs.controller);

    Command autonomousCommand;
    Command teleopCommand;


    public String getModuleName() {
        return "VexBox";
    }

    public String getModuleVersion() {
        return "0.0.1";
    }
    
    
    public void robotInit() {
        logger = new Logger(getModuleName() + " v" + getModuleVersion(), Logger.ATTR_DEFAULT);
        logger.info("Logger online");
        
        // instantiate the command used for the autonomous period
        teleopCommand = new TankDrive();

        // stay still during autonomous
        autonomousCommand = new StopDrive();
    }    

    /*
    
        These functions are called right before autonomous/teleop
    
    */
    
    public void disabledInit() {

    }
    
    public void autonomousInit() {
        logger.info("Autonomous mode");
        if (autonomousCommand != null) {
            autonomousCommand.start();
        }
    }
    
    public void teleopInit() {
        logger.info("Teleop mode");
        if (autonomousCommand != null) {
            autonomousCommand.cancel();
        }

        if (teleopCommand != null) {
            teleopCommand.start();
        }
    }
    
    /**
     * This function is called periodically during autonomous/teleop
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        drive.stop();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
