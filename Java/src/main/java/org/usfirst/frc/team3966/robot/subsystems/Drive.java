package org.usfirst.frc.team3966.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DriverStation;
import org.usfirst.frc.team3966.robot.hardware.PCM;
import org.usfirst.frc.team3966.robot.hardware.DriveMotor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3966.robot.commands.TankDrive;
import org.usfirst.frc.team3966.robot.values.IDs;
import org.usfirst.frc.team3966.util.Logger;

/**
 * Drive subsystem, controls left and right motors.
 *
 * Supplies methods for controlling the drive by various functions. The motors
 * objects should not be directly set from any other place.
 */
public class Drive extends Subsystem {
    
    private Logger drive_log;
    
    public Drive() {
        drive_log = new Logger("Drive Subsystem");
    }

    private DriveMotor LB = new DriveMotor(IDs.LB_motor);
    private DriveMotor LF = new DriveMotor(IDs.LF_motor);

    private DriveMotor RB = new DriveMotor(IDs.RB_motor);
    private DriveMotor RF = new DriveMotor(IDs.RF_motor);

    private PCM pcm0 = new PCM(IDs.PCM_node, IDs.PCM_pin0);
    private PCM pcm1 = new PCM(IDs.PCM_node, IDs.PCM_pin1);

    public void initDefaultCommand() {
        RB.setInverted(true);
        RF.setInverted(true);

        pcm0.disable();
        pcm1.enable();

        setDefaultCommand(new TankDrive());
    }

    public void stop() {
        drive(0, 0);
    }
    
    public void drive(double L_speed, double R_speed) {
        LB.set(L_speed);
        LF.set(L_speed);
        
        RB.set(R_speed);
        RF.set(R_speed);
    }
    
    public void enablePCM() {
        pcm0.enable();
        pcm1.disable();
    }

    public void disablePCM() {
        pcm0.disable();
        pcm1.enable();
    }
    
}
