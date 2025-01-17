// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Constants;

/** Add your docs here. */
public class RobotConstants {
    public static final String SHUFFLEBOARD_COMP_TAB_NAME = "COMP";
    // Positive RPM pushes out the note
    // Positive angle movement moves the shooter or intake up

    // Indexer speeds
    public static final double INDEXER_SHOOT_SPEED = 1;
    public static final double INDEXER_IDLE_SPEED = -.1;

    // Intake "state"
    public static final double INTAKE_IntakePivotAngle = 0;
    public static final double INTAKE_ShooterPivotAngle = 0;
    public static final double INTAKE_IntakeSpeed = -1;
    public static final double INTAKE_ShooterRPM = -4000;

    // Stored "state"
    public static final double STORED_ShooterPivotAngle = 0;
    public static final double STORED_IntakePivotAngle = 170;
    public static final double STORED_ShooterRPM = 2000;
    public static final double STORED_IntakeSpeed = 0;

    // Amp "state"
    public static final double AMP_ShooterPivotAngle = 48;
    public static final double AMP_IntakePivotAngle = 0;
    public static final double AMP_ShooterRPM = 2000;
    public static final double AMP_IntakeSpeed = .6;

    // Speaker_SUBWOOF "state"
    public static final double SUBWOOF_ShooterPivotAngle = 55;
    public static final double SUBWOOF_IntakePivotAngle = 35;
    public static final double SUBWOOF_ShooterRPM = 5600;
    public static final double SUBWOOF_IntakeSpeed = 0;

    // Speaker_PODIUM "state"
    public static final double PODIUM_ShooterPivotAngle = 43;
    public static final double PODIUM_IntakePivotAngle = 35;
    public static final double PODIUM_ShooterRPM = 5600;
    public static final double PODIUM_IntakeSpeed = 0;

    // new AMP COMMAND "STATE"
    public static final double NEWAMP_IntakePivotAngle_STAGE1 = 0;
    public static final double NEWAMP_ShooterRPM_STAGE1 = 2000;
    public static final double NEWAMP_IntakeSpeed_STAGE1 = .7;
    public static final double NEWAMP_WaitTime_STAGE1 = .18;

    public static final double NEWAMP_ShooterPivotAngle = 20;
    public static final double NEWAMP_IntakePivotAngle_STAGE2 = 160;
    public static final double NEWAMP_ShooterRPM_STAGE2 = 0;
    public static final double NEWAMP_IntakeSpeed_STAGE2 = 0;

    public static final double NEWAMP_IntakeSpeed_ShootOut = .7;

    public static final double CORRECTHEADING_TOLERANCE_DEGREES = 4;
}
