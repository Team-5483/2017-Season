package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;
import org.usfirst.frc.team5483.robot.commands.XboxTeleopDrive;
import org.usfirst.frc.team5483.robot.toolbox.Settings;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class Chassis extends Subsystem {
	
	private RobotDrive robotDrive;
	private Talon frontLeftMotor;
	private Talon frontRightMotor;
	private Spark backLeftMotor;
	private Spark backRightMotor;
	
	private Gyro gyro;
	
	private Encoder leftEncoder;
	private Encoder rightEncoder;
	private final double RIGHT_ENCOCDER_TO_DISTANCE_RATIO = (3.5 * Math.PI) / (12.0 * 256.0);
	private final double LEFT_ENCOCDER_TO_DISTANCE_RATIO = (3.5 * Math.PI) / (12.0 * 256.0);
	
	public Chassis() {
		frontLeftMotor = new Talon(RobotMap.FRONT_LEFT_MOTOR);
		frontRightMotor = new Talon(RobotMap.FRONT_RIGHT_MOTOR);
		backLeftMotor = new Spark(RobotMap.BACK_LEFT_MOTOR);
		backRightMotor = new Spark(RobotMap.BACK_RIGHT_MOTOR);
		
		frontLeftMotor.setSafetyEnabled(false);
		backLeftMotor.setSafetyEnabled(false);
		frontRightMotor.setSafetyEnabled(false);
		backRightMotor.setSafetyEnabled(false);
		
		robotDrive = new RobotDrive(frontLeftMotor, backLeftMotor, 
									frontRightMotor, backRightMotor);
		robotDrive.setSafetyEnabled(false);
		
		if(Settings.useGyro) {
			gyro = new AnalogGyro(RobotMap.GYRO);
			gyro.reset();
			gyro.calibrate();
		}
		
		if(Settings.useEncoders) {
			//leftEncoder = new Encoder(RobotMap.LEFT_ENCODER_PORT_A, RobotMap.LEFT_ENCODER_PORT_B, false, Encoder.EncodingType.k4X);
			//rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_PORT_A, RobotMap.RIGHT_ENCODER_PORT_B, false, Encoder.EncodingType.k4X);
		}
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new XboxTeleopDrive());
	}
	
	public void drive(double y, double x) {
		robotDrive.drive(y, x);
	}
	
	public void driveWithEncoders() {
		
	}
	
	public void driveWithGyro(double y, double x) {
		this.drive(y, x - gyro.getAngle());
	}
	
	public void driveHalfSpeed(double y, double x) {
		this.drive(y / 2, x);
	}
	
	public void driveHalfTurn(double y, double x) {
		this.drive(y, x / 2);
	}
	
	public void driveHalf(double y, double x) {
		this.drive(y / 2, x / 2);
	}
	
	//Encoders
	public double getLeftEncoderDistanceInFeet() {
		return leftEncoder.get() * LEFT_ENCOCDER_TO_DISTANCE_RATIO;
	}
	
	public double getRightEncoderDistanceInFeet() {
		return rightEncoder.get() * RIGHT_ENCOCDER_TO_DISTANCE_RATIO;
	}
	
	public double getAverageDistance() {
		return (getLeftEncoderDistanceInFeet() + getRightEncoderDistanceInFeet()) / 2.0;
	}
	
	public void resetLeftEncoder() {
		leftEncoder.reset();
	}
	
	public void resetRightEncoder() {
		rightEncoder.reset();
	}
	
	public void resetEncoders() {
		leftEncoder.reset();
		rightEncoder.reset();
	}
	
	//Gyro
	public void resetGyro() {
		gyro.reset();
	}
	
	public void calibrateGyro() {
		gyro.calibrate();
	}
	
	public double getGyroAngle() {
		return gyro.getAngle();
	}

}
