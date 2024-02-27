// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int       TITAN_ID                         = 0; 

    //Motors and wheels
    public static final double    wheelRadius                      = 5; //mm

    public static final double    pulsePerRevorlution              = 1440;
    public static final double    gearRatio                        = 1/1;
    public static final double    wheelPulseRatio                  = pulsePerRevorlution * gearRatio;
    
    public static final double    WHEEL_DIST_PER_TICK              = (Math.PI * 2 * wheelRadius) / wheelPulseRatio;


    //Servo
    public static final int       DIF_SERVO                        = 0;

    public static final double    pulleyRadius                     = 7.85; //mm
    public static final double    pulsePerRevElevator              = 1440;
    public static final double    elevatorGearRatio                = 1.0/2.0;
    public static final double    pulleyPulseWheelRatio            = pulsePerRevElevator * elevatorGearRatio;

    public static final double    ELEVATOR_DIST_TICK               = (Math.PI * 2 * pulleyRadius) / pulleyPulseWheelRatio;

    public final class Directions {
        public static final int FRW = 0;            
        public static final int BACK = 1;            
        public static final int LEFT = 2;        
        public static final int RIGHT = 3;        
    }
}
