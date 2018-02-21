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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class LongArm extends Subsystem {

	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController longArmMotorVictorSP1 = RobotMap.longArmLongArmMotorVictorSP1;
    private final SpeedController longArmMotorVictorSP2 = RobotMap.longArmLongArmMotorVictorSP2;
    private final SpeedController longArmMotorVictorSP3 = RobotMap.longArmLongArmMotorVictorSP3;
    private final SpeedController longArmMotorVictorSP4 = RobotMap.longArmLongArmMotorVictorSP4;
    private final SpeedController longArmMotorVictorSP5 = RobotMap.longArmLongArmMotorVictorSP5;
    private final SpeedController longArmMotorVictorSP6 = RobotMap.longArmLongArmMotorVictorSP6;
    private final DigitalInput longArmEncoder = RobotMap.longArmLongArmEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    	private int position;
    	private boolean encoderPrevious;
    	double speed;
    
    public LongArm() {
    		position = 0;
    		encoderPrevious = false;
    		speed = 0.0;
    	}
    	
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        setDefaultCommand(new ManualLongArm());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    		boolean encoderFlag = longArmEncoder.get();
    		SmartDashboard.putBoolean("encoderFlag", encoderFlag);
    		if(encoderFlag ^ encoderPrevious){
    			if(speed > 0.0) {
    				position++;
    			} else {
    				position--;
    			}
    			encoderPrevious = encoderFlag;
    		}

    		longArmMotorVictorSP1.set(-speed);
    		longArmMotorVictorSP2.set(-speed);
    		longArmMotorVictorSP3.set(-speed);
    		longArmMotorVictorSP4.set(-speed);
    		longArmMotorVictorSP5.set(-speed);
    		longArmMotorVictorSP6.set(-speed);
    		
    		SmartDashboard.putNumber("LongArm Position", position);
}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

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