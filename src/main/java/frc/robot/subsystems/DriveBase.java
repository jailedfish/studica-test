package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import com.studica.frc.TitanQuad;
import com.studica.frc.TitanQuadEncoder;

import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveBase extends SubsystemBase {
    //Motors
    private TitanQuad leftMotor;
    private TitanQuad rightMotor;
    private TitanQuad backMotor;

    private TitanQuadEncoder leftEncoder;
    private TitanQuadEncoder rightEncoder;
    private TitanQuadEncoder backEncoder;

    private AHRS navx;

    public DriveBase () {
        leftMotor = new TitanQuad(Constants.TITAN_ID, 3);
        rightMotor = new TitanQuad(Constants.TITAN_ID, 0);
        backMotor = new TitanQuad(Constants.TITAN_ID, 1);

        leftEncoder = new TitanQuadEncoder(leftMotor, 3, Constants.WHEEL_DIST_PER_TICK);
        rightEncoder = new TitanQuadEncoder(rightMotor, 0, Constants.WHEEL_DIST_PER_TICK);
        backEncoder = new TitanQuadEncoder(backMotor, 1, Constants.WHEEL_DIST_PER_TICK);

        navx = new AHRS(Port.kMXP);   
    }


    public void setBackMotorSpeed(double speed) {
        backMotor.set(speed);
    }

    public double getBackMotorSpeed() {
        return backMotor.get();
    }

    public void setRightMotorSpeed(double speed) {
        rightMotor.set(speed);
    }

    public double getRightMotorSpeed() {
        return rightMotor.get();
    }

    public void setLeftMotorSpeed(double speed) {
        leftMotor.set(speed);
    }

    public double getLeftMotorSpeed() {
        return leftMotor.get();
    }

    public double getYaw() {
        return navx.getYaw();
    }

    public void setSpeeds(double left_motor, double right_motor, double back_motor) {
        leftMotor.set(left_motor);
        rightMotor.set(right_motor);
        backMotor.set(back_motor);
    }

    public double getLeftEncoderDist() {
        return leftEncoder.getEncoderDistance();
    }

    public double getRightEncoderDist() {
        return rightEncoder.getEncoderDistance();
    }

    public double getBackEncoderDist() {
        return backEncoder.getEncoderDistance();
    }

    public double getForvardDist() {
        return (getLeftEncoderDist() + getRightEncoderDist()) / 2;
    }

    public void resetAll() {
        leftEncoder.reset();
        rightEncoder.reset();
        backEncoder.reset();

        navx.zeroYaw();
    }
    public void stop() {
        setSpeeds(0, 0, 0);
    }
}