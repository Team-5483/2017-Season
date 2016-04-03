package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	
	protected static Chassis chassis;
	
	public CommandBase() {
        super();
    }
	
	public CommandBase(String name) {
        super(name);
    }
	
	public static void init() {
		chassis = new Chassis();
    }
}
