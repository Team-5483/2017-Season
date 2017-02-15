package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;
import org.usfirst.frc.team5483.robot.commands.DualStickDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {
	
	private static Talon frontLeftController;
	private static Talon frontRightController;
	private static Talon rearLeftController;
	private static Talon rearRightController;
	
	private static Spark middleController;
	
	private static RobotDrive robotDrive;
	
	private static Encoder leftEncoder;
	private static Encoder rightEncoder;

	public Chassis() {
		frontLeftController = new Talon(RobotMap.lFrontMotor);
		frontRightController = new Talon(RobotMap.rFrontMotor);
		rearLeftController = new Talon(RobotMap.lRearMotor);
		rearRightController = new Talon(RobotMap.rRearMotor);
		
		middleController = new Spark(RobotMap.mWheelMotor);
		
		robotDrive = new RobotDrive(frontLeftController, rearLeftController,
				frontRightController, rearRightController);
		
		leftEncoder = new Encoder(RobotMap.lEncoderA, RobotMap.lEncoderB, 
								false, Encoder.EncodingType.k4X);
		rightEncoder = new Encoder(RobotMap.rEncoderA, RobotMap.rEncoderB, 
								false, Encoder.EncodingType.k4X);
		setupEncoders();
		
	}
	
	public void tankDrive(double left, double right) {
		robotDrive.tankDrive(left, right);
	}
	
	public void middleDrive(double x) {
		middleController.set(x);
	}
	
	private void setupEncoders() {
		leftEncoder.setMaxPeriod(.1);
		leftEncoder.setMinRate(10);
		leftEncoder.setDistancePerPulse(5);
		leftEncoder.setReverseDirection(true);
		leftEncoder.setSamplesToAverage(7);
		leftEncoder.reset();
		
		rightEncoder.setMaxPeriod(.1);
		rightEncoder.setMinRate(10);
		rightEncoder.setDistancePerPulse(5);
		rightEncoder.setReverseDirection(true);
		rightEncoder.setSamplesToAverage(7);
		rightEncoder.reset();
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DualStickDrive());
	}
	
	public Encoder getLeftEncoder() {
		return leftEncoder;
	}
	
	public Encoder getRightEncoder() {
		return leftEncoder;
	}
	
	public void resetLeftEncoder() {
		leftEncoder.reset();
	}
	
	public void resetRightEncoder() {
		rightEncoder.reset();
	}

}
