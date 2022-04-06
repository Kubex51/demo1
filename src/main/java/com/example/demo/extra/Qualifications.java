package com.example.demo.extra;

public class Qualifications {

    public enum YachtQualifications{
        NONE,
        INLAND_SKIPPER,
        YACHT_SKIPPER,
        YACHT_MASTER,
    }
    public enum MotorboatQualifications{
        NONE,
        MOTORBOAT_HELMSMAN,
        MOTORBOAT_SKIPPER,
        MOTORBOAT_MASTER,
    }

    private YachtQualifications yachtQualifications;
    private MotorboatQualifications motorboatQualifications;

    public YachtQualifications getYachtQualifications() {
        return yachtQualifications;
    }

    public void setYachtQualifications(YachtQualifications yachtQualifications) {
        this.yachtQualifications = yachtQualifications;
    }

    public MotorboatQualifications getMotorboatQualifications() {
        return motorboatQualifications; 
    }

    public void setMotorboatQualifications(MotorboatQualifications motorboatQualifications) {
        this.motorboatQualifications = motorboatQualifications;
    }

    public Qualifications(YachtQualifications yachtQualifications, MotorboatQualifications motorboatQualifications) {
        this.yachtQualifications = yachtQualifications;
        this.motorboatQualifications = motorboatQualifications;
    }
}
