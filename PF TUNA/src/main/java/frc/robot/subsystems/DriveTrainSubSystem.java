/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
//import frc.robot.commands.DriveTrainCommand;



/**
 * Add your docs here.
**/
public class DriveTrainSubSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark L_Spark = new Spark(RobotMap.L_MDRIVE);
  Spark R_Spark = new Spark(RobotMap.R_MDRIVE);
  public DifferentialDrive m_drive = new DifferentialDrive(L_Spark, R_Spark);
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

}
