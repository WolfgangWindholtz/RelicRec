package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by wolfie on 9/23/17.
 */

public class AutoTestPath extends Processor{

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        faceImage();
        checkVu();
        go(-20,-20);
    }
}
