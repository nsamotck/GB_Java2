package ru.gb.lesson2;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private static int labourWeek = 40;
    private static int labourDay = 8;

    public static int getWorkingHours(DayOfWeek day) {
        if (day == SATURDAY || day == SUNDAY) {
            return 0;
        } else {
            return labourWeek - (labourDay * day.ordinal());
        }
    }

    DayOfWeek() {
    }


}
