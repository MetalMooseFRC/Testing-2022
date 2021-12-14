// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.DriveTrain;




/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);


  // ************  OI Controller  ***************
  private static final Joystick driverStick = new Joystick(Constants.DRIVER_STICK_PORT);


  // ************  SubSystems  ***************
  private DriveTrain m_driveTrain = new DriveTrain();


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    // ************  Set Default Commands  ***************

    m_driveTrain.setDefaultCommand(new ArcadeDrive(
      () -> applyJoystickDeadband(-driverStick.getY()) * Constants.JOYSTICK_SPEED_FACTOR,
      () -> applyJoystickDeadband(driverStick.getZ()) * Constants.JOYSTICK_TURN_FACTOR,
      m_driveTrain));
    
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
   // return m_autoCommand;
 // }

      


  //Allow for dead areas on the joystick
  public double applyJoystickDeadband(double originalValue) {
    //zero small inputs
    if (Math.abs(originalValue) < Constants.MIN_JOYSTICK_INPUT) return 0;

    //scale larger inputs to maintain smoothness
    if (originalValue < 0) return originalValue + Constants.MIN_JOYSTICK_INPUT;
    return originalValue - Constants.MIN_JOYSTICK_INPUT;
  }



}
