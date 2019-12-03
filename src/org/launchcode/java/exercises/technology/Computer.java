//package org.launchcode.java.exercises.technology;
//
//public class Computer {
//
//    // FIELDS & PROPERTIES
//
//    private int batteryPercentage; // percentage
//    private boolean hasPower;
//    private boolean isCharging;
//
//    private double usageRate = 0.166667; // percent lost per minute
//    private int minutesRemaining = 600;
//
//    // CONSTRUCTOR
//
//    public Computer(int batteryPercentage, boolean hasPower, boolean isCharging) {
//        this.batteryPercentage = 100;
//        this.hasPower = true;
//        this.isCharging = false;
//    }
//
//    // GETTERS & SETTERS
//
//    public boolean hasPower() {
//        return hasPower;
//    }
//
//    public void setHasPower(boolean hasPower) {
//        this.hasPower = hasPower;
//    }
//
//    public boolean isCharging() {
//        return isCharging;
//    }
//
//    public void setCharging(boolean charging) {
//        isCharging = charging;
//    }
//
//    public int getBatteryPercentage() {
//        return batteryPercentage;
//    }
//
//    public void setBatteryPercentage(int batteryPercentage) {
//        this.batteryPercentage = batteryPercentage;
//    }
//
//    public double getUsageRate() {
//        return usageRate;
//    }
//
//    public void setUsageRate(double usageRate) {
//        this.usageRate = usageRate;
//    }
//
//    public int getMinutesRemaining() {
//        return minutesRemaining;
//    }
//
//    public void setMinutesRemaining(int minutesRemaining) {
//        this.minutesRemaining = minutesRemaining;
//    }
//
//    // METHODS
//
//    public String use(minutesNeeded) {
//        String message;
//        usageRate = calculateUsageRate();
//        minutesRemaining = batteryPercentage / usageRate;
//        if (hasPower && minutesNeeded <= minutesRemaining) {
//            minutesRemaining -= minutesNeeded;
//            batteryPercentage -= minutesNeeded * usageRate;
//            message = "After using device, your battery is at " +
//                    batteryPercentage + " and you now have " +
//                    minutesRemaining + " minutes remaining.";
//            if (minutesRemaining == 0) { //
//                hasPower = false;
//                batteryPercentage = 0;
//            }
//        } else if (hasPower) {
//            message = "You only had " + minutesRemaining +
//                    " and you are now out of power.";
//            hasPower = false;
//            minutesRemaining = 0;
//            batteryPercentage = 0;
//        } else {
//            message = "Sorry - device needs to be charged first.";
//        }
//        return message;
//    }
//
//}
