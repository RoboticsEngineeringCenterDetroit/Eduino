// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4680.Eduino.subsystems;

import org.usfirst.frc4680.Eduino.RobotMap;
import org.usfirst.frc4680.Eduino.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Wrist extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController wristMotorVictorSP8 = RobotMap.wristWristMotorVictorSP8;
    private final SpeedController wristMotorVictorSP9 = RobotMap.wristWristMotorVictorSP9;
    private final DigitalInput wristEncoder = RobotMap.wristWristEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    private int position;
	private boolean encoderPrevious;
	double speed;

	public Wrist() {
		position = 0;
		encoderPrevious = false;
		speed = 0.0;
	}

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }


    public void periodic() {
		boolean encoderFlag = wristEncoder.get();
		SmartDashboard.putBoolean("WristEncoderFlag", encoderFlag);
		if(encoderFlag ^ encoderPrevious){
			position += Math.signum(speed);
			encoderPrevious = encoderFlag;
		}

    		wristMotorVictorSP8.set(speed);
    		wristMotorVictorSP9.set(speed);
    		
    		SmartDashboard.putNumber("Wrist Position", position);
    	}
    
    public void move(double commandSpeed){
		speed = commandSpeed;
	}
	
        
	public void stop() {
			speed = 0.0;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}

}

