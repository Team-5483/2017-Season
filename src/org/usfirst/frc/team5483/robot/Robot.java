
package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.autonomous.DoNothing;
import org.usfirst.frc.team5483.robot.subsystems.BallGrabber;
import org.usfirst.frc.team5483.robot.subsystems.BallShooter;
import org.usfirst.frc.team5483.robot.subsystems.Chassis;
import org.usfirst.frc.team5483.robot.subsystems.Climber;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	public static Chassis chassis;
	public static Climber climber;
	public static BallGrabber ballGrabber;
	public static BallShooter ballShooter;
	
	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	@Override
	public void robotInit() {
		chassis = new Chassis();
		climber = new Climber();
		ballGrabber = new BallGrabber();
		ballShooter = new BallShooter();
		
		oi = new OI();
		
		SmartDashboard.putData(chassis);
		SmartDashboard.putData(climber);
		SmartDashboard.putData(ballGrabber);
		SmartDashboard.putData(ballShooter);
		
		chooser.addDefault("Do Nothing", new DoNothing());
		//chooser.addObject("My Auto", new MyAutoCommand());
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
		autonomousCommand = chooser.getSelected();

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
		ballGrabber.log();
		ballShooter.log();
	}
}
