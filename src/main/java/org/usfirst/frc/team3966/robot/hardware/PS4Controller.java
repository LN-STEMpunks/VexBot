package org.usfirst.frc.team3966.robot.hardware;


import edu.wpi.first.wpilibj.Joystick;
import static org.usfirst.frc.team3966.robot.values.PS4Buttons.*;

/**
 * PS4 controller wrapper for a joystick.
 * @author Matthew.Lythgoe
 */
public class PS4Controller extends Joystick {
    
    
    public PS4Controller(int port) {
        super(port);
    }
    
    public double getRightStickX() {
        return getRawAxis(STICK_RIGHT_X_AXIS);
    }

    public double getRightStickY() {
        return getRawAxis(STICK_RIGHT_Y_AXIS);
    }

    public double getLeftStickX() {
        return getRawAxis(STICK_LEFT_X_AXIS);
    }

    public double getLeftStickY() {
        return getRawAxis(STICK_LEFT_Y_AXIS);
    }
    
    public double getDPadX() {
        return getRawAxis(D_PAD_X_AXIS);
    }

    public double getDPadY() {
        return getRawAxis(D_PAD_Y_AXIS);
    }
    
    public double getRightTrigger() {
        return getRawAxis(R_TRIGGER_AXIS);
    }
    
    public double getLeftTrigger() {
        return getRawAxis(L_TRIGGER_AXIS);
    }

    
    public boolean getSquareButton() {
        return getRawButton(SQUARE);
    }

    public boolean getXButton() {
        return getRawButton(X);
    }

    public boolean getCircleButton() {
        return getRawButton(CIRCLE);
    }

    public boolean getTriangleButton() {
        return getRawButton(TRIANGLE);
    }
 
    /*
    
        R&L 1&2 are labeled on the controller, and are triggers and bumpers
    
    */
    
    public boolean getR1Button() {
        return getRawButton(R1);
    }

    public boolean getL1Button() {
        return getRawButton(L1);
    }

    public boolean getR2Button() {
        return getRawButton(R2);
    }

    public boolean getL2Button() {
        return getRawButton(L2);
    }

    /*
    
       R3 and L3 are pressing the Right and Left sticks down.
    
    */
    
    public boolean getR3Button() {
        return getRawButton(R3);
    }

    public boolean getL3Button() {
        return getRawButton(L3);
    }
    
 
    public boolean getShareButton() {
        return getRawButton(SHARE);
    }

    public boolean getOptionsButton() {
        return getRawButton(OPTIONS);
    } 
    
    // this is the button with a playstation button
    public boolean getPSButton() {
        return getRawButton(PS);
    }

    // touch pad in middle
    public boolean getPadButton() {
        return getRawButton(TOUCH_PAD);
    }
}
