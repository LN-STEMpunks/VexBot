package org.usfirst.frc.team3966.robot.hardware;

import edu.wpi.first.wpilibj.Solenoid;

/**
 * Creates PCM (baseclass Solenoid)
 * @author cade
 */
public class PCM extends Solenoid {

    public PCM(int node, int portnumber) {
        super(node, portnumber);
        this.set(false);
    }
    
    public void enable() {
        this.set(true);
    }
    
    public void disable() {
        this.set(false);
    }
    
}
