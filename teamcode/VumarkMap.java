package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;

/**
 * Created by wolfie on 9/16/17.
 */

public class VumarkMap {
    HardwareMap hwMap = null;


    VuforiaLocalizer vuforia;
    public void init(HardwareMap ahwMap) {

        // save reference to HW Map
        hwMap = ahwMap;

        int cameraMonitorViewId = hwMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hwMap.appContext.getPackageName());
        VuforiaLocalizer.Parameters param = new VuforiaLocalizer.Parameters(cameraMonitorViewId);


        param.vuforiaLicenseKey = "AfbM7ND/////AAAAGUXqRoQRDEkKupX0Zkdd3WhqVs68pW5fggxtJc7rlwOAI1WWfs5J4APPWl3FElqMVRdxwlDg3Rcx2DycCogRQGhyOZ6Gakktkgk22k/vy9q8OGLvDvGQQf6zOW3Qrs4hkn2qDWA4r5pDz3W8Aoh97+RCVTiVstECpe1mp97YGrYc5EeyW68aml6lirGr43motonPrXChztqG/3WpqYfFRFIsc+g+leI/ihWuAA1ZUFDYQjRV94GRl66w31kHcGtm+j2BKUlcQsVPmhizh+396O5r4yGkTcLBAZxyuyGm+lerwPJ9DWrkCiwVOtnCVqLUkfAoAjpuXuXEtW4JTlwqYmKVTuVDIg4Wcm7c8vLEBV/4";

        param.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
        this.vuforia = ClassFactory.createVuforiaLocalizer(param);

    }
}