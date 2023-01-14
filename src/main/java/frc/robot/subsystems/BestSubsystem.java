// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BestSubsystem extends SubsystemBase {

CANSparkMax motor3 = new CANSparkMax(5, MotorType.kBrushless);

  /** Creates a new BestSubsystem. */
  public BestSubsystem() {}

  public void setCurrentLimit() {
    motor3.setSmartCurrentLimit(100);
    motor3.burnFlash();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Motor ID", motor3.getDeviceId());
    SmartDashboard.putNumber("Motor Bus Voltage", motor3.getBusVoltage());
  }
}
