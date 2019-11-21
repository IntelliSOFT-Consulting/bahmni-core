package org.bahmni.module.bahmnicore.contract.patient.data;

public class PatientStatus {
    private Boolean lost_to_follow_up;
    private int days;

    public Boolean getLost_to_follow_up() {
        return lost_to_follow_up;
    }

    public void setLost_to_follow_up(Boolean lost_to_follow_up) {
        this.lost_to_follow_up = lost_to_follow_up;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
