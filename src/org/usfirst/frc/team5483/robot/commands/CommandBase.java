package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.subsystems.Chassis;
import org.usfirst.frc.team5483.robot.subsystems.PneumaticsTestBed;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	
	protected double speedModifierY = 1.0;
	protected double speedModifierX = 0.5;
	
	//SUBSYSTEMS//
	protected static Chassis chassis;
	
	protected static PneumaticsTestBed testSubsystem;
	//////////////
	
	public CommandBase() {
        super();
    }
	
	public CommandBase(String name) {
        super(name);
    }
	
	public static void init() {
		chassis = new Chassis();
		testSubsystem = new PneumaticsTestBed();
    }
}
