// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {

  private final DriveTrain m_driveTrain;
  private Double speed;
  private Double turn;


  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(Double speed, Double turn, DriveTrain driveTrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    
    m_driveTrain = driveTrain;
    addRequirements(m_driveTrain);

    this.speed = speed;
    this.turn = turn;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
    m_driveTrain.drive.arcadeDrive(speed, turn, true);

  }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
