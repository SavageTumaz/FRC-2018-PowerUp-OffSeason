package org.usfirst.frc.team6947.robot.commands;

import org.usfirst.frc.team6947.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class EjectBlockByTime extends Command {
	private double power;
	private long Time;
	private long startTime;
    public EjectBlockByTime(double power, long Time) {
    	requires(Robot.shooter);
    	this.power = power;
    	this.Time = Time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		SmartDashboard.putString("Running Commend : ", "EjectBlock");
		startTime = System.currentTimeMillis();
//-----------------------------------------------------------------------
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(System.currentTimeMillis() < (Time + startTime)) {
    		Robot.shooter.eject(power);
    	}
    		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
		Robot.shooter.eject(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
