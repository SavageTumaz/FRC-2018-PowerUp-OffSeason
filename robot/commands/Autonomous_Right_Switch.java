package org.usfirst.frc.team6947.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Autonomous_Right_Switch extends CommandGroup {
    	String gameData =  DriverStation.getInstance().getGameSpecificMessage();
    public Autonomous_Right_Switch() {
		addSequential(new AutoStart());
    	if(gameData.charAt(0) == 'R') {
    		SmartDashboard.setDefaultString("Autonomous Status: ", "Aiming for Right Scale");
    		addSequential(new DriveForwardByTime(4000));
    		
    	}else {
    		SmartDashboard.setDefaultString("Autonomous Status: ", "Aiming for the Auto-Line");
    		addParallel(new DriveByDistance(0.4, 11));
    	}
    	
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
