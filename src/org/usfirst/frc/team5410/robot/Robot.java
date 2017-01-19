package org.usfirst.frc.team5410.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



import com.ctre.CANTalon;













public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	
	//Global Variables for use within other methods
	private static CANTalon Motor1 = new CANTalon(1);	//Motor 1 which is connected to ...
	private static CANTalon Motor2 = new CANTalon(2);
	private static CANTalon Motor3 = new CANTalon(3);
	private static CANTalon Motor4 = new CANTalon(4);
	private static CANTalon Motor5 = new CANTalon(5);
	private static CANTalon Motor6 = new CANTalon(6);
	private static CANTalon Motor7 = new CANTalon(7);
	private static CANTalon Motor8 = new CANTalon(8);
	private static CANTalon Motor9 = new CANTalon(9);
	private static Joystick Joystick1 = new Joystick(0);
	
	
	
	
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		
	}

	
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	
	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}

	
	@Override
	public void teleopPeriodic() {
		
		Motor1.set(Joystick1.getY());
		Motor2.set(-Joystick1.getY());
	}

	
	@Override
	public void testPeriodic() {
	}
	
	
	public void teleopinit()
	{
		
	}
	
}

