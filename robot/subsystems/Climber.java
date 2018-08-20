package org.usfirst.frc.team6947.robot.subsystems;

import org.usfirst.frc.team6947.robot.Robot;
import org.usfirst.frc.team6947.robot.RobotMap;
import org.usfirst.frc.team6947.robot.commands.MoveShooterObject;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 *
 */
public class Climber extends Subsystem {

    private static Victor climber;	    
    public Climber(){
    	climber = new Victor(RobotMap.CLIMBER);
    }
  
    public void initDefaultCommand() {
    }
    public void driveByJoystick(){
    	climber.set(-Robot.oi.joystick2.getRawAxis(1));
    }

}

