package org.usfirst.frc.team5483.robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriverStation {
	private static SendableChooser autoChooser;
	
	public static void init() {
		autoChooser = new SendableChooser();
	}
	
	public static void addDefaultAutoMode(String name, Command command) {
		autoChooser.addDefault(name, command);
	}
	
	public static void addAutoMode(String name, Command command) {
		autoChooser.addObject(name, command);
	}
	
	public static void addTeleopCommand(String name, Command command) {
		SmartDashboard.putData(name, command);
	}
	
	public static void addNumber(String name, int value) {
		SmartDashboard.putNumber(name, value);
	}
	
	public static void addBoolean(String name, boolean value) {
		SmartDashboard.putBoolean(name, value);
	}
	
	public static void addString(String name, String value) {
		SmartDashboard.putString(name, value);
	}
	
	public static Object getChoosenAutoCommand() {
		return autoChooser.getSelected();
	}
}
