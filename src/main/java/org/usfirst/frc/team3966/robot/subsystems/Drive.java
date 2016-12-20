
package org.usfirst.frc.team3966.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3966.robot.commands.TankDrive;
import org.usfirst.frc.team3966.robot.RobotMap;
import org.usfirst.frc.team3966.robot.subsystems.DriveMotor;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * Drive subsystem, controls left and right motors.
 *
 * Supplies methods for controlling the drive by various functions.
 * The motors objects should not be directly set from any other place.
 */
public class Drive extends Subsystem {

  private static RobotMap robotMap = new RobotMap();

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static SpeedController leftmotorf = new DriveMotor(robotMap.leftmotorpinf);
  private static SpeedController leftmotorb = new DriveMotor(robotMap.leftmotorpinb);
  private static SpeedController rightmotorf = new DriveMotor(robotMap.rightmotorpinf);
  private static SpeedController rightmotorb = new DriveMotor(robotMap.rightmotorpinb);

  //RobotDrive robotdrive = RobotMap.robotdrive;

  public void doNothing() {
    rightmotorf.set(0);
    rightmotorb.set(0);
    leftmotorf.set(0);
    leftmotorb.set(0);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void TankDrive(double rightmotorspeed, double leftmotorspeed) {
    rightmotorf.set(rightmotorspeed);
    rightmotorb.set(rightmotorspeed);
    leftmotorf.set(leftmotorspeed);
    leftmotorb.set(leftmotorspeed);
  }
}
