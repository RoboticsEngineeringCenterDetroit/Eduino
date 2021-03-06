// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4680.Eduino;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveTrainCANTalonFrontRight;
    public static WPI_TalonSRX driveTrainCANTalonFrontLeft;
    public static WPI_TalonSRX driveTrainCANTalonBackRight;
    public static WPI_TalonSRX driveTrainCANTalonBackLeft;
    public static MecanumDrive driveTrainMecanumDrive1;
    public static ADXRS450_Gyro driveTrainGyro;
    public static DigitalInput driveTrainFrontBumperContactSwitch;
    public static SpeedController longArmLongArmMotorVictorSP1;
    public static SpeedController longArmLongArmMotorVictorSP2;
    public static SpeedController longArmLongArmMotorVictorSP3;
    public static SpeedController longArmLongArmMotorVictorSP4;
    public static SpeedController longArmLongArmMotorVictorSP5;
    public static SpeedController longArmLongArmMotorVictorSP6;
    
    public static DigitalInput longArmLongArmEncoder;
    public static DigitalInput longArmEncoderDirectionInput;
    public static DigitalOutput longArmEncoderDirectionOutput;
    public static DigitalInput longArmlowerLimitSwitch;
    
    public static DoubleSolenoid grabberGrabberValve;
    public static DigitalInput grabberCubeIsInPlaceSwitch;
    public static DigitalInput climberClimberLimitSwitch;
    public static SpeedController climberClimberMotorVictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainCANTalonFrontRight = new WPI_TalonSRX(4);
        LiveWindow.addActuator("DriveTrain", "CANTalonFrontRight", driveTrainCANTalonFrontRight);
        
        driveTrainCANTalonFrontLeft = new WPI_TalonSRX(1);
        LiveWindow.addActuator("DriveTrain", "CANTalonFrontLeft", driveTrainCANTalonFrontLeft);
        
        driveTrainCANTalonBackRight = new WPI_TalonSRX(2);
        LiveWindow.addActuator("DriveTrain", "CANTalonBackRight", driveTrainCANTalonBackRight);
        
        driveTrainCANTalonBackLeft = new WPI_TalonSRX(3);
        LiveWindow.addActuator("DriveTrain", "CANTalonBackLeft", driveTrainCANTalonBackLeft);
        
        driveTrainMecanumDrive1 = new MecanumDrive(driveTrainCANTalonFrontLeft, driveTrainCANTalonBackLeft,
              driveTrainCANTalonFrontRight, driveTrainCANTalonBackRight);
        LiveWindow.addActuator("DriveTrain", "Mecanum Drive 1", driveTrainMecanumDrive1);
        driveTrainMecanumDrive1.setSafetyEnabled(true);
        driveTrainMecanumDrive1.setExpiration(0.1);
        driveTrainMecanumDrive1.setMaxOutput(1.0);

        driveTrainGyro = new ADXRS450_Gyro();
        LiveWindow.addSensor("DriveTrain", "Gyro ", driveTrainGyro);
        driveTrainFrontBumperContactSwitch = new DigitalInput(0);
        LiveWindow.addSensor("DriveTrain", "FrontBumperContactSwitch", driveTrainFrontBumperContactSwitch);
        
        longArmLongArmMotorVictorSP1 = new VictorSP(1);
        longArmLongArmMotorVictorSP2 = new VictorSP(2);
        longArmLongArmMotorVictorSP3 = new VictorSP(3);
        longArmLongArmMotorVictorSP4 = new VictorSP(4);
        longArmLongArmMotorVictorSP5 = new VictorSP(5);
        longArmLongArmMotorVictorSP6 = new VictorSP(6);
        longArmLongArmEncoder = new DigitalInput(5);
        longArmEncoderDirectionInput = new DigitalInput(10);
        longArmEncoderDirectionOutput = new DigitalOutput(11);
        grabberGrabberValve = new DoubleSolenoid(0, 1);
        LiveWindow.add(grabberGrabberValve);
        grabberCubeIsInPlaceSwitch = new DigitalInput(1);
        longArmlowerLimitSwitch = new DigitalInput(7);
        
        climberClimberLimitSwitch = new DigitalInput(2);
        LiveWindow.addSensor("Climber", "ClimberLimitSwitch", climberClimberLimitSwitch);
        
        climberClimberMotorVictorSP = new VictorSP(0);
        LiveWindow.addActuator("Climber", "ClimberMotorVictorSP", (VictorSP) climberClimberMotorVictorSP);
        climberClimberMotorVictorSP.setInverted(false);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
