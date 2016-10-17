package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.CommandBase;
import org.usfirst.frc.team5483.robot.commands.XboxTeleopDrive;
import org.usfirst.frc.team5483.robot.commands.autonomous.DoNothing;
import org.usfirst.frc.team5483.robot.commands.autonomous.OverDefence;
import org.usfirst.frc.team5483.robot.commands.autonomous.Shake;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {
	
    private Command selectedAuto;

    public void robotInit() {
	CommandBase.init();
		
	DriverStation.init();
		
	DriverStation.addDefaultAutoMode("Do Nothing", new DoNothing());
	DriverStation.addAutoMode("3 Second Cross", new OverDefence());
		
	selectedAuto = new Shake();
    }

    public void autonomousInit() {
	selectedAuto = (Command) DriverStation.getChoosenAutoCommand();
	selectedAuto.start();
    }

    public void autonomousPeriodic() {
    	Scheduler.getInstance().run();
    }
    
    public void teleopInit() {
    	if(selectedAuto != null) { selectedAuto.cancel(); }
    	Scheduler.getInstance().add(new XboxTeleopDrive());
    }

    public void teleopPeriodic() {
    	Scheduler.getInstance().run();
    }
    
    public void disabledInit(){
    }
	
    public void disabledPeriodic() {
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
