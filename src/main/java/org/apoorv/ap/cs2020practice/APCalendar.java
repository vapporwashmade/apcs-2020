package org.apoorv.ap.cs2020practice;

public class APCalendar {
    public static int numberOfLeapYears(int year1, int year2) {
        // check precondition: 0 <= year1 <= year2
        int numOfLeapYears = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                numOfLeapYears++;
            }
        }
        return numOfLeapYears;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int dayOfFirstDay = firstDayOfYear(year);
        int dayOfTheYear = dayOfYear(month, day, year);
        int daysPastFirstDay = dayOfTheYear % 7;
        return (dayOfFirstDay + daysPastFirstDay) % 7;
    }
}
