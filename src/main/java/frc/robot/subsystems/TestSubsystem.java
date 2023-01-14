// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestSubsystem extends SubsystemBase {

  CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushless);

  /** Creates a new TestSubsystem. */
  public TestSubsystem() {}

  public void runMotor() {
    if (motor1.isFollower()) {
      motor1.set(0.5);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Motor Output", motor1.getOutputCurrent());
  }
}
