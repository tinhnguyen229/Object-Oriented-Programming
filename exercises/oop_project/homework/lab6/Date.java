package oop_project.homework.lab6;

public class Date {
    private int year;
    private int month;
    private int day;
    public static final String [] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    public static final int [] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int [] DAYS_IN_MONTHS_LEAP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String [] DAYS = {"Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int newYear, int newMonth, int newDay) {
        this.year = newYear;
        this.month = newMonth;
        this.day = newDay;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public int getYear() {
        return this.year;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public int getDay() {
        return this.day;
    }

    public boolean isLeapYear() {
        if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0) {
			return true;
        } 
        return false;
    }

    public boolean isValidDate() {
        if ((this.year >= 1 && this.year <= 9999) 
            && (this.month >= 1 && this.month <= 12) 
            && (this.day >= 1 && this.day <= 31)) 
        {
            if (this.isLeapYear()) {
                if (1 <= this.day && this.day <= DAYS_IN_MONTHS_LEAP[this.month - 1]) return true;
                return false;
            } else {
                if (1 <= this.day && this.day <= DAYS_IN_MONTHS[this.month - 1]) return true;
                return false;
            }
        }
        return false;
    }

    public int getDayOfWeek() {
        final int [] e = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}; 
        int newYear = this.year;
        int newMon = this.month;
        int newDay = this.day;
        if (newMon < 3) {
            newYear--;
        }
        return ((newYear + (newYear / 4) - (newYear / 100) 
                + (newYear / 400) + e[newMon - 1] + newDay)) % 7;
    }

    public Date nextDay() {
        this.day++;
        if (this.isLeapYear()) {
            if (this.day > DAYS_IN_MONTHS_LEAP[this.month -1]) {
                this.month++;
                this.day = 1;
                if (this.month > 12) {
                    this.year++;
                    this.month = 1;
                }
            }
        } else {
            if (this.day > DAYS_IN_MONTHS[this.month -1]) {
                this.month++;
                this.day = 1;
                if (this.month > 12) {
                    this.year++;
                    this.month = 1;
                }
            }
        }
        return this;
    }

    public Date nextMonth() {
        this.month++;
        if (this.month > 12) {
            this.year++;
            this.month = 1;
        }
        return this;
    }

    public Date nextYear() {
        this.year++;
        if (this.isLeapYear()) {
            this.day = DAYS_IN_MONTHS_LEAP[this.month - 1];
        }
        this.day = DAYS_IN_MONTHS[this.month - 1];
        return this;
    }

    public Date previousDay() {
        this.day--;
        if (this.isLeapYear()) {
            if (this.day < 1) {
                this.month--;
                if (this.month < 1) {
                    this.year--;
                    this.month = 12;
                }
                this.day = DAYS_IN_MONTHS_LEAP[this.month - 1];
            }
        } else {
            if (this.day < 1) {
                this.month--;
                if (this.month < 1) {
                    this.year--;
                    this.month = 12;
                }
                this.day = DAYS_IN_MONTHS[this.month - 1];
            }
        }
        return this;
    }

    public Date previousMonth() {
        this.month--;
        if (this.month < 1) {
            this.year--;
            this.month = 12;
        }
        return this;
    }

    public Date previousYear() {
        this.year--;
        if (this.isLeapYear()) {
            this.day = DAYS_IN_MONTHS_LEAP[this.month - 1];
        }
        this.day = DAYS_IN_MONTHS[this.month - 1];
        return this;
    }

    public String toString() {
        if (this.isValidDate()) {
            return String.format("%s %d %s %d", DAYS[this.getDayOfWeek()], this.day, MONTHS[this.month - 1], this.year);
        } else {
            return "Invalid date!";
        }
    }
}
