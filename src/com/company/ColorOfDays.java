package com.company;

public class ColorOfDays {
    private static String colorForCurrentDay = "\033[36m";
    private static String colorForWeekend = "\033[31m";
    private static String colorForWorkDays = "\033[37m";

    public static String getColorForCurrentDay() {
        return colorForCurrentDay;
    }

    public static String getColorForWeekend() {
        return colorForWeekend;
    }

    public static String getColorForWorkDays() {
        return colorForWorkDays;
    }
}

