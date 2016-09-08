package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ColorOfDays {
    private static String colorForCurrentDay = "\033[36m";
    private static String colorForWeekend = "\033[31m";
    private static String colorForWorkDays = "\033[37m";

    private static boolean isWeekend(DayOfWeek getDayOfMonth) {
        return (getDayOfMonth == DayOfWeek.SATURDAY || getDayOfMonth == DayOfWeek.SUNDAY);
    }

    private static boolean isCurrentDay(int numberOfDay, LocalDate date) {
        return date.getDayOfMonth() == numberOfDay;
    }

    public static String colorForDayInWeek(int numberOfDay, LocalDate date) {
        DayOfWeek getDayOfMonth = DayOfWeek.from(date.withDayOfMonth(numberOfDay));
        if (isCurrentDay(numberOfDay, date)) {
            return colorForCurrentDay + numberOfDay;
        } else {
            if (isWeekend(getDayOfMonth)) {
                return colorForWeekend + numberOfDay;
            } else {
                return colorForWorkDays + numberOfDay;
            }
        }
    }
}

