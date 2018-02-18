package org.usfirst.frc4680.Eduino.commands;

import org.usfirst.frc4680.Eduino.Robot;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class LongArmPosition extends PIDCommand {
	
    public LongArmPosition(int target) {
    		super("PIDCommand1", 1.0, 0.0, 0.0, 0.02);
        getPIDController().setContinuous(false);
        getPIDController().setAbsoluteTolerance(5.0);
        getPIDController().setOutputRange(-1.0, 1.0);
        getPIDController().setSetpoint((double) target);
        
        requires(Robot.longArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return getPIDController().onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    		getPIDController().disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	@Override
	protected double returnPIDInput() {
		return (double) Robot.longArm.getPosition();
	}

	@Override
	protected void usePIDOutput(double output) {
		Robot.longArm.move(output);
	}
}