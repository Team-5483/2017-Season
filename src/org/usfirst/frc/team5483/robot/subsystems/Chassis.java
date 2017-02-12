package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.commands.DualStickDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {
	
	private static final Spark frontLeftController = new Spark(0);
	private static final Spark frontRightController = new Spark(2);
	private static final Spark rearLeftController = new Spark(3);
	private static final Spark rearRightController = new Spark(4);
	
	private static final Talon middleController = new Talon(5);
	
	private static final RobotDrive robotDrive = new RobotDrive(frontLeftController, rearLeftController,
			frontRightController, rearRightController);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DualStickDrive());
	}
	
	public void tankDrive(Joystick left, Joystick right) {
		robotDrive.tankDrive(left, right);
	}
	
	public void tankDrive(double left, double right) {
		robotDrive.tankDrive(left, right);
	}
	
	//someone write me
	public void tankHDrive(double left, double right, double rot) {
		robotDrive.tankDrive(left, right);
	}
	
	public void middleDrive(double x) {
		middleController.set(x);
	}

}
