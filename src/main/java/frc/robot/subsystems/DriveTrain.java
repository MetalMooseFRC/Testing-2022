// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
// NavX
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.I2C.Port;

// Motors
=======
<<<<<<< Updated upstream
=======
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream
=======
// NavX
//import com.kauailabs.navx.frc.AHRS;
//import edu.wpi.first.wpilibj.I2C.Port;

// Motors
>>>>>>> Stashed changes
>>>>>>> Stashed changes
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// Basic
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

// import navX
import com.kauailabs.navx.frc.AHRS;

public class DriveTrain extends SubsystemBase {

  // NavX for orientation / gyroscope measurements
 // private AHRS navx = new AHRS(Port.kMXP);

  //Wheel Motors
  private final CANSparkMax m_motorLeft1 = new CANSparkMax(Constants.MOTOR_LEFT_1_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final CANSparkMax m_motorLeft2 = new CANSparkMax(Constants.MOTOR_LEFT_2_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final CANSparkMax m_motorLeft3 = new CANSparkMax(Constants.MOTOR_LEFT_3_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final SpeedControllerGroup m_motorsLeft = new SpeedControllerGroup(m_motorLeft1, m_motorLeft2, m_motorLeft3);

  private final CANSparkMax m_motorRight1 = new CANSparkMax(Constants.MOTOR_RIGHT_1_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final CANSparkMax m_motorRight2 = new CANSparkMax(Constants.MOTOR_RIGHT_2_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final CANSparkMax m_motorRight3 = new CANSparkMax(Constants.MOTOR_RIGHT_3_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final SpeedControllerGroup m_motorsRight = new SpeedControllerGroup(m_motorRight1, m_motorRight2, m_motorRight3);
  
  public final DifferentialDrive drive = new DifferentialDrive(m_motorsLeft, m_motorsRight);

 
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    // We don't want to set the motors as inverted. 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
   /** Gyro methods */

   /*
  //get angle ranging from 0 to 360
  public double getHeading() {
    return navx.getYaw();
  }
  public double getAngle() {
    return navx.getAngle();
  }
  //zero heading
  public void resetHeading() {
    navx.reset();
  } */
}
