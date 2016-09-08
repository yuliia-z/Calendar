package com.company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar Calendar_IL = new Calendar();
        Calendar_IL.Calendar(LocalDate.now());
        Calendar_IL.writeDays();
        Calendar_IL.Calendar(LocalDate.of(2016, 10, 10));
        Calendar_IL.writeDays();
    }
}