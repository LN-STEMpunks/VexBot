package org.usfirst.frc.team3966.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import org.usfirst.frc.team3966.robot.RobotMap;

/**
 *
 * @author cade
 */
public class PCM extends Solenoid {

    // 
    public PCM(int portnumber) {
        // Constructor takes (nodeid, portnumber)
        super(RobotMap.pcmnodeid, portnumber);
        this.set(false);
    }

    public PCM(int nodeid, int portnumber) {
        // Constructor takes (nodeid, portnumber)
        super(nodeid, portnumber);
        this.set(false);
    }

}
