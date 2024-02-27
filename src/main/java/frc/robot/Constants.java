/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int TITAN_ID = 0;    

    //Motors
    public static final double wheelRadius = 5;
    public static final double pulsesPerRevolution = 1440;
    public static final double gearRatio = 1/1;
    public static final double wheelPulseRatio = pulsesPerRevolution * gearRatio;
    public static final double WHEEL_DIST_PER_TICK = (Math.PI * 2 * wheelRadius) / wheelPulseRatio;

    //Servos
    public static final int DIF_SERVO = 0;
    public static final double pulleyRadius = 7.85; //mm
    public static final double pulsesPerRevElevator = 1440;
    public static final double gearRatioElevator = 1.0/2.0;
    public static final double pulleyPulseWheelRatio = pulsesPerRevElevator * gearRatioElevator;
    public static final double ELEWATOR_DIST_PER_TICK = (Math.PI * 2 * pulleyRadius) / pulleyPulseWheelRatio;

    public final class Direction {
        public static final int FRW = 0;
        public static final int BCK = 1;
        public static final int LFT = 2;
        public static final int RGH = 3;
    }
}
