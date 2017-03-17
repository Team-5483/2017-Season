
package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.autonomous.DoNothing;
import org.usfirst.frc.team5483.robot.subsystems.BallBrush;
import org.usfirst.frc.team5483.robot.subsystems.BallShooter;
import org.usfirst.frc.team5483.robot.subsystems.Chassis;
import org.usfirst.frc.team5483.robot.subsystems.Climber;
import org.usfirst.frc.team5483.robot.subsystems.GearSystem;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	public static Chassis chassis;
	public static Climber climber;
	public static BallBrush ballBrush;
	public static BallShooter ballShooter;
	public static GearSystem gearSystem;
	
	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	@Override
	public void robotInit() {
		chassis = new Chassis();
		climber = new Climber();
		ballBrush = new BallBrush();
		ballShooter = new BallShooter();
		gearSystem = new GearSystem();
		new CameraReceiver().start();
		oi = new OI();
		
		SmartDashboard.putData(chassis);
		SmartDashboard.putData(climber);
		SmartDashboard.putData(ballBrush);
		SmartDashboard.putData(ballShooter);
		SmartDashboard.putData(gearSystem);
		
		chooser.addDefault("Do Nothing", new DoNothing());
		SmartDashboard.putData("Auto mode", chooser);
		
		log();
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
//		autonomousCommand = chooser.getSelected();
//		autonomousCommand = new TestEncoders();

		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
	
	private void log() {
		chassis.log();
		ballBrush.log();
		ballShooter.log();
	}
}
