package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by wolfie on 9/15/17.
 */
@TeleOp(name = "XbadTele", group = "X")
public class Tele extends OpMode{
    Map robot = new Map();
    double xpow;
    double ypow;
    double zpow;
    double rightx;

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
        zpow = gamepad1.right_stick_x;//direction not actually
        ypow = -gamepad1.left_stick_y;// variable names are incoorect
        xpow = gamepad1.left_stick_x;

        robot.motorLF.setPower(ypow-xpow-zpow);
        robot.motorRF.setPower(-ypow-xpow-zpow);
        robot.motorRB.setPower(ypow+xpow-zpow);
        robot.motorLB.setPower(-ypow+xpow-zpow);

    }
}

