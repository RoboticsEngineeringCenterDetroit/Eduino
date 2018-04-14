// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4680.Eduino.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 */
public class PlaceCubeOnSwitch extends CommandGroup {

    public PlaceCubeOnSwitch() {
    		addSequential(new FlipWrist(), 2);
    		//causes the wrist to flop down after moving forwards then backwards
    		addSequential(new LongArmPosition(LongArmPosition.SWITCH_HEIGHT), 3);
    		//arm raises to height to be over the scale
    		//addSequential(new DriveDeltaXY(36.0, 0.0));
    		//Robot moves forward enough to avoid hitting the cubes
    		addSequential(new StrafeToSwitch(90),3);
    		//Robot moves left or right 
    		addSequential(new DriveDeltaXY(60.0, 0.0),3);
    		//drives forward to make up the distance and approach cube to prepare drop
    		addSequential(new GrabberOpen());
    		//releases cube
    }

}
